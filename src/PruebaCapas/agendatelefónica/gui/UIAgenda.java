package PruebaCapas.agendatelefónica.gui;
import PruebaCapas.agendatelefónica.lógica.*;
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
 * ¿Por qué el JTextField se inicializa así?
 */

public class UIAgenda implements ActionListener{
    private int index = 0;
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel labelCI, labelNombre, labelApellido, labelFecha, labelTeléfono, labelDirección, labelÍndice,
    labelLíneaDivisoria, labelImagenUno, labelImagenDos, labelImagenTres, labelFondo;
    private JTextField textCI, textNombre, textApellido, textFecha, textTeléfono, textDirección, textÍndice;
    private JTextField[] textArray;
    private JButton buttonGuardar, buttonSiguiente, buttonAnterior;
    private JMenuBar menuBar;
    private JMenu menuTema, menuFondo, menuOtros;
    private JMenuItem menuCreador, menuSalir;
    ImageIcon imagenAntes, imagenDespués;
    Image imagenEscalada;

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

    private String[][] matrizFondos = {
            { "Predeterminado", "Ciudad.jpg"},
            { "Mar", "Mar.jpg"},
            { "Fitness Mujer", "Fitness Mujer.jpg"},
            { "Fitness Hombre", "Fitness Hombre.jpg"},
            { "Atardecer", "Atardecer.jpg"},
            { "Río", "Río.jpg"},
            { "Perros", "Perros.jpg"}
    };
    private JMenuItem[] fondos = new JMenuItem[matrizFondos.length];
    private final String rutaFondos = "src/PruebaCapas/resources/images/";

