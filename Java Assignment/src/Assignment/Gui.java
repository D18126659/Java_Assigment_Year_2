package Assignment;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private Dimension dim;

    public Gui() {
        //Displaying the Gui on screen and setting it to the middle of your screen
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 650);
        int x = dim.width / 2 - getWidth() / 2;
        int y = dim.height / 2 - getHeight() / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }
}