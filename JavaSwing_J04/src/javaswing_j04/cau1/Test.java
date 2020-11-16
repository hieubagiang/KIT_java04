/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing_j04.cau1;

import java.awt.Button;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PhamDoanHieu
 */
public class Test extends JFrame{

    public Test() throws HeadlessException {
        this.setTitle("ảo diệu ");
        this.setSize(300,400);
        this.setLocationRelativeTo(null);
        JButton jb = new JButton("bấm đi");
        jb.setText("??");
        this.add(jb);        
this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Test t = new Test();
    }
}
