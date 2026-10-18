package ejercicio316;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class PruebaFrecuenciasCardiacasGUI {
    public static void main(String[] args) {
        String primerNombre = JOptionPane.showInputDialog("Introduzca su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Introduzca su apellido:");
        int mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su mes de nacimiento (1-12):"));
        int diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su día de nacimiento:"));
        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento (AAAA):"));

        FrecuenciasCardiacas personal = new FrecuenciasCardiacas(primerNombre, apellido, mesNacimiento, diaNacimiento, anioNacimiento);

        Calendar cal = Calendar.getInstance();
        int anioActual = cal.get(Calendar.YEAR);
        int mesActual = cal.get(Calendar.MONTH) + 1;
        int diaActual = cal.get(Calendar.DAY_OF_MONTH);

        int edad = personal.calcularEdad(diaActual, mesActual, anioActual);
        int frecMax = personal.getFrecuenciaCardiacaMaxima(diaActual, mesActual, anioActual);
        String rangoEsperado = personal.getRangoFrecuenciaCardiacaEsperada(diaActual, mesActual, anioActual);

        String resultado = String.format(
                "--- INFORMACIÓN DEL PACIENTE ---\n" +
                        "Nombre: %s %s\n" +
                        "Fecha de Nacimiento: %d/%d/%d\n" +
                        "Edad: %d años\n\n" +
                        "--- RESULTADOS DE FRECUENCIA CARDÍACA ---\n" +
                        "Frecuencia Cardíaca Máxima: %d ppm\n" +
                        "Rango Esperado: %s",
                personal.getPrimerNombre(), personal.getApellido(),
                personal.getDiaNacimiento(), personal.getMesNacimiento(), personal.getAnioNacimiento(),
                edad, frecMax, rangoEsperado
        );

        JOptionPane.showMessageDialog(null, resultado, "Frecuencia Cardíaca", JOptionPane.INFORMATION_MESSAGE);
    }
}