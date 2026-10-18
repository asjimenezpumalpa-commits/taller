package ejercicio316;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public String getPrimerNombre() { return primerNombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getApellido() { return apellido; }

    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }

    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }
    public int getDiaNacimiento() { return diaNacimiento; }

    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

    public int calcularEdad(int diaActual, int mesActual, int anioActual) {
        int edad = anioActual - anioNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        return edad;
    }

    public int getFrecuenciaCardiacaMaxima(int diaActual, int mesActual, int anioActual) {
        return 220 - calcularEdad(diaActual, mesActual, anioActual);
    }

    public String getRangoFrecuenciaCardiacaEsperada(int diaActual, int mesActual, int anioActual) {
        int max = getFrecuenciaCardiacaMaxima(diaActual, mesActual, anioActual);
        int minEsperada = (int) (max * 0.50);
        int maxEsperada = (int) (max * 0.85);
        return String.format("%d - %d ppm", minEsperada, maxEsperada);
    }
}