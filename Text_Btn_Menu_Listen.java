import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TbmListen extends JFrame implements ActionListener {
        JTextArea ta;
        JButton b;
        JMenuBar mb;
        JMenu file, edit;
        JMenuItem i1, i2, i3, i4, i5, i6, i7;
        Container c;
    TbmListen() {
        c = getContentPane();
        mb = new JMenuBar();
        b = new JButton("click Me ");
        ta = new JTextArea();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select All");
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        file.add(i1);file.add(i2);file.add(i3);
        edit.add(i4);edit.add(i5);edit.add(i6);edit.add(i7);
        mb.add(file);
        mb.add(edit);
        this.setJMenuBar(mb);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==i1){
            ta.setText("New File Created");
        }
        else if(ae.getSource()==i2){
            JFileChooser jf = new JFileChooser("d:");
            jf.setVisible(true);
            jf.setSize(150,150);
        }
        else if(ae.getSource()==i3){
            ta.setText("Saving File");
        }
        else if(ae.getSource()==i3){
            ta.setText("Saving File");
        }
        else if(ae.getSource()==i4){
            ta.cut();
        }
        else if(ae.getSource()==i5){
            ta.copy();
        }
        else if(ae.getSource()==i6){
            ta.paste();
        }
        else if(ae.getSource()==i7){
            ta.selectAll();
        }
    }
    public static void main(String a[]) 
    {
        TbmListen obj = new TbmListen();
        obj.setVisible(true);
        obj.setTitle("Events Action");
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // obj.setSize(200, 200);
        obj.setBounds(20, 20, 180, 180);
    }

}


































// class MyEvent implements ActionListener
// {

// public void actionPerformed(ActionEvent ae){

// }

// }
// class Main {
//     public static void main(String s[]) {
//         TbmListen obj = new TbmListen();
//         obj.setVisible(true);
//         obj.setTitle("Events Action");
//         obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//         // obj.setSize(200, 200);
//         obj.setBounds(20, 20, 180, 180);
//     }
// }
