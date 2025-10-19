package ejercicioEmpleado;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual);
    }

    // Getters
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // Setter para salario con validación
    private void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            this.salarioMensual = 0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }

    // Métodos de cálculo
    public void aplicarAumento() {
        if (salarioMensual > 0) {
            salarioMensual *= 1.10; // Aumento del 10%
        }
    }

    public void mostrarSalarioAnual() {
        if (salarioMensual == 0) {
            System.out.println("El salario mensual es 0, no se puede calcular el salario anual.");
        } else {
            System.out.printf("Salario Anual: %.2f\n", salarioMensual * 12);
        }
    }
}
