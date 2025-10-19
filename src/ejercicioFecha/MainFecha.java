package ejercicioFecha;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainFecha {
    public static void main(String[] args) throws IOException {
        // Crear BufferedReader para leer datos
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== SISTEMA DE FECHAS ===\n");

        // Solicitar mes
        System.out.print("Ingrese el mes (1-12): ");
        String mesStr = lector.readLine();
        int mes = Integer.parseInt(mesStr);

        // Solicitar día
        System.out.print("Ingrese el día: ");
        String diaStr = lector.readLine();
        int dia = Integer.parseInt(diaStr);

        // Solicitar año
        System.out.print("Ingrese el año: ");
        String anioStr = lector.readLine();
        int anio = Integer.parseInt(anioStr);

        // Crear objeto Fecha
        Fecha fecha1 = new Fecha(mes, dia, anio);

        // Mostrar la fecha
        System.out.print("\nLa fecha ingresada es: ");
        fecha1.mostrarFecha();

        // Mostrar información detallada
        System.out.println("\n=== INFORMACIÓN DETALLADA ===");
        System.out.println("Mes: " + fecha1.getMes());
        System.out.println("Día: " + fecha1.getDia());
        System.out.println("Año: " + fecha1.getAnio());

        // Demostrar métodos SET
        System.out.println("\n=== MODIFICANDO LA FECHA ===");
        fecha1.setMes(12);
        fecha1.setDia(25);
        fecha1.setAnio(2025);

        System.out.print("Nueva fecha: ");
        fecha1.mostrarFecha();

        // Crear una segunda fecha
        Fecha navidad = new Fecha(12, 25, 2025);
        System.out.print("\nFecha de Navidad 2025: ");
        navidad.mostrarFecha();

        // Cerrar BufferedReader
        lector.close();
    }
}