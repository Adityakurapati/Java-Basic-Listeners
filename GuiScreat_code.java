import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import javafx.scene.control.Dialog;

class GuiScreat_code extends JFrame implements ActionListener, FocusListener {
    JProgressBar pb;
    String a = "01";
    String b = "1000";
    String c = "1010";
    String d = "100";
    String e = "0";
    String f = "0010";
    String g = "110";
    String h = "0000";
    String i = "00";
    String j = "0111";
    String k = "101";
    String l = "0100";
    String m = "11";
    String n = "10";
    String o = "111";
    String p = "0110";
    String q = "1101";
    String r = "010";
    String s = "000";
    String t = "1";
    String u = "001";
    String v = "0001";
    String w = "011";
    String x = "1001";
    String y = "1011";
    String z = "1100";
    String chh;
    String result;

    public void cpv() throws InterruptedException {
        int i = 1;
        while (i < 100) {
            i += 40;
            pb.setValue(i);
            Thread.sleep(500);
            if (i == 50) {
                Thread.sleep(10000);
            }
        }
    }

    JLabel l1, l2;
    JFrame home, f1, f2;
    JTextArea ta, ta2;
    JButton encode, decode, submit;
    Container ct;

    GuiScreat_code() throws InterruptedException {

        setVisible(true);
        setSize(1000, 1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ct = getContentPane();
        ct.setBackground(Color.CYAN);
        ct.setLayout(null);

        pb = new JProgressBar(1, 100);
        ct.add(pb);
        pb.setBounds(300,450,400,50);
        pb.setStringPainted(true);
        cpv();
        home = new JFrame("Home");
        home.setLayout(null);
        home.setVisible(true);
        home.setDefaultCloseOperation(HIDE_ON_CLOSE);
        home.setSize(1000, 1000);
        home.setTitle("Encoder");

        f1 = new JFrame();
        f1.setVisible(false);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        f1.setSize(1000, 1000);
        f1.setTitle("Encoder");
        f1.setBackground(Color.magenta);
        f2 = new JFrame();
        f2.setVisible(false);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(HIDE_ON_CLOSE);
        f2.setSize(1000, 1000);
        f2.setTitle("Decoder "); 


        encode = new JButton("Encoder");
        encode.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                f2.setVisible(false);
            }
        });
        decode = new JButton("Decoder ");
        decode.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                f1.setVisible(false);
                f2.setVisible(true);
            }
        });
        encode.setBounds(100,450,300,100);
        decode.setBounds(500,450,300,100);
        home.add(encode);
        home.add(decode);

        

        ta = new JTextArea("Enter Your Screat Code  To Convert It Into String:");
        chh = ta.getText();

        for (String word : chh.split(" ")) {

            if ("01".equals(word)) {

                result+="a";
            } else if ("1000".equals(word)) {
                result+="b";
            } else if ("1010".equals(word)) {
                result+="c";
            } else if ("100".equals(word)) {
                result+="d";
            } else if ("0".equals(word)) {
                result+="e";
            } else if ("0010".equals(word)) {
                result+="f";
            }

            else if ("110".equals(word)) {
                result+="g";
            }

            else if ("0000".equals(word)) {
                result+="h";
            }

            else if ("00".equals(word)) {
                result+="i";
            } else if ("0111".equals(word)) {
                result+="j";
            }

            else if ("101".equals(word)) {
                result+="k";
            }

            else if ("0100".equals(word)) {
                result+="l";
            }

            else if ("11".equals(word)) {
                result+="m";
            }

            else if ("10".equals(word)) {
                result+="n";
            }

            else if ("111".equals(word)) {
                result+="o";
            }

            else if ("0110".equals(word)) {
                result+="p";
            }

            else if ("1101".equals(word)) {
                result+="q";
            }

            else if ("010".equals(word)) {
                result+="r";
            }

            else if ("000".equals(word)) {
                result+="s";
            }

            else if ("1".equals(word)) {
                result+="t";
            }

            else if ("001".equals(word)) {
                result+="u";
            }

            else if ("0001".equals(word)) {
                result+="v";
            }

            else if ("011".equals(word)) {
                result+="w";
            }

            else if ("1001".equals(word)) {
                result+="x";
            }

            else if ("1011".equals(word)) {
                result+="y";
            }

            else if ("1100".equals(word)) {
                result+="z";
            }

            else if (" ".equals(word)) {
                result+="  ";
            }

            else if ("_".equals(word)) {
                result+="    ";
            }

            // else if(.equals(word) ' ' ){
            // System.out.println(" ");
            // }

            else if ("?".equals(word)) {
                System.out.println(" ? ");
            }

        }

        submit = new JButton("Get Screat Code ");
        // ta.setBounds(250, 250, 700, 100);
        submit.setBounds(400, 400, 60, 40);
        l1.setBounds(400,500,80,40);
        f1.add(ta);
        f1.add(submit);
        // f1.add(l1);
        // ta.addFocusListener(this);
        submit.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {\
        l1.setText(result);
    }

        });
    }

    
    @Override
    public void focusGained(FocusEvent e) {
        ta.setToolTipText("Enter Your String");

    }

    @Override
    public void focusLost(FocusEvent e) {
    }

    public static void main(String a[]) throws InterruptedException {
        new GuiScreat_code();
    }
}