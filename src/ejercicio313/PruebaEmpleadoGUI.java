package ejercicio313;

import javax.swing.JOptionPane;

public class PruebaEmpleadoGUI {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Empleado 1 - Primer nombre:");
        String apellido1 = JOptionPane.showInputDialog("Empleado 1 - Apellido:");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1 - Salario mensual:"));

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        String nombre2 = JOptionPane.showInputDialog("Empleado 2 - Primer nombre:");
        String apellido2 = JOptionPane.showInputDialog("Empleado 2 - Apellido:");
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2 - Salario mensual:"));

        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        String mensajeInicial = String.format(
                "--- SALARIOS ANUALES INICIALES ---\n" +
                        "%s %s: $%.2f\n" +
                        "%s %s: $%.2f",
                emp1.getPrimerNombre(), emp1.getApellidoPaterno(), emp1.getSalarioAnual(),
                emp2.getPrimerNombre(), emp2.getApellidoPaterno(), emp2.getSalarioAnual()
        );
        JOptionPane.showMessageDialog(null, mensajeInicial, "Salarios Iniciales", JOptionPane.INFORMATION_MESSAGE);

        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        String mensajeFinal = String.format(
                "--- SALARIOS ANUALES TRAS AUMENTO DEL 10%%\n" +
                        "%s %s: $%.2f\n" +
                        "%s %s: $%.2f",
                emp1.getPrimerNombre(), emp1.getApellidoPaterno(), emp1.getSalarioAnual(),
                emp2.getPrimerNombre(), emp2.getApellidoPaterno(), emp2.getSalarioAnual()
        );
        JOptionPane.showMessageDialog(null, mensajeFinal, "Salarios con Aumento", JOptionPane.INFORMATION_MESSAGE);
    }
}