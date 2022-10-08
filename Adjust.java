
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Adjust extends Frame implements AdjustmentListener{
    Scrollbar bar,hr;
    Label l1;

    Adjust(){
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        bar = new Scrollbar(Scrollbar.VERTICAL,0,30,0,300);
        hr = new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300);
        add(bar);
        add(hr);

        bar.setBounds(480,0,30,500);
        hr.setBounds(0,480,500,30);
        bar.addAdjustmentListener(this);
        hr.addAdjustmentListener(this);
        l1 =new Label("");
        l1.setBounds(50,50,300,30);
        add(l1);
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        l1.setText(e.getID()+","+e.getAdjustmentType()+"Value "+bar.getValue()+" Mini : "+bar.getMinimum()+" max : "+bar.getMaximum()+"Orientation :"+bar.getOrientation());
    }
    public static void main(String a[]){
        new Adjust();
    }
}