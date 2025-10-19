package ejercicioFecha;

public class Fecha {
    // Variables de instancia
    private int mes;
    private int dia;
    private int anio;

    // Constructor
    public Fecha() {

    }
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Métodos SET
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Métodos GET
    public int getMes() {
        if(mes < 13 && mes > 0){
            return mes;
        }
        else{return 0;}
    }

    public int getDia() {
        if(dia > 0 && dia <= 31) {
            if(mes == 2) {
                boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
                if(esBisiesto && dia <= 29) {
                    return dia;
                }
                if(!esBisiesto && dia <= 28) {
                    return dia;
                }
            }
            else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if(dia <= 31) {
                    return dia;
                }
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia <= 30) {
                    return dia;
                }
            }
        }
        return 0;
    }

    public int getAnio() {
        return anio;
    }

    // Método que muestra la fecha en formato mes/día/año
    public void mostrarFecha() {
        System.out.printf("%d/%d/%d\n", mes, dia, anio);
    }

    // Método adicional que devuelve la fecha como String
    public String obtenerFechaComoString() {
        return mes + "/" + dia + "/" + anio;
    }
}