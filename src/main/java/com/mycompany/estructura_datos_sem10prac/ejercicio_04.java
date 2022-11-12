/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem10prac;

import java.util.ArrayList;

/**
 *
 * @author Adriano
 */

class Cantante {
    //Propiedades de la clase
    private String nombre;
 
    //Método constructor vacío
    public Cantante() {
    }
 
    //Método constructor con parámetros
    public Cantante(String nombre) {
        this.nombre = nombre;
    }
 
    //Método para obtener el nombre del cantante
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
 
    public String devolverCantante(){
    return "Nombre: " + nombre;
    }
}

class ListaCantantes {
    //Declaramos e inicializamos el arraylist
    private ArrayList <Cantante> cantantes = new ArrayList<>();
 
    //Método constructor vacío
    public void ListaCantantes() {
    }
 
    //Método para añadir nombre de cantantes   
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }
 
    //Método para devolver el listado de cantantes formateado
    public ArrayList<Cantante> obtenerListadoFormateado() {
        for (int i = 0; i < cantantes.size(); i++) {
            System.out.println("Cantante: " + cantantes.get(i).getNombre());
        }
        return cantantes;
    }
 
    //Método para devolver el listado sin formatear
    public ArrayList<Cantante> listadoCantantes () {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());        
        }
        return cantantes;
    }
}

public class ejercicio_04 {
    public static void main(String[] args) {
        //Creamos el arraylist para guardar cantantes
        ListaCantantes cantantes = new ListaCantantes();
                 
        //Añadimos los cantantes usando el método creado en ListaCantante
        cantantes.anadirCantante("Freddie Mercury");
        cantantes.anadirCantante("Zaz");
        cantantes.anadirCantante("Stromae");
        cantantes.anadirCantante("Noa");
        cantantes.anadirCantante("Enrique Bunbury");
        cantantes.anadirCantante("Edith Piaf");
        cantantes.anadirCantante("Otis Redding");
        cantantes.anadirCantante("Antonio Machín");
         
        //Devolvemos el listado usando los métodos.
        cantantes.listadoCantantes();
         
        cantantes.obtenerListadoFormateado();
    }
}
