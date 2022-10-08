import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Item extends JFrame implements ItemListener{
    Item(){
        setVisible(true);
        setSize(8000,8000);
        MenuBar b = new MenuBar();
        Menu m = new Menu();
        CheckboxMenuItem chk = new CheckboxMenuItem("Status",false);

        setMenuBar(b);
        b.add(m);
        m.add(chk);
        chk.addItemListener(this);
       
    }
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        setBackground(Color.cyan);  
    }
    public static void main(String a[]){
        new Item();
    }
    
}