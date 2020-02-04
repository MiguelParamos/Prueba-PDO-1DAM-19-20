/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaclasesdam;

import java.util.Random;

/**
 * Clase que modela a una persona
 * @author Miguel Páramos
 */
public class Persona {
    private String nombre; //El nombre de la persona
    private String apellido; //Apellidos de la persona
    private byte edad; //Edad de la persona en años
    private String nacionalidad; //Nacionalidad principal de la persona
    private Mascota[] mascota; //La mascota de esta persona
    private float saldo; //Indica el dinero que tiene esa persona en euros
    
    public Persona(){
        String[] nombresPosibles={"Patracio","Eusequio","Bartolo","Mortadelo","Piorroncho","Tiburcio"};
        String[] apellidosPosibles={"Sánchez","López","Martínez","González","Páramos","Jiménez","Parra"};
        String[] nacionalidadesPosibles={"Española","Francesa","Alemana","Irlandesa","Japonesa","Congoleña","Bielorrusa","Mauritana"};
        Random r=new Random();
        this.nombre=nombresPosibles
                [r.nextInt(nombresPosibles.length)];
        this.apellido=apellidosPosibles
                [r.nextInt(apellidosPosibles.length)];
        this.nacionalidad=nacionalidadesPosibles
                [r.nextInt(nacionalidadesPosibles.length)];
        this.edad=(byte)r.nextInt(101);
        mascota=new Mascota[5];
        this.saldo=r.nextInt(101);
    }
    
    /**
     * Constructor de la clase persona con 
     * todos sus datos menos las mascotas
     * @param n nombre de la persona
     * @param a apellidos
     * @param e edad
     * @param na nacionalidad
     * @param s saldo en euros de la persona
     */
    public Persona(String n,String a, byte e,String na,float s){
        this.nombre=n;
        this.apellido=a;
        this.edad=e;
        this.nacionalidad=na;
        this.saldo=s;
        this.mascota=new Mascota[5];
    }
    
    /**
     * Constructor de persona con todos los campos
     * @param n nombre
     * @param a apellidos
     * @param e edad
     * @param na nacionalidad
     * @param s saldo en euros
     * @param masc array de Mascota con todas sus mascotas
     */
    public Persona(String n,String a, byte e,
            String na,float s,Mascota[] masc){
        this.nombre=n;
        this.apellido=a;
        this.edad=e;
        this.nacionalidad=na;
        this.mascota=masc;
        this.saldo=s;
    }
    
    /**
     * getter de saldo
     * @return saldo de la persona
     */
    public String getSaldo(){
        return this.saldo+" €";
    }
    
    /**
     * setter de saldo
     * @param s saldo de la persona, no se puede poner negativo. En ese caso, se pone a 0
     */
    public void setSaldo(float s){
        if(s>=0){
            saldo=s;
        }else{
            System.out.println("No puedes poner saldo negativo");
            //Si le voy a poner un negativo, le pongo 0 que es el minimo
            saldo=0;
        }
    }
    
    /**
     * Nombre de la persona
     * @return String con el nombre de la persona
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * getter de apellido, devuelve el apellido de la persona
     * @return String con el apellido
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * getter de nacionalidad
     * @return nacionalidad de la persona
     */
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    /**
     * getter de edad
     * @return edad de la persona
     */
    public byte getEdad(){
        return this.edad;
    }
    
    /**
     * getter del array de mascotas
     * @return array con todas las mascotas que tiene la persona
     */
    public Mascota[] getMascota(){
        return this.mascota;
    }
    
    /**
     * Setter de nombre de Persona
     * @param n nuevo nombre para la persona
     */
    public void setNombre(String n){
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
    
    /**
     * Setter de apellido
     * @param apellido nuevo apellido que pondré
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    /**
     * setter de nacionalidad
     * @param n nueva nacionalidad de la persona
     */
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }
    
    /**
     * setter de edad
     * @param e nueva edad de la persona
     */
    public void setEdad(byte e){
        this.edad=e;
    }
    
    /**
     * establece las mascotas de una persona
     * Sobreescribe todas las mascotas anteriores que tuviese
     * @param m array de tipo Mascota, con todas las mascotas de la persona
     */
    public void setMascota(Mascota[] m){
        this.mascota=m;
    }
    
    
    
    
    /**
     * Aumenta en 1 la edad de la persona
     */
    public void cumplirAños(){
        this.edad++;
    }

    /**
     * Imprime todos los datos de una persona en varias líneas y con separadores --------------
     * @return String formateado que concatena todos los datos de una persona
     */
    @Override
    public String toString() {
        String ret="\n------------------";
        ret+="\nNombre: "+nombre;
        ret+="\nApellido: "+apellido;
        if(nacionalidad!=null){
            ret+="\nNacionalidad: "+nacionalidad;
        }
        ret+="\nEdad:"+edad;
        ret+="\nSaldo: "+saldo+" €";
        if(this.mascota!=null){
            for (int i = 0; i < mascota.length; i++) {
                if(this.mascota[i]!=null){
                    ret+="\nMascota: "+mascota[i];
                }
            }
        }
        ret+="\n------------------\n";
        return ret;
    }
    
    
    /**
     * Función que devuelve concatenados todos los datos de una persona
     * @deprecated 
     * @return String con todos los datos de una persona.
     */
    public String imprimePersona(){
        return nombre+" "+apellido+". Edad: "+
                this.edad+". Nacionalidad: "+this.nacionalidad; 
    }
    
    /**
     * función estática que imprime un array de personas
     * @param arr array de personas, debe estar inicializado
     * @return String que concatena a todas las personas del array
     */
    public static String imprimePersonas(Persona[] arr){
        String ret=""; 
        for(int i=0;i<arr.length;i++){
            ret+=arr[i]+"\n";
        }
        return ret;
    }
    
    
    
}
