import javax.swing.*;
import java.awt.*;

public  class jframdemo {
    public static  void xihuan(){
        JFrame jFrame=new JFrame("打开");
        JButton jButton=new JButton("DA");
        jFrame.setSize(500,300);
        jFrame.setVisible(true);
        jFrame.add(jButton, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
