package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class MenuController extends JFrame {

    public void MenuController(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
    }

    public void btnSettings(JButton x){
        x.setFont(new Font("SansSerif",Font.BOLD,15));
        x.setFocusable(false);
        x.setBackground(Color.blue);
        x.setForeground(Color.white);

    }

    public void backGroundClr(JPanel x){
        x.setBackground(Color.cyan);
    }
}

