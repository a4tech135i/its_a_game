/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import game.Game_pack_theme;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.Timer; //Будет вызыватся каждую секунду

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
        changeStance(false);
        jComboBox1.setEditable(true);
        isSafe = true;
        setTheme();
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            }
        });
        timer.start();
    }

    public void setTheme() {

        ArrayList<String> tmp = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            if (!tmp.contains(arr.get(i).getTheme())) {
                tmp.add(arr.get(i).getTheme());
                jComboBox1.addItem(arr.get(i).getTheme());
            }
        }
        jComboBox1.setModel(new DefaultComboBoxModel(tmp.toArray()));
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 390));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Назва паку");

        jLabel2.setText("Тема питання");

        jTextField2.setText("1");
        jTextField2.setEnabled(false);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("100");

        jRadioButton2.setText("200");

        jRadioButton3.setText("300");

        jRadioButton4.setText("400");

        jRadioButton5.setText("500");

        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jComboBox1ComponentMoved(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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

        jMenu3.setText("Перевірка");

        jMenuItem4.setText("Перевірити на вартість");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Show list");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Show");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jButton3)))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((Integer.parseInt(jTextField2.getText()) == 1) || (jTextField3.equals("")) || (jTextField4.equals("")) || (jTextField5.equals(""))|| (jTextField3.getText().trim().isEmpty()) || (jTextField4.getText().trim().isEmpty()) || (jTextField5.getText().trim().isEmpty())) {
            if(NumberQuestion!=1) {NumberQuestion--; jTextField2.setText(NumberQuestion + "");}
            showQuestion(NumberQuestion-1);
            return;
        }
        NumberQuestion = Integer.parseInt(jTextField2.getText()) - 1;
        if (NumberQuestion == arr.size()) {
            arr.add(NumberQuestion, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        } else {
            arr.set(NumberQuestion, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        }
        jTextField2.setText(NumberQuestion + "");
        showQuestion(NumberQuestion - 1);
        setTheme();
        isSafe = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        testNameTemp = jTextField1.getText();
        changeStance(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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
                    changeStance(true);
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
        if (returnVal == JFileChooser.APPROVE_OPTION) {
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
        changeStance(true);
        setTheme();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        checkpack();
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
            System.out.println(arr);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ((jTextField3.getText() == null) || (jTextField4.getText() == null) || (jTextField5.getText() == null) || (jTextField3.getText().trim().isEmpty()) || (jTextField4.getText().trim().isEmpty()) || (jTextField5.getText().trim().isEmpty())) {
            return;
        }
        NumberQuestion = Integer.parseInt(jTextField2.getText());
        if (NumberQuestion < arr.size()) {

            arr.set(NumberQuestion - 1, new Question(jTextField3.getText(),
                    jTextField5.getText(),
                    jTextField4.getText(), getValue()));
            NumberQuestion++;
            jTextField2.setText(NumberQuestion + "");
            showQuestion(NumberQuestion - 1);

        } else {
            arr.add(NumberQuestion - 1, new Question(jTextField3.getText(),
                    jTextField5.getText(),
                    jTextField4.getText(), getValue()));
            NumberQuestion++;
            jTextField2.setText(NumberQuestion + "");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        }
        setTheme();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        checkpack();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField5.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ComponentMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        QuestionView form = new QuestionView();
        checkpack();
        form.setPack(new Pack(themeTemp, arr));
        form.showList();
        form.setTitle("Show list of question");
        form.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void checkpack() {
        NumberQuestion = Integer.parseInt(jTextField2.getText());
        if ((!jTextField3.getText().trim().isEmpty()) || (!jTextField4.getText().trim().isEmpty()) || (!jTextField5.getText().trim().isEmpty())){
        if (NumberQuestion > arr.size()) {
            arr.add(NumberQuestion - 1, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        } else {
            arr.set(NumberQuestion - 1, new Question(jTextField3.getText(), jTextField5.getText(), jTextField4.getText(), getValue()));
        }}
        Pack pack = new Pack(themeTemp, arr);
        ArrayList<String> thems = pack.getTheme();
        String error = "";
        for (int i = 0; i < thems.size(); i++) {
            Game_pack_theme gamePack = new Game_pack_theme(thems.get(i), pack);
            gamePack.getStateByTheme();
            error += gamePack.getError();
        }
        if ((error.isEmpty()) && (error.equals(""))) {
            JOptionPane.showMessageDialog(null, "Все в порядку, всі теми мають повний набір по ціні", "InfoBox: " + "OK", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, error, "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

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
        jComboBox1.setEnabled(x);
        jTextField1.setEnabled(!x);
        jButton3.setEnabled(!x);
        jLabel1.setEnabled(!x);

    }

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
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
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
