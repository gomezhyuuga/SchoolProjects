/*
 * Representa una fecha en día, mes y año
 */

/**
 *
 * @author Fernando Gómez Herrera
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private static String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Fecha() {
        this.dia = 19;
        this.mes = 9;
        this.anio = 2013;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = this.dia + " de ";
        switch (this.mes) {
            case 1:
                cadena += "enero";
                break;
            case 2:
                cadena += "febrero";
                break;
            case 3:
                cadena += "marzo";
                break;
            case 4:
                cadena += "abril";
                break;
            case 5:
                cadena += "mayo";
                break;
            case 6:
                cadena += "junio";
                break;
            case 7:
                cadena += "julio";
                break;
            case 8:
                cadena += "agosto";
                break;
            case 9:
                cadena += "septiembre";
                break;
            case 10:
                cadena += "octubre";
                break;
            case 11:
                cadena += "noviembre";
                break;
            case 12:
                cadena += "diciembre";
                break;
            default:
                cadena += "NO EXISTE";
                break;
        }
        cadena += " de " + this.anio;
        return cadena;
    }

    public void avanzar() {
        int limiteDias = 0;
        switch (this.mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                limiteDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                limiteDias = 30;
                break;
            case 2:
                limiteDias = 28;
                if (this.anio % 400 == 0 || this.anio % 4 == 0 && this.anio % 100 != 0) {
                    limiteDias = 29;
                }
                break;
        }
        if (dia == limiteDias) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.anio++;
            }
        } else {
            this.dia++;
        }
    }

    // Getters & setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
