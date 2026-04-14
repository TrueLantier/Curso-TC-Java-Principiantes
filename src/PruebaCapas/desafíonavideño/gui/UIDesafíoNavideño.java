package PruebaCapas.desafíonavideño.gui;

import PruebaCapas.desafíonavideño.logic.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.io.*;

/**
  Falta implementar el random, para seleccionar distintas sopas de letras.
 */

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
    private AdivinanzasComprobación ac = new AdivinanzasComprobación();
    private boolean pulsarBotón = false;
    private boolean juegoActivo = false;

    public UIDesafíoNavideño() {
        frame = new JFrame("Juego");
        initComponents();
        setupFrame();
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        menu = new JMenu("Creador");
        menuItem = new JMenuItem("El Creador");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuBar.add(menu);

        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 1" ));
        //mainPanel = new JPanel(new MigLayout("debug, insets 20, gap 10, wrap 1"));
        // "fill" para que los componentes usen el espacio sobrante.

        labelCartel = generarLabel("Sopa de Palabras", 28);
        labelCartel.setForeground(Color.RED);
        labelIngreso = generarLabel("Ingrese la cantidad de veces que cree que aparece el objeto.", 14);
        labelElegir = generarLabel("Elige el objeto: ", 14);
        labelElegir.setForeground(Color.ORANGE);

        textIngreso = new JTextField(10);
        textIngreso.setActionCommand("Ingreso");
        textIngreso.setForeground(Color.MAGENTA);
        textIngreso.addActionListener(this);

        buttonComprobar = new JButton("Comprobar");
        buttonComprobar.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        buttonComprobar.setBackground(Color.BLUE);
        buttonComprobar.addActionListener(this);

        buttonReset = new JButton("Reset");
        buttonReset.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        buttonReset.setBackground(Color.BLUE);
        buttonReset.addActionListener(this);

        panelButton = new PanelButton(this);
        panelTextArea = new PanelTextArea();

        mainPanel.add(labelCartel, "gapleft 25%");
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
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Ingreso")) {
            textIngreso.setText("Angel");
        }

        if (ae.getActionCommand().equals("El Creador")) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Angel Eduardo " +
                    "Pedraza Ordoñez");
        }

        if (ae.getActionCommand().equals("Reset")) {
            resetear();
        }

        if (ae.getActionCommand().equals("Comprobar")) {
            if (comprobarJuego()) {
                return;
            }
            juegoActivo = true;

            ac.setTema(al.getTema());
            ac.setElegido(al.getObjeto());
            ac.setEncontrados(textIngreso.getText());
            ac.comprobarElección();

            panelTextArea.setTextFields(ac.getElegido(), ac.getEncontrados(), ac.getCantidad(), ac.getResultados());
        }

        if (al.pulsarBotónÍcono(ae.getActionCommand())) {
            pulsarBotón = true;
            labelElegir.setText(al.getTema());
            setLabelButton((JButton) ae.getSource());

            for (JButton botón: panelButton.getButtons()) {
                if (!botón.getActionCommand().equals(al.getObjeto())) {
                    botón.setEnabled(false);
                }
            }

            panelTextArea.getTextArea().setText(al.getSopaActual());
        }

    }

    private JLabel generarLabel(String nombre, int tamañoFuente) {
        JLabel label = new JLabel(nombre);
        label.setFont(new Font("JetBrains Mono", Font.BOLD, tamañoFuente));
        return label;
    }

    private void setLabelButton(JButton button) {
        button.setText(button.getActionCommand());
    }

    private void resetear() {
        pulsarBotón = false;
        juegoActivo = false;
        labelElegir.setText("Elige el objeto: ");
        textIngreso.setText("");
        panelTextArea.getTextArea().setText("");
        panelTextArea.setTextFields("", "", "", "");
        for (JButton botón: panelButton.getButtons()) {
                botón.setEnabled(true);
                botón.setText("");
        }

        panelButton.generar();
    }

    private boolean comprobarJuego() {
        if (textIngreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            return true;
        }

        if (!pulsarBotón) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un botón.");
            return true;
        }

        if (juegoActivo) {
            JOptionPane.showMessageDialog(null, "Juego activo. Reinicie.");
            return true;
        }

        try {
            Integer.parseInt(textIngreso.getText().trim());
        }   catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Has introducido el número incorrectamente.");
            return true;
        }

        return false;
    }
}