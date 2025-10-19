package ejercicioFrecCard;
import java.util.Scanner;

public class MainFrecCard {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su primer nombre: ");
        String primerNombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese su dia de nacimiento: ");
        int diaNacimiento = entrada.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        int mesNacimiento = entrada.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        int anoNacimiento = entrada.nextInt();

        FrecCard persona = new FrecCard(primerNombre, apellido, diaNacimiento, mesNacimiento, anoNacimiento);
        persona.mostrarInformacion();
    }
}
