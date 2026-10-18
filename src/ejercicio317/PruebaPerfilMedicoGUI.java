package ejercicio317;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class PruebaPerfilMedicoGUI {
    public static void main(String[] args) {
        String primerNombre = JOptionPane.showInputDialog("Introduzca su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Introduzca su apellido:");
        String genero = JOptionPane.showInputDialog("Introduzca su género (M/F):");
        int mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        int diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento (AAAA):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura en pulgadas (ej. 68):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso en libras (ej. 150):"));

        PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, genero, mesNacimiento, diaNacimiento, anioNacimiento, altura, peso);

        Calendar cal = Calendar.getInstance();
        int anioActual = cal.get(Calendar.YEAR);
        int mesActual = cal.get(Calendar.MONTH) + 1;
        int diaActual = cal.get(Calendar.DAY_OF_MONTH);

        int edad = perfil.calcularEdad(diaActual, mesActual, anioActual);
        int frecMax = perfil.getFrecuenciaCardiacaMaxima(diaActual, mesActual, anioActual);
        String rangoEsperado = perfil.getRangoFrecuenciaCardiacaEsperada(diaActual, mesActual, anioActual);
        double imc = perfil.calcularIMC();

        String resultado = String.format(
                "--- PERFIL MÉDICO DEL PACIENTE ---\n" +
                        "Nombre: %s %s\n" +
                        "Género: %s\n" +
                        "Fecha de Nacimiento: %d/%d/%d\n" +
                        "Edad: %d años\n" +
                        "Altura: %.1f in | Peso: %.1f lbs\n\n" +
                        "--- INDICADORES DE SALUD ---\n" +
                        "Frecuencia Cardíaca Máxima: %d ppm\n" +
                        "Rango Esperado: %s\n" +
                        "Índice de Masa Corporal (IMC): %.2f\n\n" +
                        "Valores de IMC de referencia:\n" +
                        "Bajo peso: menos de 18.5\n" +
                        "Normal: entre 18.5 y 24.9\n" +
                        "Sobrepeso: entre 25 y 29.9\n" +
                        "Obeso: 30 o más",
                perfil.getPrimerNombre(), perfil.getApellido(), perfil.getGenero(),
                perfil.getDiaNacimiento(), perfil.getMesNacimiento(), perfil.getAnioNacimiento(),
                edad, perfil.getAltura(), perfil.getPeso(),
                frecMax, rangoEsperado, imc
        );

        JOptionPane.showMessageDialog(null, resultado, "Perfil Médico", JOptionPane.INFORMATION_MESSAGE);
    }
}