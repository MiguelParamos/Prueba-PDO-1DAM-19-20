/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaclasesdam;

/**
 * Clase que define a una mascota de cualquier raza y especie
 * @author Miguel Páramos
 */
public class Mascota extends SerVivo{
    private String especie; //Especie de la mascota. Ej: Perro, gato, tortuga...
    private String raza; //Raza de la mascota. Ej: Labrador, bodeguero, angora...
    private float peso; //Peso en kg de la mascota.

    /**
     * Constructor de mascota con todos sus campos
     * @param n nombre
     * @param e especie
     * @param raza raza
     * @param ed edad en años
     * @param p peso en kilos
     */
    public Mascota(String n, String e,String raza,byte ed,float p){
        super(n,ed);
        this.setEspecie(e);
        this.setRaza(raza);
        this.setPeso(p);
    }
    

    
    /**
     * getter de la variable especie
     * @return  especie de la mascota
     */
    public String getEspecie(){
        return this.especie;
    }
    
    /**
     * getter de la raza de la mascota
     * @return raza de la mascota
     */
    public String getRaza(){
        return this.raza;
    }

    
    /**
     * getter del peso de la mascota
     * @return peso en kg de la mascota
     */
    public float getPeso(){
        return this.peso;
    }
    
  
    
    /**
     * setter de la especie de la mascota
     * @param e especie de la mascota
     */
    public final void setEspecie(String e){
        this.especie=e;
    }
    
    /**
     * setter de la raza de la mascota
     * @param r nueva raza de la mascota
     */
    public final void setRaza(String r){
        this.raza=r;
    }
    
    /**
     * setter del peso de la mascota
     * @param p nuevo peso de la mascota
     */
    public final void setPeso(float p){
        this.peso=p;
    }
    

    /**
     * función que concatena todos los datos de la mascota
     * en un String
     * @return String con todos los datos de la mascota
     */
    @Override
    public String toString() {
        return "Mascota{" + "especie=" + especie + ", raza=" + raza + ", edad=" + getEdad() + ", nombre=" + getNombre() + ", peso=" + peso + '}';
    }
    
    
    
}
