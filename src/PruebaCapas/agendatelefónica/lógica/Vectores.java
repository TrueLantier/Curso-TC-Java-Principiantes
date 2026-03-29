package PruebaCapas.agendatelefónica.lógica;

public class Vectores {
    public static String[] ci = new String[10];
    public static String[] nombres = new String[10];
    public static String[] apellidos = new String[10];
    public static String[] teléfono = new String[10];
    public static String[] dirección = new String[10];
    public static String[] fecha = new String[10];
    public static boolean[] guardados = { false, false, false, false, false, false, false, false, false, false};

    public static String[][] datos = {
      ci,
      nombres,
      apellidos,
      dirección,
      teléfono,
      fecha
    };
}
