import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class KeyListen_pgm extends JFrame implements KeyListener{
    JTextArea ta;
    Container c;
    JFrame f2;
    KeyListen_pgm(){
        setVisible(true);
        setTitle("Keyboard");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,500);
        f2.setVisible(true);
        f2.setSize(500,500);
        f2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        c=getContentPane();
        c.setBackground(Color.magenta);
        c.setLayout(new FlowLayout());
        ta = new JTextArea("Text ");
        // ta.setBounds(30,30,300,200);
        c.add(ta);
        f2.setBackground(Color.orange);
        f2.add(ta);
        ta.addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
        ta.setText(ta.getText()+""+e.getKeyChar());
        if(e.getKeyChar()=='a'){
            ta.selectAll();
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Pressed  ");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Released  ");
    }
    public static void main(String a[]){
        new KeyListen_pgm();
    }
    
}
