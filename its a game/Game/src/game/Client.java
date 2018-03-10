package game;

import client.Constant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Client {

    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;
    private String clientName;
    private String ip;
    private Resender resend;
    private javax.swing.JTable outSource;
    
    public Client(){
        
    }
    public Client(String clientName, String ip,javax.swing.JTable outSource) {
        this.clientName = clientName;
        this.ip = ip;
        this.outSource=outSource;
        try {
            socket = new Socket(this.ip, Constant.Port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(this.clientName);

            resend = new Resender();
            resend.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            //close();
        }
    }
    
    public void setClientName(String clientName){
        this.clientName=clientName;
    }  
    public void setIp(String ip){
        this.ip=ip;
    }
    public void setOutSource(javax.swing.JTable outSource){
        this.outSource=outSource;
    }
    
    public void startClient(){
        try {
            socket = new Socket(this.ip, Constant.Port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(this.clientName);

            resend = new Resender();
            resend.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            //close();
        }
    }   
    public boolean sendMessage(String message){
        try{
            out.println(message);
            return true;
        } catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }   
    public void stopClient() {
        resend.setStop();
        close();
    }

    private void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.err.println("Fehler!");
        }
    }

    private class Resender extends Thread {

        private boolean stoped;
        
        public void setStop() {
            stoped = true;
        }
        
        @Override
        public void run() {
            try {
                int i=0;
                while (!stoped) {
                    String message=in.readLine();
                    
                    DefaultTableModel model=(DefaultTableModel) outSource.getModel();
                    Vector row = new Vector();
                    model.addRow(row);
                    outSource.setValueAt(message,i,0);
                    i++;
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
