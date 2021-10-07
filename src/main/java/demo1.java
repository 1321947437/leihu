import javax.swing.*;
import java.awt.*;

public class demo1 {
    public static  void jframdemo(){
        JFrame jFrame=new JFrame("HELLO");
        jFrame.setSize(400,300);
        JButton jButton=new JButton("nihao");
        JLabel jLabel=new JLabel();
        jLabel.setBackground(Color.BLACK);
        jLabel.add(jButton, BorderLayout.SOUTH);
        jFrame.add(jButton,BorderLayout.SOUTH);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        jframdemo();
    }
}
