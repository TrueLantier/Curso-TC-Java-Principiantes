package PruebaCapas.desafíonavideño.gui;

import PruebaCapas.desafíonavideño.logic.AdivinanzasLógica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.*;

public class UIDesafíoNavideño implements ActionListener {
    private final JFrame frame;
    private JPanel mainPanel;
    private PanelButton panelButton;
    private PanelTextArea panelTextArea;
    private JMenuBar menuBar;
    private JLabel labelCartel, labelIngreso, labelElegir;
    private JButton buttonComprobar, buttonReset;
    private JTextField textIngreso;
    private JMenu menu;
    private JMenuItem menuItem;
    private AdivinanzasLógica al = new AdivinanzasLógica();

    public UIDesafíoNavideño() {
        frame = new JFrame("Juego");

        initComponents();
        setupFrame();
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 1" ));
        //mainPanel = new JPanel(new MigLayout("debug, insets 20, gap 10, wrap 1"));
        // "fill" para que los componentes usen el espacio sobrante.

        labelCartel = new JLabel("Adivinanzas");
        labelCartel.setFont(new Font("JetBrains Mono", Font.BOLD, 28));

        labelIngreso = new JLabel("Ingrese la cantidad de veces que cree que aparece el objeto.");
        labelIngreso.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        labelElegir = new JLabel("Elige el objeto: \uD83D\uDE00");
        labelElegir.setFont(new Font("Segoe UI Emoji", Font.BOLD, 14));

        textIngreso = new JTextField(10);
        textIngreso.setActionCommand("Ingreso");
        textIngreso.addActionListener(this);

        buttonComprobar = new JButton("Comprobar");
        buttonComprobar.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        buttonComprobar.addActionListener(this);

        buttonReset = new JButton("Reset");
        buttonReset.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        buttonReset.addActionListener(this);

        panelButton = new PanelButton(this);
        panelTextArea = new PanelTextArea();

        mainPanel.add(labelCartel, "gapleft 30%");
        mainPanel.add(labelIngreso, "gapleft 30");
        mainPanel.add(textIngreso, "align center");
        mainPanel.add(labelElegir, "align center");
        mainPanel.add(panelButton, "growx, span, wrap");
        mainPanel.add(buttonComprobar, "align center");
        mainPanel.add(panelTextArea);
        mainPanel.add(buttonReset, "align center");
        frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(600, 700);
        // frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Ingreso")) {
            textIngreso.setText("Angel");
            panelTextArea.getTextArea().setText(al.sopaOPUno);
        }

        if (ae.getActionCommand().equals("Luffy")) {
            panelButton.getButtonCinco().setText("Luffy");
        }

    }

    private ImageIcon ponerFoto(String ruta, int tamaño) {
        ImageIcon icon = new ImageIcon(ruta);
        Image imagen = icon.getImage().getScaledInstance(tamaño, tamaño, Image.SCALE_SMOOTH);
        icon = new ImageIcon(imagen);
        return icon;
    }

    private JLabel generarLabel(String nombre) {
        JLabel label = new JLabel(nombre);
        label.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        return label;
    }
}