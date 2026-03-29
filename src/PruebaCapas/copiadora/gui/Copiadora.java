package PruebaCapas.copiadora.gui;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Copiadora implements ActionListener {
    private final JFrame frame;
    private JMenuBar menuBar;
    private JMenu temas;
    private JMenuItem system, nimbus;
    private JPanel mainPanel;
    private JLabel labelUno, labelDos;
    private JTextField textUno, textDos;
    private JButton buttonCopiar, buttonLimpiar;

    public Copiadora() throws Exception{
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        frame = new JFrame("Copiadora");
        initComponents();
        setupFrame();
    }

    private void initComponents() {
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 1" ));
        //mainPanel = new JPanel(new MigLayout("debug, insets 20, gap 10, wrap 1" ));
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        temas = new JMenu("Temas");
        system = new JMenuItem("LaF System");
        system.setActionCommand("System");
        system.addActionListener(this);
        nimbus = new JMenuItem("LaF Nimbus");
        temas.add(system);
        temas.add(nimbus);
        menuBar.add(temas);

        labelUno = new JLabel("Ingrese un texto:");
        labelDos = new JLabel("El texto que usted ingresó es:");

        textUno = new JTextField(20);
        textUno.setActionCommand("primero");
        textUno.addActionListener(this);

        textDos = new JTextField(20);
        textDos.setEditable(false);

        buttonCopiar = new JButton("Copiar");
        buttonCopiar.addActionListener(this);

        buttonLimpiar = new JButton("Limpiar");
        buttonLimpiar.addActionListener(this);

        mainPanel.add(new ClockLabel());
        mainPanel.add(labelUno, "gaptop 15");
        mainPanel.add(textUno);
        mainPanel.add(buttonCopiar, "align center, gaptop 15");
        // El "!" de MigLayout significa: exactamente este valor, no negocies.
        // gapleft/gapright Xpx --> horizontal | gaptop/gapbottom Xpx --> vertical
        // X píxeles en una dirección del botón.
        // gw(x o y) X --> X píxeles en ambas direcciones.
        //mainPanel.add(buttonCopiar, "align left");
        //mainPanel.add(buttonCopiar, "align right");
        mainPanel.add(labelDos);
        mainPanel.add(textDos);
        mainPanel.add(buttonLimpiar, "align center, gaptop 15");

        frame.setContentPane(mainPanel);
    }

    private void setupFrame() throws Exception{
        frame.setSize(300, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String texto = textUno.getText();

        if (ae.getActionCommand().equals("primero")) {
            textDos.setText(texto);
        }

        if (ae.getActionCommand().equals("Copiar")) {
            textDos.setText(texto);
        }

        if (ae.getActionCommand().equals("Limpiar")) {
            textUno.setText("");
            textDos.setText("");
        }

        try {
            if (ae.getActionCommand().equals("System")) {
                textUno.setText("Funciona");
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(frame);
                frame.pack();
            }
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ClockLabel extends JLabel {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public ClockLabel() {
        setHorizontalAlignment(SwingConstants.CENTER);
        updateTime();

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        setText(LocalDateTime.now().format(FORMATTER));
    }
}
