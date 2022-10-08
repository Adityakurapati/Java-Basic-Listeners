
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Text1 extends JFrame implements TextListener{
    TextField tf1;
    JTextArea a1;
    Text1(){
        setBackground(Color.cyan);
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        tf1 = new TextField();
        a1 = new JTextArea(4,4);
        add(a1);
        add(tf1);
        a1.setBounds(50,50,100,80);
        tf1.setBounds(50,180,100,30);
        tf1.addTextListener(this);

    }
    
    public void textValueChanged(TextEvent te){
        setBackground(Color.magenta);
    }
    public static void main(String a[]){
        new Text1();
    }
}
