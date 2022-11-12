/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PracticaCalificadaS10.principal;

import com.PracticaCalificadaS10.Cantantes.ListaCantantes;

/**
 *
 * @author LENOVO
 */
public class Main {
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


