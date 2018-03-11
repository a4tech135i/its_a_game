/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andriy
 */
public class Server implements Runnable{
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    static private ServerSocket server;
    @Override
    public void run() {
        try 
        {
            server = new ServerSocket(11111,10);
            while(true)
            {
                connection = server.accept();
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                output.writeObject("Ви прислали: "+ (String)input.readObject());
            }
        } 
        catch (IOException ex) {
        } catch (ClassNotFoundException ex) {}
    }
}

