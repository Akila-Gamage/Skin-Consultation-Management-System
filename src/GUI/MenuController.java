package GUI;

import javax.swing.*;
import java.awt.*;

abstract class MenuController extends JFrame {

    public void MenuController(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
    }

}

