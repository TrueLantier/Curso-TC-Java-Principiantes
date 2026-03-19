package PruebaCapas.agendatelefónica.gui;
import net.miginfocom.swing.MigLayout;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class UIAgenda {
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel labelCI, labelNombre, labelApellido, labelFecha, labelTeléfono, labelDirección;
    private JTextField textCI, textNombre, textApellido, textFecha, textTeléfono, textDirección;
    private JButton buttonGuardar, buttonSiguiente, buttonAnterior;

    public UIAgenda() throws IOException {
        frame = new JFrame("Agenda Telefónica");
    }

    private void initComponents() {

    }
}
