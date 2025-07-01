import java.util.Set;

import controlers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
    Sets setsito =  new Sets();

    runHashSet(setsito);

     runLinkedHashSet(setsito);

     runTreeSet(setsito);

     runTreeSetComparator(setsito);
     
     runTreeSetComparatorDes(setsito);


    }
     public static void runHashSet (Sets setsito){

        System.out.println("---HASH SET---");
        for (String palabra : setsito.construirHashSet()) {
            System.out.println(palabra);
        }
        
    }
    public static void runLinkedHashSet (Sets setsito){
        System.out.println("---LINKED SET---");
        for (String palabra : setsito.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSet (Sets setsito){
        System.out.println("---TREE SET---");
         System.out.println("Elementos del Tree Set (Ordenados por longitud y luego alfabeticamente)");
        for (String palabra : setsito.construirTreeSet()) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetComparator(Sets setsito){
        System.out.println("---Comparator SET---");
        System.out.println("Elementos del Tree Set (Ordenados por longitud y luego alfabeticamente)");
        for (String palabra : setsito.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }
    public static void runTreeSetComparatorDes(Sets setsito){
        System.out.println("---Comparator SET Descendente---");
        System.out.println("Elementos del Tree Set (Ordenados por longitud descendente y luego alfabeticamente)");
        for (String palabra : setsito.construirTreeSetConComparadorDes()) {
            System.out.println(palabra);
        }
    }
}
