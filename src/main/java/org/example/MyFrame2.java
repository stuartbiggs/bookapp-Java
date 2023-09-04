package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame {

        public MyFrame2() {
            initialize();
        }

        public void initialize() {
            JFrame frame = new JFrame();
            frame.setTitle("Calender");
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel();
            JButton Mon1 = new JButton("Jan");
            JButton Mon2 = new JButton("Feb");
            JButton Mon3 = new JButton("Mar");
            JButton Mon4 = new JButton("April");

            JLabel label1 = new JLabel();
            JLabel label2 = new JLabel();
            JLabel label3 = new JLabel();
            JLabel label4 = new JLabel();

            frame.add(panel);
            panel.add(Mon1);
            panel.add(Mon2);
            panel.add(Mon3);
            panel.add(Mon4);
            panel.add(label1);
            panel.add(label2);
            panel.add(label3);
            panel.add(label4);
            panel.setLayout(null);
            panel.setVisible(true);

            //Buttons
            Mon1.setBounds(10,10, 100,40);
            Mon1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    label1.setText("clicked");
                }
            });

            Mon2.setBounds(10, 60, 100, 40);
            Mon2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    label2.setText("clicked");
                }
            });

            Mon3.setBounds(10, 110, 100, 40);
            Mon3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    label3.setText("clicked");
                }
            });

            Mon4.setBounds(10, 160, 100, 40);
            Mon4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    label4.setText("clicked");
                }
            });

            //labels
            label1.setBounds(250, 10, 100,40);
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            label1.setBorder(border);

            label2.setBounds(250, 60, 100,40);
            Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);
            label2.setBorder(border2);

            label3.setBounds(250, 110, 100,40);
            Border border3 = BorderFactory.createLineBorder(Color.BLACK, 1);
            label3.setBorder(border3);

            label4.setBounds(250, 160, 100,40);
            Border border4 = BorderFactory.createLineBorder(Color.BLACK, 1);
            label4.setBorder(border4);

            frame.add(panel);
            frame.setVisible(true);
        }


}
