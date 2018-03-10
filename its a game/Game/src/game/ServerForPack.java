/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ServerForPack implements Runnable
{
    private String test;
    private ServerSocket socketConnection;
    private ObjectOutputStream serverOutputStream;
    private serverKeeper keeper;
    private String TT;
    
    public ServerForPack(String t)
    {        
        /*keeper=new serverKeeper(t);
        keeper.start();*/
        TT = t;
    }
    
    public void stopServer()
    {
        keeper.stopKeeper();
    }

    @Override
    public void run() {
        keeper=new serverKeeper(TT);
        keeper.start();
    }
    
    
    
    public class serverKeeper extends Thread
    {
        String tmp;
        public serverKeeper(String t){tmp=t;}
        
        @Override
        public void run()
        {
            while(true)
            {
                test=tmp;
                try
                {
                    socketConnection = new ServerSocket(11111, 10);
                    Socket pipe = socketConnection.accept();
                    serverOutputStream=new ObjectOutputStream(pipe.getOutputStream());
                    serverOutputStream.writeObject(test);
                    serverOutputStream.close();socketConnection.close();   
                }catch(Exception ex){}
            }
        }
        
        public void stopKeeper()
        {
            try 
            {
                serverOutputStream.close();
                socketConnection.close();
                this.stop();
            } catch (IOException ex) {Logger.getLogger(ServerForPack.class.getName()).log(Level.SEVERE, null, ex);}            
        }
    }
    
}
