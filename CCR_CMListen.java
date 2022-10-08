import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import javafx.scene.layout.FlowPane;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.*;


class CCR_CMListen extends JFrame implements ItemListener {
    ButtonGroup grp1 ,grp2;
    JTextArea ta;
    JCheckBox jcb1,jcb2,jcb3,jcb4;
    JRadioButton b1,b2;
    CCR_CMListen(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        String s[]={"Python","JS","CSS","KOTLIN"};
        JComboBox jb1 = new JComboBox(s);
        ta = new JTextArea();
        c.add(jb1);
        c.add(ta);
        jb1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                String str = (String) jb1.getSelectedItem();
                ta.setText(jb1.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, str);
                
            }
        });

        ImageIcon ii = new ImageIcon("card.png");
        grp1= new ButtonGroup();
        grp2 = new ButtonGroup();
        jcb1 = new JCheckBox("TV",false);
        jcb2 = new JCheckBox("Car",ii,false);
        jcb3 = new JCheckBox("Mobile",ii,false);
        jcb4 = new JCheckBox("Gold",ii,false);
        b1 = new JRadioButton("Male",false);
        b2 = new JRadioButton("FeMale");
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
        jcb4.addItemListener(this);
        b1.addItemListener(this);
        b2.addItemListener(this);
        grp1.add(jcb1);grp1.add(jcb2);grp1.add(jcb3);grp1.add(jcb4);grp2.add(b1);grp2.add(b2);
        c.add(jcb1);c.add(jcb2);c.add(jcb3);c.add(jcb4);c.add(b1);c.add(b2);
    }

    public void itemStateChanged(ItemEvent e){
        if(jcb1.isSelected())
        {
            ta.setText(jcb1.getLabel());
        }
        else if(jcb2.isSelected())
        {
            ta.setText(jcb2.getLabel());
        }
        else if(jcb3.isSelected())
        {
            ta.setText(jcb3.getLabel());
        }
        else if(jcb4.isSelected())
        {
            ta.setText(jcb4.getLabel());
        }
        else if(b1.isSelected())
        {
            ta.setText(b1.getLabel());
        }
        else if(b2.isSelected())
        {
            ta.setText(b2.getLabel());
        }
    }
    public static void main(String a[]){
        CCR_CMListen obj = new CCR_CMListen();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}