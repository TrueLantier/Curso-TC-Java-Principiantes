package PruebaCapas.agendatelefónica.gui;
import net.miginfocom.swing.MigLayout;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ¿Qué hace pack()?
 * ¿Por qué no puedo cambiar el título?
 */

public class UIAgenda implements ActionListener{
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel labelCI, labelNombre, labelApellido, labelFecha, labelTeléfono, labelDirección, labelÍndice,
    labelLíneaDivisoria, labelImagenUno, labelImagenDos, labelImagenTres, labelFondo;
    private JTextField textCI, textNombre, textApellido, textFecha, textTeléfono, textDirección, textÍndice;
    private JButton buttonGuardar, buttonSiguiente, buttonAnterior;
    private JMenuBar menuBar;
    private JMenu menuTema, menuFondo;
    ImageIcon imagen = new ImageIcon("src/PruebaCapas/resources/images/2084239.png");
    Image imagenF = imagen.getImage();

    private String[][] matrizTemas = {
            {"FlatLaf Light",        FlatLightLaf.class.getName()},
            {"FlatLaf Dark",         FlatDarkLaf.class.getName()},
            {"FlatLaf IntelliJ",     FlatIntelliJLaf.class.getName()},
            {"FlatLaf Darcula",      FlatDarculaLaf.class.getName()},
            {"FlatMacLight",         FlatMacLightLaf.class.getName()},
            {"FlatMacDark",          FlatMacDarkLaf.class.getName()},
            {"System (Swing)",       UIManager.getSystemLookAndFeelClassName()},
            {"Nimbus", "javax.swing.plaf.nimbus.NimbusLookAndFeel"},
            {"Metal", "javax.swing.plaf.metal.MetalLookAndFeel"},
            {"Motif", "com.sun.java.swing.plaf.motif.MotifLookAndFeel"}
    };
    private JMenuItem[] temas = new JMenuItem[matrizTemas.length];

    public UIAgenda() throws IOException {
        frame = new JFrame();
        frame.setTitle("Agenda telefónica");
//        frame.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(25, 25, 25));
//        frame.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.BLACK);
        initComponents();
        setupFrame();
    }

    private void initComponents() {
        //mainPanel = new JPanel(new MigLayout("debug, insets 20, gap 10, fillx" ));
//        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 4" )) {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.drawImage(imagenF, 0, 0, getWidth(), getHeight(), this);
//            }
//        };
        mainPanel = new JPanel(new MigLayout("insets 20, gap 10, wrap 4" ));

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        menuTema = new JMenu("Temas");
        menuFondo = new JMenu("Fondos");

        ImageIcon imagenTemas = new ImageIcon("src/PruebaCapas/resources/images/icono1.jpeg");
        //ImageIcon imagenTemas = new ImageIcon("src/PruebaCapas/resources/images/files(0)/java.svg");
        Image imageEscaladaTemas = imagenTemas.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        imagenTemas = new ImageIcon(imageEscaladaTemas);
        menuTema.setIcon(imagenTemas);

        ImageIcon imagenFondo = new ImageIcon("src/PruebaCapas/resources/images/equip.png");
        Image imageEscaladaFondo = imagenFondo.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        imagenFondo = new ImageIcon(imageEscaladaFondo);
        menuFondo.setIcon(imagenFondo);

        for (int i = 0; i < matrizTemas.length; i++) {
            temas[i] = new JMenuItem(matrizTemas[i][0]);
            menuTema.add(temas[i]);
            temas[i].addActionListener(this);
        }

        labelCI = new JLabel("CI :");
        labelNombre = new JLabel("Nombre :");
        labelApellido = new JLabel("Apellidos :");
        labelDirección = new JLabel("Dirección :");
        labelTeléfono = new JLabel("Teléfono :");
        labelFecha = new JLabel("F. Nac :");
        labelÍndice = new JLabel("Índice :");

        ImageIcon imagenLabelUno = new ImageIcon("src/PruebaCapas/resources/images/attack.png");
        Image imagenEscaladaLabelUno = imagenLabelUno.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon imagenUno = new ImageIcon(imagenEscaladaLabelUno);
        labelImagenUno = new JLabel(imagenUno);

        ImageIcon imagenLabelDos = new ImageIcon("src/PruebaCapas/resources/images/act.png");
        Image imagenEscaladaLabelDos = imagenLabelDos.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon imagenDos = new ImageIcon(imagenEscaladaLabelDos);
        labelImagenDos = new JLabel(imagenDos);

        ImageIcon imagenLabelTres = new ImageIcon("src/PruebaCapas/resources/images/chain.png");
        Image imagenEscaladaLabelTres = imagenLabelTres.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon imagenTres = new ImageIcon(imagenEscaladaLabelTres);
        labelImagenTres = new JLabel(imagenTres);

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

        JPanel fila3 = new JPanel(new MigLayout("insets 0, gap 10, wrap 4"));
        fila3.add(buttonAnterior, "gapleft 140");
        fila3.add(buttonGuardar);
        fila3.add(buttonSiguiente);
        fila3.setOpaque(false);
        //fila3.setBackground(new Color(0, 0, 0));

        menuBar.add(menuTema);
        menuBar.add(menuFondo);

        mainPanel.add(labelCI, "align right");
        mainPanel.add(textCI);
        mainPanel.add(labelDirección);
        mainPanel.add(textDirección);
        mainPanel.add(labelNombre, "align right");
        mainPanel.add(textNombre);
        mainPanel.add(labelTeléfono);
        mainPanel.add(textTeléfono);
        mainPanel.add(labelApellido, "align right");
        mainPanel.add(textApellido);
        mainPanel.add(labelFecha);
        mainPanel.add(textFecha);
        //mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(fila3, "span, gap 0 0 10 10");
        //mainPanel.add(new JSeparator(), "growx, span, wrap");
        mainPanel.add(labelÍndice, "span 2, align right");
        mainPanel.add(textÍndice, "wrap");
        mainPanel.add(new ClockLabel());
        mainPanel.add(labelImagenUno);
        mainPanel.add(labelImagenDos);
        mainPanel.add(labelImagenTres, "align center");
        mainPanel.setOpaque(false);
        //mainPanel.setBackground(new Color(0, 0, 0));

        /**
         * FUNCIONA
         *         ImageIcon imagenA = new ImageIcon("src/PruebaCapas/resources/images/2084239.png");
         *         labelFondo = new JLabel(imagenA);
         *         labelFondo.setLayout(new MigLayout("insets 0, fill"));
         *         labelFondo.add(mainPanel);
         *         frame.setContentPane(labelFondo);
         */

        ImageIcon imagenA = new ImageIcon("src/PruebaCapas/resources/images/foto1.jpg");
        Image imagenAA = imagenA.getImage().getScaledInstance(550, 350, Image.SCALE_SMOOTH);
        ImageIcon imagenAAA = new ImageIcon(imagenAA);
        labelFondo = new JLabel(imagenAAA);
        labelFondo.setLayout(new MigLayout("insets 0, fill"));
        labelFondo.add(mainPanel);
        frame.setContentPane(labelFondo);

        //frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(550, 350);
        //frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            for (int i = 0; i < matrizTemas.length; i++) {
                if (ae.getActionCommand().equals(matrizTemas[i][0])) {
                    UIManager.setLookAndFeel(matrizTemas[i][1]);
                    SwingUtilities.updateComponentTreeUI(frame);
                    //frame.pack(); // Qué hace exactamente?
                    //textÍndice.setText(matrizTemas[i][0]);
                }
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

