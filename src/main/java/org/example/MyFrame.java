package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton Mon1;
    JButton Mon2;
    JButton Mon3;
    JButton Mon4;

    MyFrame() {

        JButton Mon1 = new JButton("Jan");
        Mon1.setBounds(10,10,100,40);
        Mon1.setVisible(true);
        Mon1.addActionListener(this);

        JButton Mon2 = new JButton("Feb");
        Mon2.setBounds(10,100,100,40);
        Mon2.setVisible(true);
        JButton Mon3 = new JButton("Mar");
        Mon3.setBounds(10,200,100,40);
        Mon3.setVisible(true);
        JButton Mon4 = new JButton("April");
        Mon4.setBounds(10,300,100,40);
        Mon4.setVisible(true);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLayout(null);
        //this.setVisible(true);
        this.add(Mon1);
        this.add(Mon2);
        this.add(Mon3);
        this.add(Mon4);
        this.setVisible(true);




        //JButton Mon1 = new JButton("Jan");
        //Mon1.setBounds(10,10,100,40);
        //Mon1.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Mon1) {
            System.out.println("Click");
        }
    }
}
