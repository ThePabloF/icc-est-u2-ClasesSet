package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        //Primero el apellido en orden alfabetico

        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (comparacionApellido!= 0) {

            return comparacionApellido;
        }
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

         if (comparacionNombre != 0) {
            return comparacionNombre;
         }

        int comparacionNumero = c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
    
        return comparacionNumero;
      
    }

    
}
