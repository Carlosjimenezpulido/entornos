/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Principal {

    /**
     *
     * @param Mostramos los datos originales de Luisa
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona P = new Persona();
        /**
         * Utilizamos las variables para mostrar los datos de la clase
         */
        String nombre = P.getNombre();
        int edad = P.getEdad();
        float altura = P.getAltura();
        System.out.println("La altura de "+nombre+" es de "+altura+" con una edad de "+edad);
        /**
         * Y utilizamos los metodos para crear una nueva persona y mostrar de nuevo sus datos
         */
        Persona L = new Persona();
        System.out.println("Introduce el nombre de una nueva persona");
        L.setNombre(sc.nextLine());
        System.out.println("Introduce la edad de " +L.getNombre());
        L.setEdad(sc.nextInt());
        System.out.println("Introduce la altura de " +L.getNombre());
        L.setAltura(sc.nextFloat());
        System.out.println(L.getNombre()+ " tiene " +L.getEdad()+ "años y mide "+L.getAltura());
              

    }

}
