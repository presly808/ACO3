package ua.artcode.week7.day1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by admin on 16.12.2014.
 */
public class DrawFrame extends JFrame {


    public DrawFrame (){
        setSize(600,600);
        add(new SwingCanvas());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        new DrawFrame();
    }


    private class SwingCanvas extends JPanel {

        int x = 0;
        int y = 0;
        int radius = 10;

        public SwingCanvas() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    System.out.println("in");
                    super.mousePressed(e);
                    x = e.getX();
                    y = e.getY();

                }
            });


        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g,x,y,radius);
        }

        private void draw(Graphics g,int x, int y, int radius){
            g.drawOval(x, y, radius, radius);
        }
    }

}

