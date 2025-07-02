package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        //Primero el apellido en orden alfabetico

        int result = Integer.compare(c1.getApellido().length(), c2.getApellido().length());

                if (result==0) {

                   return c1.getNombre().compareTo(c2.getNombre());
                }

                return result;

    
        //Segundo si son iguales comparo por el nombre en orden alfabetico
      
    }

    
}
