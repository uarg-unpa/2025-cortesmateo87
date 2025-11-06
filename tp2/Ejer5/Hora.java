package tp2.Ejer5;

public class Hora{
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo){
        if(hora >=0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >=0 && segundo <60){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
        this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
        }
    }
    //get set
    public int getHora(){
        return this.hora;
    }
    public void setHora(int hora){
        if(hora >= 0 && hora <24){
            this.hora = hora;
        } else {
            System.out.println("ERROR: el valor ingresado esta fuera de los parametros de hora(0 a 23)");
        }
    }

    public int getMinuto(){
        return this.minuto;
    }
    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        } else {
            System.out.println("ERROR: el valor ingresado esta fuera de los parametros de minuto(0 a 59)");
        }
    }

    public int getSegundo(){
        return this.segundo;
    }
    public void setSegundo(int segundo){
        if(segundo >=0 && segundo <60){
            this.segundo = segundo;
        } else{
            System.out.println("ERROR: el valor ingresado esta fuera de los parametros de segundo (0 a 59)");
        }
    }
    
    public int horaenMinutos(){
        int enMinutos;
        enMinutos = this.hora * 60;
        return enMinutos;
    }

    public String toString(){
        return hora+ ":" +minuto+ ":" +segundo;
    }
}
