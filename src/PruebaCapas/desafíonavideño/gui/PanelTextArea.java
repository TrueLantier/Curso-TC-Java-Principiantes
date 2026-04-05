package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class PanelTextArea extends JPanel{
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JLabel labelElegido, labelCantidad, labelEncontrados, labelResultado;
    private JTextField textElegido, textCantidad, textEncontrados, textResultado;

    public PanelTextArea() {
        setLayout(new MigLayout("insets 0, gap 10"));

        textArea = new JTextArea(10, 35);
        textArea.setLineWrap(true); // Salta de línea al llegar al final
        textArea.setWrapStyleWord(true); // Corta solo espacios entre palabras.
        textArea.setFont(new Font("JetBrains Mono", 1, 18));
        textArea.setForeground(Color.MAGENTA);
        scrollPane = new JScrollPane(textArea);

        JPanel panelDatos = new JPanel(new MigLayout("insets 0, gap 10, wrap 2"));

        //labelElegido = new JLabel("Elegido: ");
        labelElegido = generarLabel("Elegido:");
        labelCantidad = generarLabel("Cantidad:");
        labelEncontrados = generarLabel("Encontrados:");
        labelResultado = generarLabel("Resultados:");

        textElegido = new JTextField(10);
        textElegido.setEditable(false);
        textCantidad = new JTextField(10);
        textCantidad.setEditable(false);
        textEncontrados = new JTextField(10);
        textEncontrados.setEditable(false);
        textResultado = new JTextField(10);
        textResultado.setEditable(false);

        panelDatos.add(labelElegido, "align right");
        panelDatos.add(textElegido);
        panelDatos.add(labelCantidad,"align right");
        panelDatos.add(textCantidad);
        panelDatos.add(labelEncontrados, "align right");
        panelDatos.add(textEncontrados);
        panelDatos.add(labelResultado,"align right");
        panelDatos.add(textResultado);

        add(scrollPane);
        add(panelDatos);
    }

    private JLabel generarLabel(String nombre) {
        JLabel label = new JLabel(nombre);
        label.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        return label;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JLabel getLabelElegido() {
        return labelElegido;
    }

    public void setLabelElegido(JLabel labelElegido) {
        this.labelElegido = labelElegido;
    }

    public JLabel getLabelCantidad() {
        return labelCantidad;
    }

    public void setLabelCantidad(JLabel labelCantidad) {
        this.labelCantidad = labelCantidad;
    }

    public JLabel getLabelEncontrados() {
        return labelEncontrados;
    }

    public void setLabelEncontrados(JLabel labelEncontrados) {
        this.labelEncontrados = labelEncontrados;
    }

    public JLabel getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(JLabel labelResultado) {
        this.labelResultado = labelResultado;
    }

    public JTextField getTextElegido() {
        return textElegido;
    }

    public void setTextElegido(JTextField textElegido) {
        this.textElegido = textElegido;
    }

    public JTextField getTextCantidad() {
        return textCantidad;
    }

    public void setTextCantidad(JTextField textCantidad) {
        this.textCantidad = textCantidad;
    }

    public JTextField getTextEncontrados() {
        return textEncontrados;
    }

    public void setTextEncontrados(JTextField textEncontrados) {
        this.textEncontrados = textEncontrados;
    }

    public JTextField getTextResultado() {
        return textResultado;
    }

    public void setTextResultado(JTextField textResultado) {
        this.textResultado = textResultado;
    }
}
