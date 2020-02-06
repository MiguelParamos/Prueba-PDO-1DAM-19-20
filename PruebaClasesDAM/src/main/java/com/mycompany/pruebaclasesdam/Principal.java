/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaclasesdam;

import java.util.Scanner;

/**
 * Clase con el main que ejecuta un programa de pruebas
 *
 * @author Miguel Páramos
 */
public class Principal {

    /**
     * Main del programa, solo hace pruebas con las clases
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pido tamaño del array y lo creo
        System.out.println("Bienvenid@ al programa. Dime cuántas personas quieres crear.");
        int nPersonas=Integer.parseInt(sc.nextLine());
        Persona[] personas = new Persona[nPersonas];
        //Tengo que inicializar a todas las personas
        //Porque el array es de persona, y las variables Persona
        //son punteros en memoria, que si no se inicializan,
        //Valen null.
        //Pido cuántas de ellas quiere crear a mano y las pido por teclado
        System.out.println("¿Cuántas de ellas quieres introducir a mano?");
        byte personasAMano=Byte.parseByte(sc.nextLine());
        for(int i=0;i<personasAMano;i++){
            System.out.println("Persona "+(i+1)+"/"+personasAMano+":");
            System.out.println("Dime nombre:");
            String nom=sc.nextLine();
            System.out.println("Dime apellidos:");
            String a=sc.nextLine();
            System.out.println("Dime Nacionalidad:");
            String na=sc.nextLine();
            System.out.println("Dime edad:");
            byte e=Byte.parseByte(sc.nextLine());
            System.out.println("Dime saldo:");
            int s=Integer.parseInt(sc.nextLine());
            personas[i]=new Persona(nom,a,e,na,s);
        }
        //Creo el resto aleatoriamente
        for (int i = personasAMano; i < personas.length; i++) {
            personas[i] = new Persona();
        }

        System.out.println("Personas:\n"
                + Persona.imprimePersonas(personas));

        //ofrezco cambiar uno de sus datos.
        byte opcion = 0;
        byte personaElegida = 0;
        do {
            System.out.println("¿Qué persona quieres modificar?"
                    + " (0-" + (personas.length - 1) + ")\n pulsa 6 para salir");
            personaElegida = Byte.parseByte(sc.nextLine());
            //Si elijo la opción de salir en persona elegida, 
            //no entra en el switch de opción, y sale del programa.
            if (personaElegida == 6) {
                opcion = 6;
            } else {

                System.out.println("¿Quieres cambiar algún dato?"
                        + "\n\t1- Nombre\n\t2- Apellido\n\t3- Nacionalidad"
                        + "\n\t4- Edad\n\t5-Saldo\n\t6- No");
                opcion = Byte.parseByte(sc.nextLine());
                switch (opcion) {
                    case 1: //Cambio nombre
                        //Los getter se usan para consultar valor.
                        //Los setter se usan para cambiar valor.
                        System.out.println("\nTu nombre es "
                                + personas[personaElegida].getNombre() + " dime cuál quieres ponerle: ");
                        String n = sc.nextLine();
                        personas[personaElegida].setNombre(n);
                        break;
                    case 2:
                        System.out.println("\nTu apellido es "
                                + personas[personaElegida].getApellido() + " dime cuál quieres ponerle: ");
                        String a = sc.nextLine();
                        personas[personaElegida].setApellido(a);
                        break;
                    case 3:
                        System.out.println("\nTu nacionalidad es "
                                + personas[personaElegida].getNacionalidad() + " dime cuál quieres ponerle: ");
                        String na = sc.nextLine();
                        personas[personaElegida].setNacionalidad(na);
                        break;
                    case 4:
                        System.out.println("\nTu edad es "
                                + personas[personaElegida].getEdad() + " dime cuál quieres ponerle: ");
                        byte e = Byte.parseByte(sc.nextLine());
                        personas[personaElegida].setEdad(e);
                        break;
                    case 5:
                        System.out.println("\nTu saldo es "
                                + personas[personaElegida].getSaldo() + " dime cuál quieres ponerle: ");
                        float s = Float.parseFloat(sc.nextLine());
                        personas[personaElegida].setSaldo(s);
                        break;
                    case 6:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        } while (opcion != 6);
        System.out.println("Personas:\n"
                + Persona.imprimePersonas(personas));

    }

}
