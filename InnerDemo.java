// class Outer {
//     private int x,y;
//     public void show(int y){
//         this.y=y;
//         System.out.println("Shwing ");
//     }
//     public class Inner{
//         public void disp(){
//             System.out.println("Outer "+ x +"  " + y);
//         }
//     }
//     public void demo(){
//             Inner i = new Inner();
//             y=4;
//             i.disp();
//         }
// }
// class InnerDemo{
//     public static void main(String a[]){
//         Outer out = new Outer();
//         out.demo();
//     }
// }

/*
import java.awt.*;
import javax.swing.*;

class Outer {
    private int x,y;
    public void show(int y){
        this.y=y;
        System.out.println("Shwing ");
    }
    public class Inner{
        public void disp(){
            System.out.println("Outer "+ x +"  " + y);
        }
    }
}
class InnerDemo{
    public static void main(String a[]){
        Outer out = new Outer();
        // out.demo();
        Outer.Inner i = out.new Inner();
        out.show(3);
        i.disp();

    }
}
*/

 
class Outer {
    private static int x,y;
    public void show(int y){
        this.y=y;
        System.out.println("Shwing ");
    }
    public static class Inner{
        public static void disp(){
            System.out.println("Outer "+ x +"  " + y);
        }
    }
}
class InnerDemo{
    public static void main(String a[]){
        Outer out = new Outer();
        out.show(4);
        Outer.Inner i = new Outer.Inner();
        i.disp();
    }
}
 