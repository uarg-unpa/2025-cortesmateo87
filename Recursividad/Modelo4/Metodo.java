package Recursividad.Modelo4;
// suma de los primero n numeros multiplos de 3
public class Metodo {
    public static int sumMultiplosTres(int num, int i, int suma){
        if(num == i){
            return suma;
        }else{
            return sumMultiplosTres(num, i+1, suma+(i+1)*3);
        }
    }
}
