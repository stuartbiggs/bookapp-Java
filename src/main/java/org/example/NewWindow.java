
package org.example;

import javax.swing.*;

public class NewWindow extends JFrame {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    NewWindow(){
        label.setBounds(0,0,100, 50);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}