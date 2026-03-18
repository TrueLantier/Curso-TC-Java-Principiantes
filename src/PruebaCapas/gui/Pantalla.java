package PruebaCapas.gui;
import net.miginfocom.swing.MigLayout;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import javax.swing.*;
import java.awt.event.*;


public class Pantalla implements ActionListener {
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel labelUno, labelDos;
    private JTextField textUno, textDos;
    private JButton buttonCopiar;

    public Pantalla() {
        frame = new JFrame("Copiadora");
        initComponents();
        setupFrame();
    }

    private void initComponents() {
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 1" ));

        labelUno = new JLabel("Ingrese un texto:");
        labelDos = new JLabel("El texto que usted ingresó es:");

        textUno = new JTextField(20);
        textDos = new JTextField(20);

        buttonCopiar = new JButton("Copiar");
        buttonCopiar.addActionListener(this);

        mainPanel.add(labelUno);
        mainPanel.add(textUno);
        mainPanel.add(buttonCopiar);
        mainPanel.add(labelDos);
        mainPanel.add(textDos);

        frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(300, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String texto = textUno.getText();
        textDos.setText(texto);
    }
}
