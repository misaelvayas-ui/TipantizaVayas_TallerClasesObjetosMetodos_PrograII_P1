package ejercicioFrecCard;
import java.time.LocalDate;
import java.time.Period;

public class FrecCard {
    private String primerNombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public FrecCard(String primerNombre, String apellido, int diaNacimiento, int mesNacimiento, int anoNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);
    }


    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }


    public int frecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }


    public String rangeFrecCard() {
        int frecMax = frecuenciaCardiacaMaxima();
        double frecMin = frecMax * 0.5;
        double frecMaxEsperada = frecMax * 0.85;
        return "El rango esperado esta entre " + String.format("%.1f", frecMin) + " y " + String.format("%.1f", frecMaxEsperada) + " lpm.";
    }


    public void mostrarInformacion() {
        int edad = calcularEdad();
        int frecMax = frecuenciaCardiacaMaxima();

        System.out.println("Nombre: " + primerNombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Frecuencia cardiaca máxima: " + frecMax + " lpm. ");
        System.out.println(rangeFrecCard());
    }
}
