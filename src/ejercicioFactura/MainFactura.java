package ejercicioFactura;
import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        // Crear Scanner para leer del teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE FACTURACIÓN ===\n");

        // Solicitar datos al usuario
        System.out.print("Ingrese el número de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cant = entrada.nextInt();

        System.out.print("Ingrese el precio por artículo: ");
        double precio = entrada.nextDouble();

        // Crear objeto Factura con los datos ingresados
        Factura factura1 = new Factura(numero, descripcion, cant, precio);

        // Mostrar información de la factura
        System.out.println("\n=== INFORMACIÓN DE LA FACTURA ===");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: $" + factura1.getPrecioPorArticulo());
        System.out.printf("TOTAL A PAGAR: $%.2f\n", factura1.obtenerMontoFactura());

        // Prueba con valores negativos (para demostrar validación)
        System.out.println("\n=== PRUEBA CON VALORES NEGATIVOS ===");
        Factura factura2 = new Factura("P002", "Clavos", -5, -10.50);
        System.out.println("Cantidad (con valor negativo): " + factura2.getCantidad());
        System.out.println("Precio (con valor negativo): $" + factura2.getPrecioPorArticulo());
        System.out.println("Total: $" + factura2.obtenerMontoFactura());

        // Cerrar Scanner
        entrada.close();
    }
}