package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.io.*;

public class UIDesafíoNavideño {
    private final JFrame frame;
    private JPanel mainPanel;
    private JMenuBar menuBar;

    public UIDesafíoNavideño() throws IOException {
        frame = new JFrame();

        initComponents();
        setupFrame();
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10" ));


    }

    private void setupFrame() {
        frame.setSize(600, 600);
        //frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
