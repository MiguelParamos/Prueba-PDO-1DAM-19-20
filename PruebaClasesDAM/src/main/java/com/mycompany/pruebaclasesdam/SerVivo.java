/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaclasesdam;

/**
 *
 * @author Ccenec
 */
public class SerVivo {
    private String nombre; //El nombre del ser
    private byte edad; //Edad del ser en años
    
    /**
     * Constructor de ser vivo con todos sus campos
     * @param n nombre
     * @param e edad
     */
    public SerVivo(String n,byte e){
        this.setNombre(n);
        this.setEdad(e);
    }
    
    /**
     * Nombre de la persona
     * @return String con el nombre de la persona
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * getter de edad
     * @return edad de la persona
     */
    public byte getEdad(){
        return this.edad;
    }
    
    /**
     * setter de edad
     * @param e nueva edad de la persona
     */
    public final void setEdad(byte e){
        if(e>=0){
            this.edad=e;
        }else{
            System.out.println("Edad no válida, no se establece");
        }
    }
    
     /**
     * Setter de nombre de Persona
     * @param n nuevo nombre para la persona
     */
    public final void setNombre(String n){
        if(n.equalsIgnoreCase("Esgraciao")){
            System.out.println("No puedes poner ese "
                    + "nombre. No se ha cambiado.");
        }else{
            if(n.toLowerCase().contains("xxx")){
               n=n.toLowerCase().replace("xxx", "");
            }
            //Aislo la primera letra como String
            String primeraLetra=n.charAt(0)+"";
            //Convertir esa primera letra en mayúscula
            primeraLetra=primeraLetra.toUpperCase();
            //Poner a nombre la letra mayúscula
            //seguida del resto del nombre.
            this.nombre=primeraLetra+n.substring(1).toLowerCase();
        }
    }
}
