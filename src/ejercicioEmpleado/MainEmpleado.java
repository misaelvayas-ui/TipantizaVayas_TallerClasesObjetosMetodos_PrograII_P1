package ejercicioEmpleado;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para el primer empleado
        System.out.println("Ingrese los datos del primer empleado:");
        System.out.print("Primer nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Salario mensual: ");
        double salario1 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Solicitar datos para el segundo empleado
        System.out.println("\nIngrese los datos del segundo empleado:");
        System.out.print("Primer nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellido2 = scanner.nextLine();
        System.out.print("Salario mensual: ");
        double salario2 = scanner.nextDouble();

        // Crear instancias de Empleado
        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println("\n--- Resultados ---");

        // Empleado 1
        System.out.printf("Nombre Empleado 1: %s\n", empleado1.getPrimerNombre());
        System.out.printf("Apellido Empleado 1: %s\n", empleado1.getApellidoPaterno());
        System.out.printf("Salario Mensual Empleado 1: %.2f\n", empleado1.getSalarioMensual());
        empleado1.mostrarSalarioAnual();
        empleado1.aplicarAumento();
        System.out.printf("Empleado 1 después del aumento: %.2f\n", empleado1.getSalarioMensual());
        empleado1.mostrarSalarioAnual();
        System.out.println();

        // Empleado 2
        System.out.printf("Nombre Empleado 2: %s\n", empleado2.getPrimerNombre());
        System.out.printf("Apellido Empleado 2: %s\n", empleado2.getApellidoPaterno());
        System.out.printf("Salario Mensual Empleado 2: %.2f\n", empleado2.getSalarioMensual());
        empleado2.mostrarSalarioAnual();
        empleado2.aplicarAumento();
        System.out.printf("Empleado 2 después del aumento: %.2f\n", empleado2.getSalarioMensual());
        empleado2.mostrarSalarioAnual();

        scanner.close();
    }
}
