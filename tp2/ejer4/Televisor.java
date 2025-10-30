package tp2.ejer4;

public class Televisor {
    private String marca;
    private String modelo;
    private int pulgadas;
    private int volumen;
    private int canal;
    private int CanalAnterior;
    boolean estado;

    public Televisor(String marca, String modelo, int pulgadas){
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    //get y set
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getPulgadas(){
        return this.pulgadas;
    }
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    //metodos
    public void encenderTele(){
        estado = true;
    }

    public void apagarTele(){
        estado = false;
    }

    public void consultarEstado(){
        if(estado == false){
            System.out.println("La television esta apagada");
        } else {
            System.out.println("La television esta encendida");
        }
    }

    public int subirVolumen(int CantidadASubir){
        this.volumen = this.volumen + CantidadASubir;
        return this.volumen;
    }

    public int bajarVolumen(int CantidadABajar){
        this.volumen = this.volumen - CantidadABajar;
        return this.volumen;
    }
    
    public int subirCanal(){
        CanalAnterior = this.canal;
        this.canal = this.canal + 1;
        return this.canal;
    }

    public int bajarCanal(){
        CanalAnterior = this.canal;
        this.canal = this.canal - 1;
        return this.canal;
    }

    public int volverCanal(){
        this.canal = CanalAnterior;
        return CanalAnterior;
    }


}
