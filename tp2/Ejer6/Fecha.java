package tp2.Ejer6;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        if(mes >=1 && mes <=12 && anio >= 1){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia >=1 && dia <=31){
                    this.dia = dia;
                    this.mes = mes;
                    this.anio = anio;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 2013;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia >= 1 && dia <=30){
                    this.dia = dia;
                    this.mes = mes;
                    this.anio = anio;
                }else {
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 2013;
                }
            } else if (mes == 2){
                if(dia >=1 && dia <=28){
                    this.dia = dia;
                    this.mes = mes;
                    this.anio = anio;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 2013;
                }
            }
        } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 2013;
        }
    }

    //get y set
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    //metodos

    public String nombreMes(){
        switch(mes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "mes invalido";
        }
    }

    public String toString(){
        return dia+ " de " + nombreMes() + " de " +anio;
    }
}
