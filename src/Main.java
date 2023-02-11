import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("krish.png");
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel();
        label.setText("krishna, Rama Rama, Hare Krishna !");
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FFF));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
//        label.setIconTextGap(50);
        label.setBackground(new Color(0x00));
        label.setOpaque(true );
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,10,350,350);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

        frame.pack();

    }
}