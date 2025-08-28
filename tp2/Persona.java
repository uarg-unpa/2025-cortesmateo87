package tp2;
public class Persona {
    //Atributos
    String nombre;
    String apellido;
    int edad;
    int dni;
//Constructor
    public Persona(String nombre, String apellido, int edad, int dni) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
//Metodos GETs y SETs
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getEdad(){
        return this.edad;
    }

    public void setEdad(String edad){
        this.edad = edad;
    }

    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
//Otras Operaciones
    public boolean MayorDeEdad(){
        if(edad>=18){
            return true;
        } else{
            return false;
        }
    }

    public class testPersona(){
        public static void main(Strings[] args){
            int num;
            boolean esmayor;
            Persona persona1, persona2;
            persona1 = new.Persona("Franco","Herrena","42.122.661","21");
            persona2 = new.Persona("Felipe","Costa","41.2ll.521","32");
            persona1.MayorDeEdad();
            esmayor = persona2.MayorDeEdad();
        }
    }
}