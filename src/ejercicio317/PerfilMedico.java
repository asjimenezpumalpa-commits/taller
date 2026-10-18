package ejercicio317;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String genero;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;
    private double altura; // en pulgadas
    private double peso; // en libras

    public PerfilMedico(String primerNombre, String apellido, String genero, int mesNacimiento, int diaNacimiento, int anioNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.genero = genero;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public String getPrimerNombre() { return primerNombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getApellido() { return apellido; }

    public void setGenero(String genero) { this.genero = genero; }
    public String getGenero() { return genero; }

    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }

    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }
    public int getDiaNacimiento() { return diaNacimiento; }

    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

    public void setAltura(double altura) { this.altura = altura; }
    public double getAltura() { return altura; }

    public void setPeso(double peso) { this.peso = peso; }
    public double getPeso() { return peso; }

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

    public double calcularIMC() {
        return (peso * 703) / (altura * altura);
    }
}