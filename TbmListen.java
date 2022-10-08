import java.awt.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.event.*;

public class TbmListen extends JFrame implements ActionListener,ItemListener,KeyListener,FocusListener,MouseListener,MouseMotionListener,WindowListener,CaretListener{
    JTextArea ta;
    // JScrollPane jsp;
    JTextField tf1;
    JButton b;
    JMenuBar mb;
    JMenu file, edit,Appearanace,zoom;
    JMenuItem i1, i2, i3, i4, i5, i6, i7,i8;
    JCheckBoxMenuItem zoomin,zoomout;
    Container c;

    TbmListen() {
        CheckboxGroup cbg = new CheckboxGroup();
        c = getContentPane();
        c.setBackground(new Color(0, 153, 255));
        c.setLayout(null);
        mb = new JMenuBar();
        b = new JButton("click Me ");
        ta = new JTextArea();
        tf1 = new JTextField();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        Appearanace = new JMenu("Appearance ");
        zoom = new JMenu("Zoom");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i8 = new JMenuItem("Clear");
        i7 = new JMenuItem("Select All");
        ta.addKeyListener(this);
        ta.addFocusListener(this);
        ta.addCaretListener(this);
        addMouseListener(this);
        addWindowListener(this);
        zoomin =new JCheckBoxMenuItem("Zoom In",false);
        zoomout =new JCheckBoxMenuItem("Zoom Out",false);
        


        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        zoomin.addItemListener(this);
        zoomout.addItemListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);
        Appearanace.add(zoom);
        zoom.add(zoomin);
        zoom.add(zoomout);

        edit.add(i8);
        mb.add(file);
        mb.add(edit);
        mb.add(Appearanace);
        this.setJMenuBar(mb);
        ta.setBounds(20,20,460,300);


        // int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        // int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        // JScrollPane jsp = new JScrollPane();
        // jsp.add(ta,v,h);
        // c.add(jsp);
        // pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        c.add(ta);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        tf1.setBounds(20,350,300,100);
        c.add(tf1);
        tf1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText(tf1.getText().toUpperCase());
            }
        });
        

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == i1) {
            ta.setText("New File Created");
        } else if (ae.getSource() == i2) {
            JFileChooser jf1 = new JFileChooser();
            jf1.setVisible(true);
            jf1.setSize(150, 150);
            jf1.showOpenDialog(null);
        } else if (ae.getSource() == i3) {
            JFileChooser jf = new JFileChooser();
            jf.setVisible(true);
            jf.setSize(150, 150);
            jf.showSaveDialog(null);
        } else if (ae.getSource() == i3) {
            ta.setText("Saving File");
        } else if (ae.getSource() == i4) {
            ta.cut();
        } else if (ae.getSource() == i5) {
            ta.copy();
        } else if (ae.getSource() == i6) {
            ta.paste();
        } else if (ae.getSource() == i7) {
            ta.selectAll();
        }
        else if(ae.getSource()==i8){
            ta.setText("");
        }
    }





    public void itemStateChanged(ItemEvent e){
        Boolean b = zoomin.isSelected();
        if(b){
            ta.setFont(new Font("arial",Font.BOLD,18));
        }
        else{
            ta.setFont(new Font("arial",Font.BOLD,10));
        }
        // (b)?ta.setFont(new Font("arial",Font.BOLD,18)):ta.setFont(new Font("arial",Font.BOLD,18));
    }



    public void focusGained(FocusEvent f){
        ta.setForeground(Color.green);
    }
    public void focusLost(FocusEvent f){
        ta.setText(" ");
    }
    public static void main(String a[]) {
        TbmListen obj = new TbmListen();
        obj.setVisible(true);
        obj.setTitle("Events Action");
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // obj.setSize(200, 200);
        obj.setBounds(20, 20, 530, 550);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        ta.setText(ta.getText()+"\n"+e.getKeyChar());
        if(e.getKeyChar()=='a'){
            ta.selectAll();
        }
        else if(e.getKeyChar()=='c'){
            ta.copy();
        }
        else if(e.getKeyChar()=='p'){
            ta.paste();
        }
        else if(e.getKeyChar()=='l'){
            ta.cut();
        }
        else if(e.getKeyChar()=='z'){
            ta.setFont(new Font("arial",Font.BOLD,18));
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Pressed");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Relaesed");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        tf1.setText("Mouse Dragging At "+this.getX()+" "+this.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tf1.setText("Mouse Moving At "+this.getX()+" "+this.getY());
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tf1.setText("Mouse Clicked at "+this.getX() +" "+this.getY());
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        tf1.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tf1.setText("Mouse Dragging at "+this.getX()+" "+this.getY());
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        tf1.setText("Mouse Entered");
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        tf1.setText("Mouse Exited");
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        ta.setText("WELCOME");
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int option = JOptionPane.showConfirmDialog(this, "Are You Want To EXit ");
        if(option==0){
            dispose();
        }
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Come AGain Thank You !");
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Minimized");
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        ta.setText("Welcome Again");
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        tf1.setText("You Are Active ");
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Deactivated");
        
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        tf1.setText("Caret Updated "+e.getDot()+"  "+e.getMark());
        
    }

}
