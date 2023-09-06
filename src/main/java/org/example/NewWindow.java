
package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewWindow extends JFrame {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    JButton button = new JButton("Exit");
    NewWindow(){

        button.setVisible(true);
        button.setBounds(200,200, 100,40);
        button.addActionListener(e ->{
            frame.dispose();
        });

        label.setBounds(0,0,100, 50);

        frame.add(button);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}