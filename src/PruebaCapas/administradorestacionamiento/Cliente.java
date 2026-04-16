package PruebaCapas.administradorestacionamiento;

public class Cliente {
    private final String nombreCliente;
    private String patenteVehículo;
    private double factura;

    public Cliente(String nombreCliente, String patenteVehículo) {
        this.nombreCliente = nombreCliente;
        this.patenteVehículo = patenteVehículo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPatenteVehículo() {
        return patenteVehículo;
    }

    public void setPatenteVehículo(String patenteVehículo) {
        this.patenteVehículo = patenteVehículo;
    }

    public double getFactura() {
        return factura;
    }

    public void setFactura(double factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", patenteVehículo='" + patenteVehículo + '\'' +
                ", factura=" + factura +
                '}';
    }
}
