package com.lol;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Practice {
        JFrame frame;
        JPanel panel;
    public Practice(){
        JFrame frame = new JFrame("JTable Test Display");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTable table = new JTable();
        JScrollPane tableContainer = new JScrollPane(table);
        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Practice();
    }
}


