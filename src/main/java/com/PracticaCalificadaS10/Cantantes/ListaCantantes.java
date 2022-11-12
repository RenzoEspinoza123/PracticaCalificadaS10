
package com.PracticaCalificadaS10.Cantantes;

import java.util.ArrayList;

public class ListaCantantes {
 
    private ArrayList <cantante> cantantes = new ArrayList>();
 
    public void ListaCantantes() {
    }
   
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }

    public ArrayList<cantante> obtenerListadoFormateado() {
        for (int x = 0; x  cantantes.size(); x++) {
            System.out.println("Cantante: " + cantantes.get(x).getNombre());
        }
        return cantantes;
    }
 
    public ArrayList<cantante> listadoCantantes () {
        for (int x = 0; x  cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());        
        }
        return cantantes;
    }
 
}
