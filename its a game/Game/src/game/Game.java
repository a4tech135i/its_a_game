/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import Forms.Login;

/**
 *
 * @author Andriy
 */
public class Game {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login frm=new Login();
                frm.setTitle("Логін");
                frm.setVisible(true);
            }
        });
    }
}
