package PruebaCapas.desafíonavideño.logic;

public class AdivinanzasComprobación {
    String tema;
    String[] respuestas = {"Ganó!!!", "No ganó.", };
    String elegido;
    String encontrados;
    String cantidad;
    String resultados;
    boolean ganar;

    private final String[][] RESPUESTASOP = {
            {"LUFFY", "3"},
            {"MUGIWARA", "2"},
            {"SUNNY", "5"},
            {"HAKI", "4"}
    };

    private final String[][] RESPUESTASSS = {
            {"DREAM", "3"},
            {"SPELL", "2"},
            {"NEPHIS", "5"},
            {"CREATURE", "4"}
    };

    public void comprobarElección() {
        if (tema.equals("One Piece")) {
            for (String[] strings : RESPUESTASOP) {
                if (strings[0].equals(elegido.toUpperCase())) {
                    cantidad = strings[1];
                    if (cantidad.equals(encontrados)) {
                        ganar = true;
                        resultados = respuestas[0];
                    } else {
                        ganar = false;
                        resultados = respuestas[1];
                    }
                    return;
                }
            }
        }   else {
            for (String[] respuestasss : RESPUESTASSS) {
                if (respuestasss[0].equals(elegido.toUpperCase())) {
                    cantidad = respuestasss[1];
                    if (cantidad.equals(encontrados)) {
                        ganar = true;
                        resultados = respuestas[0];
                    } else {
                        ganar = false;
                        resultados = respuestas[1];
                    }
                    return;
                }
            }
        }
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public String getElegido() {
        return elegido;
    }

    public void setElegido(String elegido) {
        this.elegido = elegido;
    }

    public String getEncontrados() {
        return encontrados;
    }

    public void setEncontrados(String encontrados) {
        this.encontrados = encontrados;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public boolean isGanar() {
        return ganar;
    }

    public void setGanar(boolean ganar) {
        this.ganar = ganar;
    }
}
