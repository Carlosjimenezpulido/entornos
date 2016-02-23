/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

/**
 *
 * @author Carlos
 */
public class Persona {

    String nombre;
    int edad;
    float altura;

    Persona() {
        this.nombre = "Luisa Perez";
        this.edad = 22;
        this.altura = 1.70F;

    }

    /**
     *
     * @return Devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Establece el nombre de la Persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Devuelve la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad Establece la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return Devuelve la altura de la persona
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @param altura Establece la altura de la persona
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
