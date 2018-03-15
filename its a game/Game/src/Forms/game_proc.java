/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import game.Client;
import game.Pack;
import game.user1;
import game.userss;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andriy
 */
public class game_proc extends javax.swing.JFrame {

    String ip;
    Client client;
    private Socket socketConnection;
    ObjectInputStream clientInputStream;
    Pack testTmp;
    static int balss = 0;
    static public userss wq;
    public ArrayList<userss> list_user = new ArrayList<>();
    public ArrayList<JButton> b7 = new ArrayList<>();
    public ArrayList<JButton> b8 = new ArrayList<>();
    public ArrayList<JButton> b9 = new ArrayList<>();
    public ArrayList<JButton> b10 = new ArrayList<>();

    /**
     * Creates new form game_proc
     */
    public game_proc() {
        initComponents();
    }

    public void setList(ArrayList<userss> u) {
        list_user = u;
    }

    public ArrayList<userss> getList() {
        return list_user;
    }

    public void startConnection(String ip, String clientName, game_proc gp) {
        client = new Client();
        client.setClientName(clientName);
        client.setIp(ip);
        client.setGp(gp);
        client.setOutSource(jTable1);
        client.startClient();
    }

    public void refresh_interface() {
        int o = list_user.size();
        if (o == 1) {
            jLabel20.setText(list_user.get(0).getLogin());
            jLabel21.setText(list_user.get(0).getName_sur());
            jLabel23.setText(String.valueOf(list_user.get(0).getBals()));
        }
    }

