/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class HiloP extends Thread {

    protected ArrayList<JPanel> Dialogs;
    protected ArrayList<JLabel> Labels;
    ArrayList<Mexicano> Personas;
    protected int contadorD;
    protected int contadorL;
    protected boolean vive = true;
    protected boolean advanzar;

    protected Pila pila1 = new Pila();
    protected Pila pila2 = new Pila();
    protected Pila pila3 = new Pila();
    protected Pila pila4 = new Pila();
    protected Pila pila5 = new Pila();
    protected Pila pila6 = new Pila();
    protected Pila pila7 = new Pila();
    protected Pila pila8 = new Pila();
    protected Pila pila9 = new Pila();
    protected Pila pila10 = new Pila();

    public HiloP(ArrayList<JPanel> Dialogs, ArrayList<JLabel> Labels, ArrayList<Mexicano> Personas, int contadorD, int contadorL) {
        this.Dialogs = Dialogs;
        this.Labels = Labels;
        this.Personas = Personas;
        this.contadorD = contadorD;
        this.contadorL = contadorL;
    }

    public ArrayList<JPanel> getDialogs() {
        return Dialogs;
    }

    public void setDialogs(ArrayList<JPanel> Dialogs) {
        this.Dialogs = Dialogs;
    }

    public ArrayList<JLabel> getLabels() {
        return Labels;
    }

    public void setLabels(ArrayList<JLabel> Labels) {
        this.Labels = Labels;
    }

    public ArrayList<Mexicano> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Mexicano> Personas) {
        this.Personas = Personas;
    }

    public int getContadorD() {
        return contadorD;
    }

    public void setContadorD(int contadorD) {
        this.contadorD = contadorD;
    }

    public int getContadorL() {
        return contadorL;
    }

    public void setContadorL(int contadorL) {
        this.contadorL = contadorL;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAdvanzar() {
        return advanzar;
    }

    public void setAdvanzar(boolean advanzar) {
        this.advanzar = advanzar;
    }

    @Override
    public String toString() {
        return "HiloP{" + "Dialogs=" + Dialogs + ", Labels=" + Labels + ", Personas=" + Personas + ", contadorD=" + contadorD + ", contadorL=" + contadorL + ", vive=" + vive + ", advanzar=" + advanzar + '}';
    }

    @Override
    public void run() {
        Cola Aviones = new Cola();
        File n = new File("./Avion.jpg");
        Image img2 = Toolkit.getDefaultToolkit().createImage(n.getPath()).getScaledInstance(316, 149, 0);
        try {
            while (vive) {
                if (Personas.get(contadorD).Departed == false) {
                    Dialogs.get(contadorD).setBackground(Color.green);

                    if (contadorD == 0) {
                        pila1.setHead(new Node(Personas.get(0)));
                    }

                    if (contadorD >= 1 || contadorD <= 4) {
                        pila1.push(Personas.get(contadorD));
                    }

                    if (contadorD == 5) {
                        pila2.setHead(new Node(Personas.get(5)));
                    }

                    if (contadorD >= 6 || contadorD <= 9) {
                        pila2.push(Personas.get(contadorD));
                    }

                    if (contadorD == 10) {
                        pila3.setHead(new Node(Personas.get(10)));
                    }

                    if (contadorD >= 11 || contadorD <= 14) {
                        pila3.push(Personas.get(contadorD));
                    }

                    if (contadorD == 15) {
                        pila4.setHead(new Node(Personas.get(15)));
                    }

                    if (contadorD >= 16 || contadorD <= 19) {
                        pila4.push(Personas.get(contadorD));
                    }

                    if (contadorD == 20) {
                        pila5.setHead(new Node(Personas.get(20)));
                    }

                    if (contadorD >= 21 || contadorD <= 24) {
                        pila5.push(Personas.get(contadorD));
                    }

                    if (contadorD == 25) {
                        pila6.setHead(new Node(Personas.get(25)));
                    }

                    if (contadorD >= 26 || contadorD <= 29) {
                        pila6.push(Personas.get(contadorD));
                    }

                    if (contadorD == 30) {
                        pila7.setHead(new Node(Personas.get(30)));
                    }

                    if (contadorD >= 31 || contadorD <= 34) {
                        pila7.push(Personas.get(contadorD));
                    }

                    if (contadorD == 35) {
                        pila8.setHead(new Node(Personas.get(35)));
                    }

                    if (contadorD >= 36 || contadorD <= 39) {
                        pila8.push(Personas.get(contadorD));
                    }

                    if (contadorD == 40) {
                        pila9.setHead(new Node(Personas.get(40)));
                    }

                    if (contadorD >= 41 || contadorD <= 44) {
                        pila9.push(Personas.get(contadorD));
                    }
                    if (contadorD == 45) {
                        pila10.setHead(new Node(Personas.get(0)));
                    }

                    if (contadorD >= 46 || contadorD <= 49) {
                        pila10.push(Personas.get(contadorD));
                    }

                    if (contadorD == 50) {
                        pila1.setHead(new Node(Personas.get(50)));
                    }

                    contadorD++;

                    System.out.println(contadorD);
                    if (contadorD == 5 || contadorD == 10 || contadorD == 15 || contadorD == 20 || contadorD == 25 || contadorD == 30 || contadorD == 35 || contadorD == 40 || contadorD == 45 || contadorD == 50) {
                        HiloL LableH1;
                        HiloL LableH2;
                        HiloL LableH3;
                        HiloL LableH4;
                        HiloL LableH5;
                        HiloL LableH6;
                        HiloL LableH7;
                        HiloL LableH8;
                        HiloL LableH9;
                        HiloL LableH10;
                        contadorL++;

                        if (contadorD == 5) {

                            LableH1 = new HiloL(Labels.get(0), contadorL);
                            LableH1.run();


                            Dialogs.get(0).setBackground(Color.red);
                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila1.pop());
                                Dialogs.get(i).setBackground(Color.red);

                            }

                        }

                        if (contadorD == 10) {

                            LableH2 = new HiloL(Labels.get(1), contadorL);
                            LableH2.run();


                            Dialogs.get(5).setBackground(Color.red);
                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila2.pop());
                                Dialogs.get(i + 5).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 15) {

                            LableH3 = new HiloL(Labels.get(2), contadorL);
                            LableH3.run();


                            Dialogs.get(10).setBackground(Color.red);
                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila3.pop());
                                Dialogs.get(i + 10).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 20) {

                            LableH4 = new HiloL(Labels.get(3), contadorL);
                            LableH4.run();


                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila4.pop());
                                Dialogs.get(i + 15).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 25) {

                            LableH5 = new HiloL(Labels.get(4), contadorL);
                            LableH5.run();


                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila5.pop());
                                Dialogs.get(i + 20).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 30) {

                            LableH6 = new HiloL(Labels.get(5), contadorL);
                            LableH6.run();

                            Aviones.Queue(pila6);

                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila6.pop());
                                Dialogs.get(i + 25).setBackground(Color.red);

                            }

                        }

                        if (contadorD == 35) {

                            LableH7 = new HiloL(Labels.get(6), contadorL);
                            LableH7.run();

                            Aviones.Queue(pila7);

                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila7.pop());
                                Dialogs.get(i + 30).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 40) {

                            LableH8 = new HiloL(Labels.get(7), contadorL);
                            LableH8.run();

                            Aviones.Queue(pila8);

                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila8.pop());
                                Dialogs.get(i + 35).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 45) {

                            LableH9 = new HiloL(Labels.get(8), contadorL);
                            LableH9.run();

                            Aviones.Queue(pila9);

                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila9.pop());
                                Dialogs.get(i + 40).setBackground(Color.red);

                            }
                        }

                        if (contadorD == 50) {

                            LableH10 = new HiloL(Labels.get(9), contadorL);
                            LableH10.run();

                            Aviones.Queue(pila10);

                            for (int i = 1; i <= 5; i++) {

                                System.out.println(pila10.pop());
                                Dialogs.get(i + 45).setBackground(Color.red);

                            }
                        }
                    }

                    try {
                        Thread.sleep(500);

                    } catch (Exception e) {
                    }
                }

            }
        } catch (Exception e) {
        }

    }

}
