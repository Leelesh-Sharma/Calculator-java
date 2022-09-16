package src;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class frame extends JFrame  // JFrame superclass hai
{
    
    frame(){
        this.setTitle("Calculator - Leelesh");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("images\\icon.png");
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
}
