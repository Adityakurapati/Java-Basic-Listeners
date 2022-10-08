import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.event.CaretListener;
import java.awt.Color;
import javafx.scene.paint.Color.*;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;


public class Action extends JFrame {
    JTextArea area1;
    JTextField field1;
    JLabel l1;
    Action(){
        setVisible(true);
        setSize(1000,1000);
        Container c = getContentPane();
        JButton b = new JButton("Press me  ");
        area1 = new JTextArea("Hello",5,5);
        field1 = new JTextField("Enter Text ");
        l1 = new JLabel();

        c.setLayout(null);
        c.add(b);
        c.add(area1);
        c.add(l1);
        c.add(field1);


        b.setBounds(50,50,80,40);
        area1.setBounds(50,120,100,100);
        l1.setBounds(50,340,60,30);
        field1.setBounds(50,250,80,40);
        
        c.setBackground(Color.blue);
        b.addActionListener(new m11());
        field1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int mod = ae.getModifiers();
               System.out.println(mod);
            //    l1.setText(mod);
            }
        });
        
    }
    class m11 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           String btn_name = e.getActionCommand();
           int a = e.getModifiers();
           long b = e.getWhen();
           area1.setText(btn_name+" \n"+a+" \n"+b);
           System.out.println("Time At "+b);
           System.out.println("Modifier Is "+a);
           System.out.println("Lable Is "+btn_name);
            
        }
    }
    public static void main(String a[]){
        new Action();
    }
}
