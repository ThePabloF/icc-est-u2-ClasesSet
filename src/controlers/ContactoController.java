package controlers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {
    public ContactoController(){
        
        runTreeContacto();
        runTreeContactoNum();
        
    }

    private void runTreeContacto(){
        ContactoComparator comparator = new ContactoComparator();
        ContactoComparatorConNumero comparatorConNumero = new ContactoComparatorConNumero();
        
        Set<Contacto> contactos = new TreeSet<>(comparator);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    private void runTreeContactoNum(){
        ContactoComparatorConNumero comparatorConNumero = new ContactoComparatorConNumero();
        
        Set<Contacto> contactos = new TreeSet<>(comparatorConNumero);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        System.out.println("Comparar por numero descendente");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
    
}
