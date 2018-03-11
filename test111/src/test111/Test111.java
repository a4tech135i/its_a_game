/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test111;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Andriy
 */
public class Test111 extends JFrame implements Runnable{
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(new Test111("Test")).start();
    }
    
    public Test111(String name)
    {
        super("Test");
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        final JTextField t1 = new JTextField(10);
        final JButton b1 = new JButton("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b1)
                {
                    sendData(t1.getText());
                }
            }
            
        });
        add(t1);
        add(b1);
        setSize(301,301);
    }
    @Override
    public void run() {
        while(true)
        {
            try {
                connection = new Socket(InetAddress.getByName("127.0.0.1"),11111);
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
            } catch (IOException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
    }
    
    private static void sendData(Object obj)
    {
        try {
            output.flush();
            output.writeObject(obj);
        } catch (IOException ex) {
            Logger.getLogger(Test111.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
