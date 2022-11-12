/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem10prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */

class Persona {
    private String dni;
    private String apellidos;
    private String nombres;
    private String sexo;
    private int edad;
    private double peso;

    public Persona(String dni, String apellidos, String nombres,
        String sexo, int edad, double peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombres="
        + nombres + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Persona other = (Persona) obj;
        
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        
        return true;
    }
}

public class ejercicio_03 {
    private ArrayList<Persona> listaPersonas;

    public static void main(String[] args) {
        int opcion;
        ejercicio_03 proyectoPersonas = new ejercicio_03();
        proyectoPersonas.listaPersonas = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nLISTA DE PERSONAS:");
            System.out.println("[1] Registrar persona");
            System.out.println("[2] Buscar persona por DNI");
            System.out.println("[3] Eliminar persona");
            System.out.println("[4] Ordenar por apellidos");
            System.out.println("[5] Mostrar persona");
            System.out.println("[6] Salir\n");
            System.out.print("Ingrese opción (1-6): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    proyectoPersonas.registrarPersona();
                    break;
                case 2:
                    proyectoPersonas.buscarPersona();
                    break;
                case 3:
                    proyectoPersonas.eliminarPersona();
                    break;
                case 4:
                    proyectoPersonas.ordenarPorApellido();
                    break;
                case 5:
                    proyectoPersonas.mostrarPersonas();
                    break;
                }
        } while (opcion != 6);
    }

    public void registrarPersona() {
        String dni, apellidos, nombres, sexo;
        int edad;
        double peso;
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        dni = entrada.next();
        System.out.print("Apellidos: ");
        apellidos = entrada.next();
        System.out.print("Nombres: ");
        nombres = entrada.next();
        System.out.print("Sexo: ");
        sexo = entrada.next();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.print("Peso: ");
        peso = entrada.nextDouble();
        Persona persona = new Persona(dni, apellidos, nombres, sexo, edad, peso);
        listaPersonas.add(persona);
    }

    public void buscarPersona() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI a buscar: ");
        dni = entrada.next();
        Persona persona = new Persona(dni);
        indice = listaPersonas.indexOf(persona);
        
        if (indice != -1) {
            persona = listaPersonas.get(indice);
            System.out.println(persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }

    public void eliminarPersona() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese DNI para eliminar: ");
        dni = entrada.next();
        Persona persona = new Persona(dni);
        indice = listaPersonas.indexOf(persona);
        if (indice != -1) {
            persona = listaPersonas.remove(indice);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }

    public void mostrarPersonas() {
        if (listaPersonas.size() > 0) {
            for (Persona persona : listaPersonas) {
                System.out.println(persona);
            }
        } else {
            System.out.println("No existen personas registradas");
        }
    }

    public void ordenarPorApellido() {
        Collections.sort(listaPersonas, (Persona persona1, Persona persona2)
        -> persona1.getApellidos().compareTo(persona2.getApellidos()));
        mostrarPersonas();
    }
}
