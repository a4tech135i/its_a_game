/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import game.Question;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import game.Pack;
import java.util.Vector;

/**
 *
 * @author kuchm
 */
public class Constructor extends javax.swing.JFrame {

    boolean isSafe;
    ArrayList<Question> arr = new ArrayList<>();
    String testNameTemp;
    int questionCount;
    String questionTextTemp, themeTemp;
    int NumberQuestion = 0;

    /**
     * Creates new form Constructor
     */
    public Constructor() {
        initComponents();
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        setValue(100);
        changeStance(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Назва паку");

        jLabel2.setText("Тема питання");

        jTextField2.setText("1");
        jTextField2.setEnabled(false);

        jRadioButton1.setText("100");

        jRadioButton2.setText("200");

        jRadioButton3.setText("300");

        jRadioButton4.setText("400");

        jRadioButton5.setText("500");

        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Відповідь");

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Create pack");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Запитання");

        jMenu1.setText("Файл");

        jMenuItem1.setText("Новий");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Завантажити");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Зберегти");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4)
                        .addComponent(jRadioButton5)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Integer.parseInt(jTextField2.getText()) == 1) {
            return;
        }
        arr.set(NumberQuestion - 1, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        NumberQuestion = Integer.parseInt(jTextField2.getText()) - 1;
        jTextField2.setText(NumberQuestion + "");
        showQuestion(NumberQuestion - 1);
        isSafe = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private int getValue() {
        if (jRadioButton1.isSelected()) {
            return 100;
        } else if (jRadioButton2.isSelected()) {
            return 200;
        } else if (jRadioButton3.isSelected()) {
            return 300;
        } else if (jRadioButton4.isSelected()) {
            return 400;
        } else {
            return 500;
        }
    }

    void changeStance(boolean x) {
        jLabel2.setEnabled(x);
        jLabel2.setEnabled(x);
        jLabel4.setEnabled(x);
        jTextField3.setEnabled(x);
        jTextField4.setEnabled(x);
        jTextField5.setEnabled(x);
        jButton1.setEnabled(x);
        jButton2.setEnabled(x);
        jRadioButton1.setEnabled(x);
        jRadioButton2.setEnabled(x);
        jRadioButton3.setEnabled(x);
        jRadioButton4.setEnabled(x);
        jRadioButton5.setEnabled(x);
        
        jTextField1.setEnabled(!x);
        jButton3.setEnabled(!x);
        jLabel1.setEnabled(!x);

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        testNameTemp = jTextField1.getText();
        changeStance(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void save() {
        Question quest = new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue());

        String filename = "dfd.pac";
        try {
            FileOutputStream fos;
            fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(quest);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    private void load() {
        try {
            String filename = "dfd.pac";
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream oin = new ObjectInputStream(fis);
            Question ts = (Question) oin.readObject();
            jTextField5.setText(ts.getTheme());
            jTextField3.setText(ts.getText());
            jTextField4.setText(ts.getAnswer());
            setValue(ts.getValue());

        } catch (ClassNotFoundException ex) {
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (!isSafe) {
            switch (JOptionPane.showConfirmDialog(null, "Ви не зберегли зміни. Зберегти?")) {
                case JOptionPane.OK_OPTION: {
                    Pack toSave = new Pack(testNameTemp, arr);
                    JFileChooser chooser = new JFileChooser("/");
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Packs", "pac");
                    chooser.setFileFilter(filter);
                    int returnVal = chooser.showSaveDialog(null);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        String filename = chooser.getSelectedFile().getAbsolutePath();
                        String extentionTmp = filename.substring(filename.length() - 3, filename.length());
                        if (!"pac".equals(extentionTmp)) {
                            filename += ".pac";
                        }
                        try {
                            FileOutputStream fos;
                            fos = new FileOutputStream(filename);
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(toSave);
                            oos.close();
                            fos.close();
                        } catch (FileNotFoundException e) {
                        } catch (IOException e) {
                        }
                    }

                    isSafe = true;
                    break;
                }
                case JOptionPane.NO_OPTION:
                    isSafe = true;
                    break;
                default:
                    return;
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (!isSafe) {
            switch (JOptionPane.showConfirmDialog(null, "Ви не зберегли зміни. Зберегти?")) {
                case JOptionPane.OK_OPTION: {
                    Pack toSave = new Pack(testNameTemp, arr);
                    JFileChooser chooser = new JFileChooser("/");
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Packs", "pac");
                    chooser.setFileFilter(filter);
                    int returnVal = chooser.showSaveDialog(null);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        String filename = chooser.getSelectedFile().getAbsolutePath();
                        String extentionTmp = filename.substring(filename.length() - 3, filename.length());
                        if (!"pac".equals(extentionTmp)) {
                            filename += ".pac";
                        }
                        try {
                            FileOutputStream fos;
                            fos = new FileOutputStream(filename);
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(toSave);
                            oos.close();
                            fos.close();
                        } catch (FileNotFoundException e) {
                        } catch (IOException e) {
                        }
                    }

                    isSafe = true;
                    break;

                }
                case JOptionPane.NO_OPTION:
                    isSafe = true;
                    break;
                default:
                    return;
            }
        }

        JFileChooser chooser = new JFileChooser("/");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Packs", "pac");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //Читання з файла
            String filename = chooser.getSelectedFile().getAbsolutePath();
            try {
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream is = new ObjectInputStream(fis);
                Pack testPack = (Pack) is.readObject();
                testNameTemp = testPack.getName();
                arr = testPack.getQuestions();
                jTextField1.setText(testPack.getName());

                jTextField2.setText("1");
                questionCount = arr.size();
                showQuestion(0);

            } catch (ClassNotFoundException e) {
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        NumberQuestion = Integer.parseInt(jTextField2.getText());
        arr.set(NumberQuestion - 1, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        if (arr.size() > 0) {
            Pack toSave = new Pack(testNameTemp, arr);
            JFileChooser chooser = new JFileChooser("/");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Packs", "pac");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showSaveDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String filename = chooser.getSelectedFile().getAbsolutePath();
                String extentionTmp = filename.substring(filename.length() - 3, filename.length());
                if (!"pac".equals(extentionTmp)) {
                    filename += ".pac";
                }
                try {
                    FileOutputStream fos;
                    fos = new FileOutputStream(filename);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(toSave);
                    oos.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                }
            }

            isSafe = true;

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NumberQuestion = Integer.parseInt(jTextField2.getText());
        if ((jTextField3.getText() == "") || (jTextField4.getText() == "") || (jTextField5.getText() == "")) {
            return;
        } else if (NumberQuestion < arr.size()) {

            arr.set(NumberQuestion - 1, new Question(jTextField3.getText(),
                    jTextField5.getText(),
                    jTextField4.getText(), getValue()));
            NumberQuestion = Integer.parseInt(jTextField2.getText()) + 1;
            jTextField2.setText(NumberQuestion + "");

            showQuestion(NumberQuestion - 1);

        } else {
            arr.add(NumberQuestion - 1, new Question(jTextField3.getText(),
                    jTextField5.getText(),
                    jTextField4.getText(), getValue()));
            arr.add(new Question("", "", "", 100));
            NumberQuestion = Integer.parseInt(jTextField2.getText()) + 1;
            jTextField2.setText(NumberQuestion + "");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void showQuestion(int index) {
        Question tmp = arr.get(index);
        jTextField5.setText(tmp.getTheme());
        jTextField3.setText(tmp.getText());
        jTextField4.setText(tmp.getAnswer());
        setValue(tmp.getValue());
    }

    private void setValue(int value) {
        if (value == 100) {
            jRadioButton1.setSelected(true);
        } else if (value == 200) {
            jRadioButton2.setSelected(true);
        } else if (value == 300) {
            jRadioButton3.setSelected(true);
        } else if (value == 400) {
            jRadioButton4.setSelected(true);
        } else {
            jRadioButton5.setSelected(true);
        }
    }

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
            java.util.logging.Logger.getLogger(Constructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Constructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Constructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Constructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Constructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
