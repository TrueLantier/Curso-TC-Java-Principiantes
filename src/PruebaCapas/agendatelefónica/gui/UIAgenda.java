package PruebaCapas.agendatelefónica.gui;
import net.miginfocom.swing.MigLayout;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UIAgenda {
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel labelCI, labelNombre, labelApellido, labelFecha, labelTeléfono, labelDirección, labelÍndice,
    labelLíneaDivisoria;
    private JTextField textCI, textNombre, textApellido, textFecha, textTeléfono, textDirección, textÍndice;
    private JButton buttonGuardar, buttonSiguiente, buttonAnterior;

    public UIAgenda() throws IOException {
        frame = new JFrame("Agenda Telefónica");
        initComponents();
        setupFrame();
    }

    private void initComponents() {
        //mainPanel = new JPanel(new MigLayout("debug, insets 20, gap 10, fillx" ));
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 4" ));

        labelCI = new JLabel("CI :");
        labelNombre = new JLabel("Nombre :");
        labelApellido = new JLabel("Apellidos :");
        labelDirección = new JLabel("Dirección :");
        labelTeléfono = new JLabel("Teléfono :");
        labelFecha = new JLabel("F. Nac :");
        labelLíneaDivisoria = new JLabel("");
        labelÍndice = new JLabel("Índice :");

        textCI = new JTextField(20);
        textNombre = new JTextField(20);
        textApellido = new JTextField(20);
        textDirección = new JTextField(20);
        textTeléfono = new JTextField(20);
        textFecha = new JTextField(20);
        textÍndice = new JTextField(10);
        textÍndice.setEditable(false);

        buttonAnterior = new JButton("<<");
        buttonGuardar = new JButton("Guardar");
        buttonSiguiente = new JButton(">>");

        mainPanel.add(labelCI);
        mainPanel.add(textCI);
        mainPanel.add(labelDirección);
        mainPanel.add(textDirección);
        mainPanel.add(labelNombre);
        mainPanel.add(textNombre);
        mainPanel.add(labelTeléfono);
        mainPanel.add(textTeléfono);
        mainPanel.add(labelApellido);
        mainPanel.add(textApellido);
        mainPanel.add(labelFecha);
        mainPanel.add(textFecha);
        mainPanel.add(new JSeparator(), "growx, span, wrap");
        //mainPanel.add(buttonAnterior, "gap 50 0 0 10");
        mainPanel.add(buttonAnterior, "span 2, align right, gaptop 15");
        mainPanel.add(buttonGuardar);
        mainPanel.add(buttonSiguiente, "wrap");
        mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(labelÍndice, "span 2, align right");
        mainPanel.add(textÍndice);

        frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(500, 300);
        //frame.setTitle(new Font("Segoe UI", Font.BOLD, 24));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
