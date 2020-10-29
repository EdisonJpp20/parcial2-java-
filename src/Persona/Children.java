package Persona;

import javax.swing.*;

public class Children extends Persona{
    public  Children(String nombre ,String apellido , int edad ){
        if(edad < 12){
            this.nombre = nombre ;
            this.apellido = apellido ;
            this.edad = edad ;
        }else{
            JOptionPane.showMessageDialog(null, "No tienes edad para ser Niño");
        }
    }
}
