package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.*;

public class UIDesafíoNavideño implements ActionListener {
    private final JFrame frame;
    private JPanel mainPanel;
    private JMenuBar menuBar;
    private JLabel labelCartel, labelIngreso, labelElegir;
    private JButton buttonReset;
    private JTextField textIngreso;
    private JMenu menu;
    private JMenuItem menuItem;
    private ImageIcon iconImage;
    private Image imageUno, imageDos, imageTres, imageCuatro;
    private String[] rutaFotos = {
            "src/PruebaCapas/resources/images/straw-hat.png",
            "src/PruebaCapas/resources/images/jolly-roger.png",
            "src/PruebaCapas/resources/images/thousand-sunny.png",
            "src/PruebaCapas/resources/images/haki.png",
            ""
    };

    public UIDesafíoNavideño() throws IOException {
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

        buttonReset = new JButton("Reset");
        buttonReset.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        mainPanel.add(labelCartel, "gapleft 30%");
        mainPanel.add(labelIngreso, "gapleft 30");
        mainPanel.add(textIngreso, "align center");
        mainPanel.add(labelElegir, "align center");
        mainPanel.add(new PanelButton(), "growx, span, wrap");
        mainPanel.add(new PanelTextArea());
        mainPanel.add(buttonReset, "align center");
        frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(600, 660);
        // 1frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private ImageIcon ponerFoto(String ruta, int tamaño) {
        ImageIcon icon = new ImageIcon(ruta);
        Image imagen = icon.getImage().getScaledInstance(tamaño, tamaño, Image.SCALE_SMOOTH);
        icon = new ImageIcon(imagen);
        return icon;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Ingreso")) {
            textIngreso.setText("Angel");
        }
    }
}
