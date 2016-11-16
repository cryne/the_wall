/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class HiloL extends Thread {

    public JLabel Label;
    protected int contador;
    protected boolean aired = false;

    public HiloL(JLabel Labels, int contador) {
        this.Label = Labels;
        this.contador = contador;
    }
    
    public JLabel getLabels() {
        return Label;
    }

    public void setLabels(JLabel Labels) {
        this.Label = Labels;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean isAired() {
        return aired;
    }

    public void setAired(boolean aired) {
        this.aired = aired;
    }


    @Override
    public void run() {

        Random rand = new Random();

        int random = rand.nextInt(10000) + 5000;

        try {
            Thread.sleep(random);
        } catch (Exception e) {
        }

        File Fimg = new File("./fly.jpg");

        Image img = Toolkit.getDefaultToolkit().createImage(Fimg.getPath()).getScaledInstance(316, 149, 0);
        Label.setIcon(new ImageIcon(img));

        contador++;

        if (isAired() == true) {
            File n = new File("./Avion.jpg");
            Image img2 = Toolkit.getDefaultToolkit().createImage(n.getPath()).getScaledInstance(316, 149, 0);
            Label.setIcon(new ImageIcon(img2));
        }
    }

}
