/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaclasesdam;

/**
 * Clase que modela a una planta que no es de plástico
 * @author Miguel Páramos
 */
public class Planta extends SerVivo {
    private String especie; //La especie (Cactus, Amapola...)
    private boolean tieneFlores; //Si tiene flores o no
    private String color; //Color principal de la planta o de su flor si tiene
    private boolean venenosa; //Si es venenosa o no
    private int frecuenciaRegado; //Cada cuántos días hay que regarlos

    /**
     * Constructor de la clase planta con todos los parámetros
     * @param n nombre
     * @param e edad
     * @param especie especie
     * @param tieneFlores true-> si tiene, false-> Si no
     * @param color color principal de la flor si tiene. Si no tiene, color de la planta
     * @param venenosa true-> es venenosa, false-> no lo es
     * @param frecuenciaRegado cada cuántos días hay que regarla
     */
    public Planta(String n, byte e,String especie, boolean tieneFlores, String color, boolean venenosa, int frecuenciaRegado) {
        super(n, e);
        this.especie = especie;
        this.tieneFlores = tieneFlores;
        this.color = color;
        this.venenosa = venenosa;
        this.frecuenciaRegado = frecuenciaRegado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isTieneFlores() {
        return tieneFlores;
    }

    public void setTieneFlores(boolean tieneFlores) {
        this.tieneFlores = tieneFlores;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public int getFrecuenciaRegado() {
        return frecuenciaRegado;
    }

    public void setFrecuenciaRegado(int frecuenciaRegado) {
        this.frecuenciaRegado = frecuenciaRegado;
    }

    
    
    
}
