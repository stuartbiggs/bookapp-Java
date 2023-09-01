package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener, AncestorListener {

    JButton Mon1;
    JButton Mon2;
    JButton Mon3;
    JButton Mon4;
    JLabel label;

    MyFrame() {

        //Buttons for months declaration
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


        //labels
        JLabel label = new JLabel();
        label.setBounds(150, 10, 100,40);
        //label.addAncestorListener(this);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        label.setBorder(border);
        label.setText("");
        label.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLayout(null);
        //this.setVisible(true);
        this.add(Mon1);
        this.add(Mon2);
        this.add(Mon3);
        this.add(Mon4);
        this.add(label);
        this.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Mon1) {
            label.setText("Click");
        }
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {

    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {

    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

    }

    /*@Override
    public void ancestorAdded(AncestorEvent event) {

    }*/
}
