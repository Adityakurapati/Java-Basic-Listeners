import javax.swing.JApplet;
import javafx.scene.input.MouseEvent;
import java.awt.event.MouseListener;
// <applet code="adpt.class" width=200 height=200></applet>
class adpt1 extends JApplet{
    String name;
    public void init(){
        name=getParameter("name");
        this.addMouseListener((MouseListener) new m1());
    }
    class m1 extends java.awt.event.MouseMotionAdapter{
        public void mouseDragged(MouseEvent me){
            showStatus("Cursor At "+me.getX()+" "+me.getY());
        }
    }
}
// class adpt1
// {
//     public static void main(String a[]){
//         new MyFrame2();
//     }
// }