package Persona;

import javax.swing.*;

public class Joven extends Persona{
    public  Joven(String nombre ,String apellido , int edad ){
        if(edad > 12 && edad < 30){
            this.nombre = nombre ;
            this.apellido = apellido ;
            this.edad = edad ;
        }else{
            JOptionPane.showMessageDialog(null, "No tienes edad para ser Joven");
        }
    }
}
