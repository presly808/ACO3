package ua.artcode.week7.day1;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class RecPanel extends JPanel {

    public void draw(Graphics g) {
        int pointX = 10;
        int pointY = 10;
        int height = 500;
        int width = 500;

        for (int i = 0; i < 10; i++) {
            g.drawRect(pointX, pointY, width, height);
            pointX += 10;
            pointY += 10;
            width -= 10;
            height -= 10;
        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new ContainerFrame();
        frame.setVisible(true);
    }

}

class ContainerFrame extends JFrame {

    private JPanel jPanel;

    public ContainerFrame() throws HeadlessException {

        setSize(600,600);

        jPanel = new RecPanel();
        add(jPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
