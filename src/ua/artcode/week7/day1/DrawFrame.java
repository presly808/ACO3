package ua.artcode.week7.day1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on 16.12.2014.
 */
public class DrawFrame extends JFrame {



    private class SwingCanvas extends JPanel {

        public SwingCanvas() {



        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

        }
    }

}

