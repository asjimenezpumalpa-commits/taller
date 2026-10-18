package ejercicio312;

import javax.swing.JOptionPane;

public class PruebaFacturaGUI {
    public static void main(String[] args) {
        String numeroPieza = JOptionPane.showInputDialog("Introduzca el número de pieza:");
        String descripcionPieza = JOptionPane.showInputDialog("Introduzca la descripción de la pieza:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de artículos:"));
        double precioPorArticulo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio por artículo:"));

        ejerfactura factura = new ejerfactura(numeroPieza, descripcionPieza, cantidad, precioPorArticulo);

        String resultado = String.format(
                "Factura Creada Exitosamente\n\n" +
                        "Número de pieza: %s\n" +
                        "Descripción: %s\n" +
                        "Cantidad: %d\n" +
                        "Precio por artículo: $%.2f\n" +
                        "TOTAL DE LA FACTURA: $%.2f",
                factura.getNumeroPieza(),
                factura.getDescripcionPieza(),
                factura.getCantidad(),
                factura.getPrecioPorArticulo(),
                factura.obtenerMontoFactura()
        );

        JOptionPane.showMessageDialog(null, resultado, "Resultado de Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}