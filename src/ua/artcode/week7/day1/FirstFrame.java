package ua.artcode.week7.day1;

import ua.artcode.week6.io.IOUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

/**
 *
 */
public class FirstFrame extends JFrame { // BorderLayout

    private File current;
    private JTextArea textArea;
    private JTextField pathTextField;

    public FirstFrame(String title) throws HeadlessException {
        super(title);
        setSize(600,600);
        init();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void init() {
        textArea = new JTextArea();

        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        JButton loadButton = new JButton("Load");

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser("/");
                int res = fileChooser.showOpenDialog(getContentPane());
                if(res == JFileChooser.APPROVE_OPTION){
                    current = fileChooser.getSelectedFile();
                }

                textArea.setText(IOUtils.readContentFromFile(current));
                pathTextField.setText(current.getAbsolutePath());

            }
        });

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonListener());

        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);

        pathTextField = new JTextField();
        pathTextField.setEditable(false);

        JPanel southPanel = new JPanel(new GridLayout(2,1));
        southPanel.add(pathTextField);
        southPanel.add(buttonPanel);

        getContentPane().add(textArea, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);


    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(getContentPane(), "Button was pressed");
        }
    }


}