    public game_proc(String ip1) {
        initComponents();
        ip = ip1;
        try {
            socketConnection = new Socket(ip, 11111);
            clientInputStream = new ObjectInputStream(socketConnection.getInputStream());
            testTmp = (Pack) clientInputStream.readObject();
            clientInputStream.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
        startConnection(ip, MainMenu.user.getLogin(), this);
        userss j = new userss();
        j.setLogin(MainMenu.user.getLogin());
        j.setName(MainMenu.user.getName_sur());
        j.setBals(0);
        list_user.add(j);
        jLabel3.setText(testTmp.getName());
        jLabel25.setText(list_user.get(0).getLogin());
        jLabel26.setText(list_user.get(0).getName_sur());
        jLabel32.setText(String.valueOf(list_user.get(0).getBals()));
        Interface();
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        jLabel23.setText(String.valueOf(balss));
                        if(!jButton3.isVisible() && !jButton4.isVisible() && !jButton5.isVisible() && !jButton6.isVisible() && !jButton7.isVisible() 
                                && !jButton8.isVisible() && !jButton9.isVisible() && !jButton10.isVisible() && !jButton11.isVisible() && !jButton12.isVisible() 
                                && !jButton13.isVisible() && !jButton14.isVisible() && !jButton15.isVisible() && !jButton27.isVisible() && !jButton16.isVisible() 
                                && !jButton17.isVisible() && !jButton18.isVisible() && !jButton19.isVisible() && !jButton20.isVisible() && !jButton21.isVisible() 
                                && !jButton22.isVisible() && !jButton23.isVisible() && !jButton24.isVisible() && !jButton25.isVisible() && !jButton26.isVisible())
                        {
                            JOptionPane.showMessageDialog(null, "Раунд 2!");
                        }
                        Thread.sleep(1000); //1000 - 1 сек
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        run.start();
    }

    public game_proc(String ip1, String e) {
        initComponents();
        ip = ip1;
        try {
            socketConnection = new Socket(ip, 11111);
            clientInputStream = new ObjectInputStream(socketConnection.getInputStream());
            testTmp = (Pack) clientInputStream.readObject();
            clientInputStream.close();
        } catch (Exception ex) {
            System.out.println("Error123");
        }
        startConnection(ip, MainMenu.user.getLogin(), this);

        //sfdsafasdf
        userss j = new userss();
        j.setLogin(MainMenu.user.getLogin());
        j.setName(MainMenu.user.getName_sur());
        j.setBals(0);
        list_user.add(j);
        jLabel3.setText(testTmp.getName());
        jLabel20.setText(list_user.get(0).getLogin());
        jLabel21.setText(list_user.get(0).getName_sur());
        jLabel23.setText(String.valueOf(list_user.get(0).getBals()));
        Interface();
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        jLabel23.setText(String.valueOf(balss));
                        if(!jButton3.isVisible() && !jButton4.isVisible() && !jButton5.isVisible() && !jButton6.isVisible() && !jButton7.isVisible() 
                                && !jButton8.isVisible() && !jButton9.isVisible() && !jButton10.isVisible() && !jButton11.isVisible() && !jButton12.isVisible() 
                                && !jButton13.isVisible() && !jButton14.isVisible() && !jButton15.isVisible() && !jButton27.isVisible() && !jButton16.isVisible() 
                                && !jButton17.isVisible() && !jButton18.isVisible() && !jButton19.isVisible() && !jButton20.isVisible() && !jButton21.isVisible() 
                                && !jButton22.isVisible() && !jButton23.isVisible() && !jButton24.isVisible() && !jButton25.isVisible() && !jButton26.isVisible())
                        {
                            JOptionPane.showMessageDialog(null, "Раунд 2!");
                        }
                        Thread.sleep(1000); //1000 - 1 сек
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        run.start();
    }

    private void Interface() {
        ArrayList<String> temu = new ArrayList<String>();
        ArrayList<String> raund1 = new ArrayList<String>();
        ArrayList<String> raund2 = new ArrayList<String>();
        ArrayList<String> raund3 = new ArrayList<String>();
        ArrayList<String> raund4 = new ArrayList<String>();
        temu = testTmp.getTheme();
        int a = temu.size();
        int kikl_raund = 1;
        System.out.println(a);
        if (a > 5) {
            kikl_raund++;
        }
        if (a > 10) {
            kikl_raund++;
        }
        if (a > 15) {
            kikl_raund++;
        }
        for (int i = 0; i < a; i++) {
            if (i < 5) {
                raund1.add(temu.get(i));
            }
            if (i >= 5 && i < 10) {
                raund2.add(temu.get(i));
            }
            if (i >= 10 && i < 15) {
                raund3.add(temu.get(i));
            }
            if (i >= 15 && i < 20) {
                raund4.add(temu.get(i));
            }
        }
        if (kikl_raund == 1) {
            jLabel16.setText("1 з 1");
        } else {
            jLabel16.setText("1 з " + kikl_raund);
        }
        if (raund1.size() == 1) {
            jLabel6.setText(raund1.get(0));
            ryad2(false);
            ryad3(false);
            ryad4(false);
            ryad5(false);
            jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 100");
                    form12.show();
                    jButton8.setVisible(false);
                }
            });
            jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 200");
                    form12.show();
                    jButton9.setVisible(false);
                }
            });
            jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 300");
                    form12.show();
                    jButton10.setVisible(false);
                }
            });
            jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 400");
                    form12.show();
                    jButton11.setVisible(false);
                }
            });
            jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 500");
                    form12.show();
                    jButton7.setVisible(false);
                }
            });
        }
        if (raund1.size() == 2) {
            jLabel6.setText(raund1.get(0));
            jLabel8.setText(raund1.get(1));
            ryad3(false);
            ryad4(false);
            ryad5(false);
            jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 100");
                    form12.show();
                    jButton8.setVisible(false);
                }
            });
            jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 200");
                    form12.show();
                    jButton9.setVisible(false);
                }
            });
            jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 300");
                    form12.show();
                    jButton10.setVisible(false);
                }
            });
            jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 400");
                    form12.show();
                    jButton11.setVisible(false);
                }
            });
            jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 500");
                    form12.show();
                    jButton7.setVisible(false);
                }
            });
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
        }
        if (raund1.size() == 3) {
            jLabel6.setText(raund1.get(0));
            jLabel8.setText(raund1.get(1));
            jLabel7.setText(raund1.get(2));
            ryad4(false);
            ryad5(false);
            jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 100");
                    form12.show();
                    jButton8.setVisible(false);
                }
            });
            jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 200");
                    form12.show();
                    jButton9.setVisible(false);
                }
            });
            jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 300");
                    form12.show();
                    jButton10.setVisible(false);
                }
            });
            jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 400");
                    form12.show();
                    jButton11.setVisible(false);
                }
            });
            jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 500");
                    form12.show();
                    jButton7.setVisible(false);
                }
            });
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton18.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton23.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton16.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton17.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
        }
        if (raund1.size() == 4) {
            jLabel6.setText(raund1.get(0));
            jLabel8.setText(raund1.get(1));
            jLabel7.setText(raund1.get(2));
            jLabel9.setText(raund1.get(3));
            ryad5(false);
            jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 100");
                    form12.show();
                    jButton8.setVisible(false);
                }
            });
            jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 200");
                    form12.show();
                    jButton9.setVisible(false);
                }
            });
            jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 300");
                    form12.show();
                    jButton10.setVisible(false);
                }
            });
            jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 400");
                    form12.show();
                    jButton11.setVisible(false);
                }
            });
            jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 500");
                    form12.show();
                    jButton7.setVisible(false);
                }
            });
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton18.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton23.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton16.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton17.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton20.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton25.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton26.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
        }
        if (raund1.size() == 5) {
            jLabel6.setText(raund1.get(0));
            jLabel8.setText(raund1.get(1));
            jLabel7.setText(raund1.get(2));
            jLabel9.setText(raund1.get(3));
            jLabel10.setText(raund1.get(4));
            jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 100");
                    form12.show();
                    jButton8.setVisible(false);
                }
            });
            jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 200");
                    form12.show();
                    jButton9.setVisible(false);
                }
            });
            jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 300");
                    form12.show();
                    jButton10.setVisible(false);
                }
            });
            jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 400");
                    form12.show();
                    jButton11.setVisible(false);
                }
            });
            jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(0) + " 500");
                    form12.show();
                    jButton7.setVisible(false);
                }
            });
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(1) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton18.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton23.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton16.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton17.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(2) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton20.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton25.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton26.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(3) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
            jButton19.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(4) + " 100");
                    form12.show();
                    jButton3.setVisible(false);
                }
            });
            jButton21.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(4) + " 200");
                    form12.show();
                    jButton4.setVisible(false);
                }
            });
            jButton22.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(4) + " 300");
                    form12.show();
                    jButton5.setVisible(false);
                }
            });
            jButton24.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(4) + " 400");
                    form12.show();
                    jButton6.setVisible(false);
                }
            });
            jButton27.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    question_form form12 = new question_form();
                    form12.setTitle(raund1.get(4) + " 500");
                    form12.show();
                    jButton12.setVisible(false);
                }
            });
        }

    }

    private void ryad1(boolean a) {
        jLabel6.setVisible(a);
        jButton8.setVisible(a);
        jButton9.setVisible(a);
        jButton10.setVisible(a);
        jButton11.setVisible(a);
        jButton7.setVisible(a);
    }

    private void ryad2(boolean a) {
        jLabel8.setVisible(a);
        jButton3.setVisible(a);
        jButton4.setVisible(a);
        jButton5.setVisible(a);
        jButton6.setVisible(a);
        jButton12.setVisible(a);
    }

    private void ryad3(boolean a) {
        jLabel7.setVisible(a);
        jButton18.setVisible(a);
        jButton14.setVisible(a);
        jButton23.setVisible(a);
        jButton16.setVisible(a);
        jButton17.setVisible(a);
    }

    private void ryad4(boolean a) {
        jLabel9.setVisible(a);
        jButton13.setVisible(a);
        jButton20.setVisible(a);
        jButton15.setVisible(a);
        jButton25.setVisible(a);
        jButton26.setVisible(a);
    }

    private void ryad5(boolean a) {
        jLabel10.setVisible(a);
        jButton19.setVisible(a);
        jButton21.setVisible(a);
        jButton22.setVisible(a);
        jButton24.setVisible(a);
        jButton27.setVisible(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Назва паку:");

        jLabel2.setText("Чат:");

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setEnabled(false);
        jTable1.setGridColor(java.awt.Color.white);
        jTable1.setName(""); // NOI18N
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(java.awt.Color.white);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable1);

        jTextField3.setText("Напишіть повідомлення...");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jButton1.setText("Відповідати");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Надіслати");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setText("Гравець ");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jLabel22.setText("Кількість балів:");

        jLabel23.setText("jLabel23");

        jLabel24.setText("Гравець №2");

        jLabel25.setText("jLabel25");

        jLabel26.setText("jLabel26");

        jLabel27.setText("Кількість балів:");

        jLabel32.setText("jLabel32");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32))
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Раунд №");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMinimumSize(null);
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMinimumSize(null);
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMinimumSize(null);
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setMinimumSize(null);
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setMinimumSize(null);
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("100");
        jButton3.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton3.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("200");
        jButton4.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton4.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("300");
        jButton5.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton5.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton5.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 153));
        jButton6.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("400");
        jButton6.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton6.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton6.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton7.setBackground(new java.awt.Color(0, 0, 153));
        jButton7.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("500");
        jButton7.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton7.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton7.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton8.setBackground(new java.awt.Color(0, 0, 153));
        jButton8.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("100");
        jButton8.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton8.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton8.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton9.setBackground(new java.awt.Color(0, 0, 153));
        jButton9.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("200");
        jButton9.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton9.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton9.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton10.setBackground(new java.awt.Color(0, 0, 153));
        jButton10.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("300");
        jButton10.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton10.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton10.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton11.setBackground(new java.awt.Color(0, 0, 153));
        jButton11.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("400");
        jButton11.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton11.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton11.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton12.setBackground(new java.awt.Color(0, 0, 153));
        jButton12.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("500");
        jButton12.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton12.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton12.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton13.setBackground(new java.awt.Color(0, 0, 153));
        jButton13.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("100");
        jButton13.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton13.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton13.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 153));
        jButton14.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("200");
        jButton14.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton14.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton14.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton15.setBackground(new java.awt.Color(0, 0, 153));
        jButton15.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("300");
        jButton15.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton15.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton15.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton16.setBackground(new java.awt.Color(0, 0, 153));
        jButton16.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("400");
        jButton16.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton16.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton16.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton17.setBackground(new java.awt.Color(0, 0, 153));
        jButton17.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("500");
        jButton17.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton17.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton17.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton18.setBackground(new java.awt.Color(0, 0, 153));
        jButton18.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("100");
        jButton18.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton18.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton18.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton19.setBackground(new java.awt.Color(0, 0, 153));
        jButton19.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("100");
        jButton19.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton19.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton19.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton20.setBackground(new java.awt.Color(0, 0, 153));
        jButton20.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("200");
        jButton20.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton20.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton20.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton21.setBackground(new java.awt.Color(0, 0, 153));
        jButton21.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("200");
        jButton21.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton21.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton21.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton22.setBackground(new java.awt.Color(0, 0, 153));
        jButton22.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("300");
        jButton22.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton22.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton22.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton23.setBackground(new java.awt.Color(0, 0, 153));
        jButton23.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("300");
        jButton23.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton23.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton23.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton24.setBackground(new java.awt.Color(0, 0, 153));
        jButton24.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("400");
        jButton24.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton24.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton24.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton25.setBackground(new java.awt.Color(0, 0, 153));
        jButton25.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("400");
        jButton25.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton25.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton25.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton26.setBackground(new java.awt.Color(0, 0, 153));
        jButton26.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("500");
        jButton26.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton26.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton26.setPreferredSize(new java.awt.Dimension(150, 50));

        jButton27.setBackground(new java.awt.Color(0, 0, 153));
        jButton27.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("500");
        jButton27.setMaximumSize(new java.awt.Dimension(60, 33));
        jButton27.setMinimumSize(new java.awt.Dimension(60, 33));
        jButton27.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(203, 203, 203)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (jTextField3.getText().compareTo("Напишіть повідомлення...") == 0
                && (KeyEvent.VK_BACK_SPACE == evt.getKeyCode()
                || KeyEvent.VK_SPACE == evt.getKeyCode()
                || KeyEvent.VK_ESCAPE == evt.getKeyCode()
                || KeyEvent.CHAR_UNDEFINED == evt.getKeyChar()
                || KeyEvent.VK_DELETE == evt.getKeyChar()
                || evt.isActionKey() == true)) {
            evt.consume();
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField3.getText().compareTo("Напишіть повідомлення...") != 0
                    && jTextField3.getText().compareTo("") != 0) {
                client.sendMessage(jTextField3.getText());
            }
            jTextField3.setText("Напишіть повідомлення...");
            jTextField3.setForeground(Color.GRAY);
            return;
        }

        if (jTextField3.getText().compareTo("Напишіть повідомлення...") == 0) {
            jTextField3.setText("");
            jTextField3.setForeground(Color.DARK_GRAY);
            return;
        }

        if (KeyEvent.VK_BACK_SPACE == evt.getKeyCode() && jTextField3.getText().length() == 1) {
            jTextField3.setText("Напишіть повідомлення...");
            jTextField3.setForeground(Color.GRAY);
            evt.consume();
            return;
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        client.sendMessage("vidpovid");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField3.getText().compareTo("Напишіть повідомлення...") != 0
                && jTextField3.getText().compareTo("") != 0) {
            client.sendMessage(jTextField3.getText());
        }
        jTextField3.setText("Напишіть повідомлення...");
        jTextField3.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(game_proc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game_proc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game_proc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game_proc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game_proc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
