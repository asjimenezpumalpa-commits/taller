package ejercicio314;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void setMes(int mes) { this.mes = mes; }
    public int getMes() { return mes; }

    public void setDia(int dia) { this.dia = dia; }
    public int getDia() { return dia; }

    public void setAnio(int anio) { this.anio = anio; }
    public int getAnio() { return anio; }

    public String mostrarFecha() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}
