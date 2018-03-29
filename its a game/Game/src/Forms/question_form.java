/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import static Forms.Registration.con;
import static Forms.game_proc.balss;
import game.Question;
import game.SQL;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andriy
 */
public class question_form extends javax.swing.JFrame {
    Question aaa;
    public static Connection con;
    private String url;
    private String user;
    private String password;
    /**
     * Creates new form question_form
     */
    public question_form() throws FileNotFoundException, IOException, ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        SQL ts = (SQL) oin.readObject();
        url = ts.getUrl();
        user = ts.getUser();
        password = ts.getPassword();
    }
    
    public question_form(Question a) {
        FileInputStream fis = null;
        try {
            initComponents();
            aaa = a;
            setLocationRelativeTo(null);
            jTextArea1.setText(aaa.getText());
            fis = new FileInputStream("temp.out");
            ObjectInputStream oin = new ObjectInputStream(fis);
            SQL ts = (SQL) oin.readObject();
            url = ts.getUrl();
            user = ts.getUser();
            password = ts.getPassword();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Дати відповідь");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Питання:");

        jLabel3.setText("Введіть відповідь:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ans = jTextField1.getText().toLowerCase();
        String[] asdg = aaa.getAnswer().split("-");
        boolean as = false;
        for(int i=0;i<asdg.length;i++)
        {
            if(asdg[i].toLowerCase().equals(ans))
            {
                game_proc.balss += aaa.getValue();
                JOptionPane.showMessageDialog(null, "Ви відповіли вірно!");
                this.hide();
                if(game_proc.yksho_1_raund)
                {
                    try {
                        JOptionPane.showMessageDialog(null, "Кількість набраних балів = " + balss+ "\nПак закінчився!");
                        //game_proc.yksho_1_raund=false;
                        game_proc.client.sendMessage("vidpovid-"+game_proc.balss);
                        con = DriverManager.getConnection(url, user, password);
                        PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO record (login, pack, count) VALUES (?, ?, ?)");
                        preparedStatement.setString(1, MainMenu.user.getLogin());
                        preparedStatement.setString(2, game_proc.testTmp.getName());
                        preparedStatement.setString(3, String.valueOf(game_proc.balss));
                        preparedStatement.executeUpdate();
                        
                        return;
                    } catch (SQLException ex) {
                        Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(game_proc.lll)
                {
                    JOptionPane.showMessageDialog(null, "Раунд "+game_proc.tep_raund+"!");
                    game_proc.lll = false;
                }
                as = true;
            }
        }
        if(!as)
        {
            game_proc.balss -= aaa.getValue();
            JOptionPane.showMessageDialog(null, "Відповідь неправильна!");
            this.hide();
            if(game_proc.yksho_1_raund)
            {
                try {
                    JOptionPane.showMessageDialog(null, "Кількість набраних балів = " + balss+ "\nПак закінчився!");
                    //game_proc.yksho_1_raund=false;
                    //game_proc.client.sendMessage("%*"+game_proc.balss);
                    con = DriverManager.getConnection(url, user, password);
                    PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO record (login, pack, count) VALUES (?, ?, ?)");
                    preparedStatement.setString(1, MainMenu.user.getLogin());
                    preparedStatement.setString(2, game_proc.testTmp.getName());
                    preparedStatement.setString(3, String.valueOf(game_proc.balss));
                    preparedStatement.executeUpdate();
                    return;
                } catch (SQLException ex) {
                    Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(game_proc.lll)
            {
                JOptionPane.showMessageDialog(null, "Раунд "+game_proc.tep_raund+"!");
                game_proc.lll = false;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(game_proc.yksho_1_raund)
        {
            try {
                JOptionPane.showMessageDialog(null, "Кількість набраних балів = " + balss+ "\nПак закінчився!");
                con = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO record (login, pack, count) VALUES (?, ?, ?)");
                preparedStatement.setString(1, MainMenu.user.getLogin());
                preparedStatement.setString(2, game_proc.testTmp.getName());
                preparedStatement.setString(3, String.valueOf(game_proc.balss));
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(game_proc.yksho_1_raund)
        {
            try {
                JOptionPane.showMessageDialog(null, "Кількість набраних балів = " + balss+ "\nПак закінчився!");
                con = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO record (login, pack, count) VALUES (?, ?, ?)");
                preparedStatement.setString(1, MainMenu.user.getLogin());
                preparedStatement.setString(2, game_proc.testTmp.getName());
                preparedStatement.setString(3, String.valueOf(game_proc.balss));
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(question_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new question_form().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(question_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
