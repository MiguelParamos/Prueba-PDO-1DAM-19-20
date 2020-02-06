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
public class Persona extends SerVivo {
    private String apellido; //Apellidos de la persona
    private String nacionalidad; //Nacionalidad principal de la persona
    private Mascota[] mascota; //La mascota de esta persona
    private float saldo; //Indica el dinero que tiene esa persona en euros
    private Persona madre; //Madre de la persona
    private Persona padre; //Padre de la persona
    
    public Persona(){
        /*super(nombresPosibles
                [r.nextInt(nombresPosibles.length)],(byte)r.nextInt(101));
        */
        super("Anónimo",(byte)5);
        String[] nombresPosibles={"Patracio","Eusequio","Bartolo","Mortadelo","Piorroncho","Tiburcio"};
        String[] apellidosPosibles={"Sánchez","López","Martínez","González","Páramos","Jiménez","Parra"};
        String[] nacionalidadesPosibles={"Española","Francesa","Alemana","Irlandesa","Japonesa","Congoleña","Bielorrusa","Mauritana"};
        Random r=new Random();
        this.apellido=apellidosPosibles
                [r.nextInt(apellidosPosibles.length)];
        this.nacionalidad=nacionalidadesPosibles
                [r.nextInt(nacionalidadesPosibles.length)];
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
        super(n,e);
        this.setApellido(a);
        this.setNacionalidad(na);
        this.setSaldo(s);
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
        super(n,e);
        this.setApellido(a);
        this.setNacionalidad(na);
        this.setSaldo(s);
        this.setMascota(masc);
    }

    public Persona(String n, byte e,String apellido, String nacionalidad, float saldo, Persona madre, Persona padre) {
        super(n, e);
        this.setApellido(apellido);
        this.setNacionalidad(nacionalidad);
        this.setSaldo(saldo);
        this.setMadre(madre);
        this.setPadre(padre);
    }

    public Persona getMadre() {
        return madre;
    }

    public final void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public final void setPadre(Persona padre) {
        this.padre = padre;
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
    public final void setSaldo(float s){
        if(s>=0){
            saldo=s;
        }else{
            System.out.println("No puedes poner saldo negativo");
            //Si le voy a poner un negativo, le pongo 0 que es el minimo
            saldo=0;
        }
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
     * getter del array de mascotas
     * @return array con todas las mascotas que tiene la persona
     */
    public Mascota[] getMascota(){
        return this.mascota;
    }
    
   
    
    /**
     * Setter de apellido
     * @param apellido nuevo apellido que pondré
     */
    final public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    /**
     * setter de nacionalidad
     * @param n nueva nacionalidad de la persona
     */
    public final void setNacionalidad(String n){
        this.nacionalidad=n;
    }
    
    
    
    /**
     * establece las mascotas de una persona
     * Sobreescribe todas las mascotas anteriores que tuviese
     * @param m array de tipo Mascota, con todas las mascotas de la persona
     */
    public final void setMascota(Mascota[] m){
        this.mascota=m;
    }
    
    /**
     * función que comprueba si una persona es mayor que otra
     * @param p persona con la que comparo a this
     * @return true si this es mayor en edad que p. False en caso contrario.
     */
    public boolean esMayorQue(Persona p){
        return this.getEdad()>p.getEdad();
    }
    
    
    
    
    /**
     * Aumenta en 1 la edad de la persona
     */
    public void cumplirAños(){
        this.setEdad(((byte)(this.getEdad()+1)));
    }

    /**
     * Imprime todos los datos de una persona en varias líneas y con separadores --------------
     * @return String formateado que concatena todos los datos de una persona
     */
    @Override
    public String toString() {
        String ret="\n------------------";
        ret+="\nNombre: "+getNombre();
        ret+="\nApellido: "+apellido;
        if(nacionalidad!=null){
            ret+="\nNacionalidad: "+nacionalidad;
        }
        ret+="\nEdad:"+getEdad();
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
        return this.getNombre()+" "+apellido+". Edad: "+
                this.getEdad()+". Nacionalidad: "+this.nacionalidad; 
    }
    
    /**
     * función estática que imprime un array de personas
     * @param arr array de personas, debe estar inicializado
     * @return String que concatena a todas las personas del array
     */
    public static String imprimePersonas(Persona[] arr){
        String ret=""; 
        for(int i=0;i<arr.length;i++){
            ret+="Persona "+i+":\n";
            ret+=arr[i]+"\n";
        }
        return ret;
    }
    
    
    
}
