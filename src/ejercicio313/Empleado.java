package ejercicio313;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual);
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            this.salarioMensual += this.salarioMensual * (porcentaje / 100);
        }
    }
}