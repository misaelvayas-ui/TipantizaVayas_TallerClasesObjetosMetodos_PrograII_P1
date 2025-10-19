package ejercicioRegistrosMedicos;

public class RegistroMedico {
    // Variables de instancia
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;
    private double altura;  // en centímetros
    private double peso;    // en kilogramos

    // Constructor
    public RegistroMedico(String primerNombre, String apellido, String sexo, int mesNacimiento, int diaNacimiento, int anioNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos SET
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos GET
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    // Método que calcula la edad
    public int calcularEdad() {
        int anioActual = 2025;
        int mesActual = 10;
        int diaActual = 19;

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento ||
                (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    // Método que calcula la frecuencia cardiaca máxima
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Método que calcula la frecuencia esperada mínima (50%)
    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    // Método que calcula la frecuencia esperada máxima (85%)
    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }

    // Método que calcula el IMC (Índice de Masa Corporal)
    // Fórmula: peso(kg) / altura(m)²
    public double calcularIMC() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }

    // Método que clasifica el IMC
    public String clasificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

    // Método que devuelve la fecha de nacimiento
    public String obtenerFechaNacimiento() {
        return mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento;
    }
}
