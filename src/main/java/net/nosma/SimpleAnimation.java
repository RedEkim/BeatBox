package net.nosma;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.orange);
            g.fillOval(x,y,100,100);
        }
    }
}
