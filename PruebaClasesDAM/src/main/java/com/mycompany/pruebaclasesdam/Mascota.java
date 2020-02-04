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
public class Mascota {
    private String especie; //Especie de la mascota. Ej: Perro, gato, tortuga...
    private String raza; //Raza de la mascota. Ej: Labrador, bodeguero, angora...
    private byte edad; //Edad de la mascota en años
    private String nombre; //Nombre de la mascota
    private float peso; //Peso en kg de la mascota.

    /**
     * Constructor de mascota con todos sus campos
     * @param n nombre
     * @param e especie
     * @param rz raza
     * @param ed edad en años
     * @param p peso en kilos
     */
    public Mascota(String n, String e,String raza,byte ed,float p){
        this.nombre=n;
        this.especie=e;
        this.raza=raza;
        this.edad=ed;
        this.peso=p;
    }
    
    /**
     * getter de la variable interna nombre
     * @return nombre de la mascota.
     */
    public String getNombre(){
        return this.nombre;
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
     * getter de la edad de la mascota
     * @return edad de la mascota en años
     */
    public byte getEdad(){
        return this.edad;
    }
    
    /**
     * getter del peso de la mascota
     * @return peso en kg de la mascota
     */
    public float getPeso(){
        return this.peso;
    }
    
    /**
     * Setter del nombre de la mascota
     * @param n nuevo nombre de la mascota
     */
    public void setNombre(String n){
        this.nombre=n;
    }
    
    /**
     * setter de la especie de la mascota
     * @param e especie de la mascota
     */
    public void setEspecie(String e){
        this.especie=e;
    }
    
    /**
     * setter de la raza de la mascota
     * @param r nueva raza de la mascota
     */
    public void setRaza(String r){
        this.raza=r;
    }
    
    /**
     * setter del peso de la mascota
     * @param p nuevo peso de la mascota
     */
    public void setPeso(float p){
        this.peso=p;
    }
    
    /**
     * setter de la edad de la mascota
     * @param e edad de la mascota
     */
    public void setEdad(byte e){
        this.edad=e;
    }
    
    /**
     * función que concatena todos los datos de la mascota
     * en un String
     * @return String con todos los datos de la mascota
     */
    @Override
    public String toString() {
        return "Mascota{" + "especie=" + especie + ", raza=" + raza + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso + '}';
    }
    
    
    
}
