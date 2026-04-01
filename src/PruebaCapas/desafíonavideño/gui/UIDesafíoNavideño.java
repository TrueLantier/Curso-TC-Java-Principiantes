package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.*;

public class UIDesafíoNavideño implements ActionListener {
    private final JFrame frame;
    private JPanel mainPanel, panelButton;
    private JMenuBar menuBar;
    private JLabel labelCartel, labelIngreso, labelElegir;
    private JLabel labelElegido, labelCantidad, labelEncontrados, labelResultado;
    private JButton buttonUno, buttonDos, buttonTres, buttonCuatro, buttonReset;
    private JTextField textIngreso;
    private JTextArea textArea;
    private JScrollPane scrollPane;
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
        panelButton = new JPanel(new MigLayout("insets 0, gap 40"));
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

        iconImage = ponerFoto(rutaFotos[0], 40);
        buttonUno = new JButton(iconImage);
        buttonUno.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[1], 40);
        buttonDos = new JButton(iconImage);
        buttonDos.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[2], 40);
        buttonTres = new JButton(iconImage);
        buttonTres.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[3], 40);
        buttonCuatro = new JButton(iconImage);
        buttonCuatro.addActionListener(this);

        buttonReset = new JButton("Reset");
        buttonReset.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        panelButton.add(buttonUno, "gapleft 90");
        panelButton.add(buttonDos);
        panelButton.add(buttonTres);
        panelButton.add(buttonCuatro);

        textArea = new JTextArea(10, 35);
        textArea.setLineWrap(true); // Salta de línea al llegar al final
        textArea.setWrapStyleWord(true); // Corta solo espacios entre palabras.
        //textArea.setEditable(false);
        textArea.setFont(new Font("JetBrains Mono", 1, 14));
        textArea.setForeground(Color.MAGENTA);
        scrollPane = new JScrollPane(textArea);

        mainPanel.add(labelCartel, "gapleft 30%");
        mainPanel.add(labelIngreso, "gapleft 30");
        mainPanel.add(textIngreso, "align center");
        mainPanel.add(labelElegir, "align center");
        mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(panelButton, "wrap");
        mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(new PanelButton(), "wrap");
        mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(new PanelTextArea());
        mainPanel.add(buttonReset, "align center");
        frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(600, 700);
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
            textArea.setText("Angel");
            textIngreso.setText("Eduardo");
        }
    }
}
