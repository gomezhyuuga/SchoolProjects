/**
 * EXAMEN PARCIAL POO
 * Esta clase representa una fecha
 * 
 * @author Fernando Gómez Herrera
 * @version 05/09/2013
 */
public class Fecha
{
    // Varaibles de instancia
    private int dia;
    private int mes;
    private int anio;

    // Constructores
    /**
     * Inicializa con la fecha de hoy
     * @return objeto con la fecha de hoy
     */
    public Fecha() {
        this.dia = 5;
        this.mes = 9;
        this.anio = 2013;
    }
    /**
     * Inicializar con una fecha en específico
     * @param  dia  int, número del día 1-31
     * @param  mes  int, número del mes 1-12
     * @param  anio int, número del año
     * @return      objeto con la fecha específica
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String toString() {
        String fecha = "";
        if (this.dia < 10) { fecha += "0"; }
        fecha += this.dia + "-";
        if (this.mes < 10) { fecha += "0"; }
        fecha += this.mes + "-";
        // Formateo de 4 dígitos para año menor a 10, menor a 100 o menor a 1000
        if (this.anio < 10) {
            fecha += "000";
        } else if (this.anio >= 10 && this.anio < 100) {
            fecha += "00";
        } else if (this.anio >= 100 && this.anio < 1000) {
            fecha += "0";
        }
        fecha += this.anio;
        return fecha;
    }

    // Getters & setters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
