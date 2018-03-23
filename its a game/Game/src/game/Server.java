/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import Forms.game_proc;
import java.io.BufferedReader;
import java.io.IOException;   
import java.io.InputStreamReader;  
import java.io.PrintWriter; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import client.Constant;


public class Server implements Runnable{
  public List<Connection> connections = 
      Collections.synchronizedList(new ArrayList<Connection>());
  private ServerSocket server;

  public Server() {
  }

  @Override
    public void run() {
        try 
        {
            server = new ServerSocket(Constant.Port,10);
            while (true) {
              Socket socket = server.accept(); 
              Connection con = new Connection(socket);
              connections.add(con);
              con.start();
            }
          } catch (IOException e) {
            e.printStackTrace();
          } finally {
            closeAll();
        }
    }

  private void closeAll() {
    try {
      server.close();
            
      synchronized(connections) {
        Iterator<Connection> iter = connections.iterator();
        while(iter.hasNext()) {
          ((Connection) iter.next()).close();
        }
      }
    } catch (Exception e) {
      System.err.println("Fehler!");
    }
  }

private class Connection extends Thread {
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;
    private String name = "";
    public Connection(Socket socket) {
      this.socket = socket;
      try {
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
      } catch (IOException e) {
        e.printStackTrace();
        close();
      }
    }

    @Override
    public void run() {
      try {
        name = in.readLine();
        synchronized(connections) {
          Iterator<Connection> iter = connections.iterator();
          while(iter.hasNext()) {
            ((Connection) iter.next()).out.println(name + " підключився");
          }
        }
        
        String str = "";
        while (true) {
            str = in.readLine();
            if(str.equals("exit")) break;
            synchronized(connections) {
              Iterator<Connection> iter = connections.iterator();
              while(iter.hasNext()) {
              char a = str.charAt(0);
              if(a == '%')
              {
                  userss j = new userss();
                  String[] words = str.split("*");
                  ((Connection) iter.next()).out.println("Система: Гравець під ніком " + name + " набрав таку кількість балів = "+words[1]);
              }
              else
              {
                  if(str.equals("vidpovid"))
                  {
                      ((Connection) iter.next()).out.println("Система: Гравець під ніком " + name + " хоче відповідати!");
                  }
                  else
                  {
                      ((Connection) iter.next()).out.println(name + ": " + str);
                  }
              }
              }
            }
        }
        
        synchronized(connections) {
          Iterator<Connection> iter = connections.iterator();
          while(iter.hasNext()) {
            ((Connection) iter.next()).out.println(name + " вийшов");
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        close();
      }
    }

    public void close() {
      try {
        in.close();
        out.close();
        socket.close();
        connections.remove(this);
        if (connections.size() == 0) {
          Server.this.closeAll();
          System.exit(0);
        }
      } catch (Exception e) {
        System.err.println("Fehler!");
      }
    }
  }
}

