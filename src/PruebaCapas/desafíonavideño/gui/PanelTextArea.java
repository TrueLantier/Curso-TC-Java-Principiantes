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
        //textArea.setEditable(false);
        textArea.setFont(new Font("JetBrains Mono", 1, 14));
        textArea.setForeground(Color.MAGENTA);
        scrollPane = new JScrollPane(textArea);

        JPanel panelDatos = new JPanel(new MigLayout("insets 0, gap 10, wrap 2"));

        labelElegido = new JLabel("Elegido: ");
        labelCantidad = new JLabel("Cantidad: ");
        labelEncontrados = new JLabel("Encontrados: ");
        labelResultado = new JLabel("Resultado: ");

        textElegido = new JTextField(10);
        textCantidad = new JTextField(10);
        textEncontrados = new JTextField(10);
        textResultado = new JTextField(10);

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
}
