/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UzayOyunu;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Oyunekranı extends JFrame {

    public Oyunekranı(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        Oyunekranı ekran=new  Oyunekranı("Uzay Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false); //odaklanamaz
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Oyun oyun=new Oyun();
        oyun.requestFocus();//klavyeden işlemleri direk anlamakn için odağı bana ver jframe   *1
        oyun.addKeyListener(oyun);//klavyeden işlemleri almamızı sağlar **2
        oyun.setFocusable(true);//odağı jpanel verdik  **3
        oyun.setFocusTraversalKeysEnabled(false);//klavye  girişler için  **4   sıralama bu şekilde olmadır.
        ekran.add(oyun);
        ekran.setVisible(true);
         
        
    }
    
    
    
}
