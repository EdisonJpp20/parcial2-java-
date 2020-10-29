package Persona;

public abstract class Persona {
    String nombre ;
    String apellido ;
    int edad ;
    String generacion ;


    public String getNombre(){
        return  this.nombre;
    }
    public String getApellido(){
        return  this.apellido;
    }
    public  int getEdad(){
        return  this.edad;
    }
    public String getGeneracion(String generacion){
        return generacion;
    }
}
