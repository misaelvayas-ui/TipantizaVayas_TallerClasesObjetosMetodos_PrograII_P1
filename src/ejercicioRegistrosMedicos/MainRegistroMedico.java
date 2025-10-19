package ejercicioRegistrosMedicos;

import java.util.Scanner;

public class MainRegistroMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE PERFIL MÉDICO ===\n");

        // Solicitar información personal
        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su sexo (Masculino/Femenino): ");
        String sexo = entrada.nextLine();

        // Solicitar fecha de nacimiento
        System.out.println("\n--- Fecha de Nacimiento ---");
        System.out.print("Mes (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Día: ");
        int dia = entrada.nextInt();

        System.out.print("Año: ");
        int anio = entrada.nextInt();

        // Solicitar datos físicos
        System.out.println("\n--- Datos Físicos ---");
        System.out.print("Altura en centímetros: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso en kilogramos: ");
        double peso = entrada.nextDouble();

        // Crear objeto PerfilMedico
        RegistroMedico perfil = new RegistroMedico(nombre, apellido, sexo,
                mes, dia, anio,
                altura, peso);

        // Mostrar información completa
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         PERFIL MÉDICO COMPLETO");
        System.out.println("=".repeat(50));

        // Información personal
        System.out.println("\n--- INFORMACIÓN PERSONAL ---");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " +
                perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de Nacimiento: " + perfil.obtenerFechaNacimiento());
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        // Índice de Masa Corporal
        System.out.println("\n--- ÍNDICE DE MASA CORPORAL (IMC) ---");
        System.out.printf("IMC: %.2f\n", perfil.calcularIMC());
        System.out.println("Clasificación: " + perfil.clasificarIMC());

        // Tabla de valores del IMC
        System.out.println("\n--- VALORES DE IMC ---");
        System.out.println("Bajo peso:  menos de 18.5");
        System.out.println("Normal:     entre 18.5 y 24.9");
        System.out.println("Sobrepeso:  entre 25 y 29.9");
        System.out.println("Obeso:      30 o más");

        // Frecuencias cardiacas
        System.out.println("\n--- FRECUENCIAS CARDIACAS ---");
        System.out.println("Frecuencia Cardíaca Máxima: " +
                perfil.calcularFrecuenciaMaxima() + " ppm");
        System.out.printf("Rango de Frecuencia Esperada:\n");
        System.out.printf("  Mínimo (50%%): %.0f ppm\n",
                perfil.calcularFrecuenciaEsperadaMinima());
        System.out.printf("  Máximo (85%%): %.0f ppm\n",
                perfil.calcularFrecuenciaEsperadaMaxima());

        System.out.println("\n" + "=".repeat(50));
        System.out.println("NOTA: Consulte a un médico profesional para");
        System.out.println("evaluación y recomendaciones personalizadas.");
        System.out.println("=".repeat(50));

        entrada.close();
    }
}
