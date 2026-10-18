package ejercicio314;

import javax.swing.JOptionPane;

public class PruebaFechaGUI {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año (AAAA):"));

        Fecha fecha = new Fecha(mes, dia, anio);

        String resultado = String.format("La fecha ingresada es: %s", fecha.mostrarFecha());
        JOptionPane.showMessageDialog(null, resultado, "Fecha Ingresada", JOptionPane.INFORMATION_MESSAGE);
    }
}