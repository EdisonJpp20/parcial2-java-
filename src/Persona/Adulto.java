package Persona;

import javax.swing.*;

public class Adulto extends Persona{
    public  Adulto(String nombre ,String apellido , int edad ){
        super();
        if(edad > 29){
            this.nombre = nombre ;
            this.apellido = apellido ;
            this.edad = edad ;
        }else{
            JOptionPane.showMessageDialog(null, "No tienes edad para ser Adulto");
        }


    }
}