    public UIAgenda() throws IOException {
        frame = new JFrame();
        frame.setTitle("Agenda telefónica");
        frame.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(25, 25, 25));
        frame.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.CYAN);
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
        ImageIcon imagenTemas = new ImageIcon("src/PruebaCapas/resources/images/icono1.jpeg");
        Image imageEscaladaTemas = imagenTemas.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        imagenTemas = new ImageIcon(imageEscaladaTemas);
        menuTema.setIcon(imagenTemas);

        for (int i = 0; i < matrizTemas.length; i++) {
            temas[i] = new JMenuItem(matrizTemas[i][0]);
            menuTema.add(temas[i]);
            temas[i].addActionListener(this);
        }

        menuFondo = new JMenu("Fondos");
        ImageIcon imagenFondo = new ImageIcon("src/PruebaCapas/resources/images/equip.png");
        Image imageEscaladaFondo = imagenFondo.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        imagenFondo = new ImageIcon(imageEscaladaFondo);
        menuFondo.setIcon(imagenFondo);

        for (int i = 0; i < matrizFondos.length; i++) {
            fondos[i] = new JMenuItem(matrizFondos[i][0]);
            menuFondo.add(fondos[i]);
            fondos[i].addActionListener(this);
        }

        menuOtros = new JMenu("Otros");
        menuCreador = new JMenuItem("El Creador");
        menuSalir = new JMenuItem("Salir");

        menuOtros.add(menuCreador);
        menuCreador.addActionListener(this);
        menuOtros.add(menuSalir);
        menuSalir.addActionListener(this);

        menuBar.add(menuTema);
        menuBar.add(menuFondo);
        menuBar.add(menuOtros);

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
        textÍndice.setText(String.valueOf(index));
        textArray = new JTextField[]{textCI, textNombre, textApellido, textDirección, textTeléfono, textFecha};

        buttonAnterior = new JButton("<<");
        buttonAnterior.addActionListener(this);
        buttonGuardar = new JButton("Guardar");
        buttonGuardar.addActionListener(this);
        buttonSiguiente = new JButton(">>");
        buttonSiguiente.addActionListener(this);

        JPanel fila3 = new JPanel(new MigLayout("insets 0, gap 10, wrap 4"));
        fila3.add(buttonAnterior, "gapleft 140");
        fila3.add(buttonGuardar);
        fila3.add(buttonSiguiente);
        fila3.setOpaque(false);
        //fila3.setBackground(new Color(0, 0, 0));

        mainPanel.add(labelCI, "align right");
        mainPanel.add(textCI);
        mainPanel.add(labelDirección, "align right");
        mainPanel.add(textDirección);
        mainPanel.add(labelNombre, "align right");
        mainPanel.add(textNombre);
        mainPanel.add(labelTeléfono, "align right");
        mainPanel.add(textTeléfono);
        mainPanel.add(labelApellido, "align right");
        mainPanel.add(textApellido);
        mainPanel.add(labelFecha, "align right");
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

        imagenAntes = new ImageIcon("src/PruebaCapas/resources/images/Ciudad.jpg");
        imagenEscalada = imagenAntes.getImage().getScaledInstance(550, 350, Image.SCALE_SMOOTH);
        imagenDespués = new ImageIcon(imagenEscalada);
        labelFondo = new JLabel(imagenDespués);
        labelFondo.setLayout(new MigLayout("insets 0, fill"));
        labelFondo.add(mainPanel);
        frame.setContentPane(labelFondo);
        aplicarColores();

        //frame.setContentPane(mainPanel);
    }

    private void setupFrame() {
        frame.setSize(550, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        for (int i = 0; i < matrizTemas.length; i++) {
            if (ae.getActionCommand().equals(matrizTemas[i][0])) {
                try {
                    UIManager.setLookAndFeel(matrizTemas[i][1]);
                    SwingUtilities.updateComponentTreeUI(frame);
                    aplicarColores();
                }   catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
        }

        for (int i = 0; i < matrizFondos.length; i++) {
            if (ae.getActionCommand().equals(matrizFondos[i][0])) {
                ImageIcon nueva = new ImageIcon(rutaFondos + matrizFondos[i][1]);
                Image escalada  = nueva.getImage().getScaledInstance(550, 350, Image.SCALE_SMOOTH);
                labelFondo.setIcon(new ImageIcon(escalada));
                return;
            }
        }

        if (ae.getActionCommand().equals("Guardar")) {
            if (UsarDatos.comprobarDatos(textArray)) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos.");
                return;
            }
            UsarDatos.guardarDatos(textArray, index);
        }

        if (ae.getActionCommand().equals("<<")) {
            if (index > 0) {
                --index;
                textÍndice.setText(String.valueOf(index));
            }
            UsarDatos.limpiarDatos(textArray);

            if (Vectores.guardados[index]) {
                UsarDatos.mostrarDatos(textArray, index);
            }
        }

        if (ae.getActionCommand().equals(">>")) {
            if (index < 9) {
                ++index;
                textÍndice.setText(String.valueOf(index));
            }
            UsarDatos.limpiarDatos(textArray);

            if (Vectores.guardados[index]) {
                UsarDatos.mostrarDatos(textArray, index);
            }
        }

        if (ae.getActionCommand().equals("El Creador")) {
            JOptionPane.showMessageDialog(null, "Desarrollado por" +
                    " Angel Eduardo Pedraza Ordoñez.");

        }
        if (ae.getActionCommand().equals("Salir")) {
            System.exit(0);
        }
    }

    private void aplicarColores() {
        Color color = Color.BLACK;
        labelCI.setForeground(color);
        labelNombre.setForeground(color);
        labelApellido.setForeground(color);
        labelDirección.setForeground(color);
        labelTeléfono.setForeground(color);
        labelFecha.setForeground(color);
        labelÍndice.setForeground(color);
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

/*
labelCI        = new JLabel("<html><font color='#000000'>CI :</font></html>");
labelNombre    = new JLabel("<html><font color='#000000'>Nombre :</font></html>");
labelApellido  = new JLabel("<html><font color='#000000'>Apellidos :</font></html>");
labelDirección = new JLabel("<html><font color='#000000'>Dirección :</font></html>");
labelTeléfono  = new JLabel("<html><font color='#000000'>Teléfono :</font></html>");
labelFecha     = new JLabel("<html><font color='#000000'>F. Nac :</font></html>");
labelÍndice    = new JLabel("<html><font color='#000000'>Índice :</font></html>");
 */