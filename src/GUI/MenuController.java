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
    public void Button(JButton y, String name){
        y.setBounds(0,0,90,40);
        y.setText(name);
        y.setFocusable(false);
        y.setBackground(Color.WHITE);
    }


}

