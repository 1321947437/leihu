import javax.swing.*;
import java.awt.event.ActionListener;

public class demo {
    public static void main(String[] args) {
        System.out.println("hello");
//        demo2 demo2=new demo2();
//       System.out.println(demo2.getClass());
//        demo2.cesi();
//        demo2.datedemo();
//        jframdemo.xihuan();
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "QUit program");
        System.exit(0);


    }
}
