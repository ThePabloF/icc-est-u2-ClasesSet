package controlers;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio {


    public Ejercicio(){
        String texto = """
    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. 
    Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren 
    las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. 
    Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben 
    ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a 
    sistemas que no poseen conciencia ni empatía?

    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación 
    y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma 
    temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, 
    es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en 
    la innovación, sino también en el impacto que genera en la humanidad y en el planeta. 
    El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
""";

        
        System.out.println("Ejercicio 1");

        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5}));
    
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));

        System.out.println("Ejercico 2: ");
        System.out.println("Murcielago es isograma: "+esIsograma("Murcielago"));
        System.out.println("Camaleon es isograma: "+esIsograma(" "));

        System.out.println("Ejercicio 3: ");
        System.out.println("Contador de palabras unicas: "+ contarPalabrasUnicas(texto));
    }

    public boolean tieneDuplicados(int[] numeros){
       Set<Integer> set = new HashSet<>();
       for (Integer integer : numeros) {
        if (!set.add(integer)) {
            return true;
        }
       }
       return false;
    }

    public boolean esIsograma(String palabra){
        
        Set<Character> set = new HashSet<>();

       for (int i = 0; i < palabra.length(); i++) {
        if (!set.add(palabra.charAt(i))) {
            return false;
        }
        
       }
       return true;
    }

    public int contarPalabrasUnicas(String frase){
        int contPalabrasUnicas = 0;
        Set<String> set = new HashSet<>();

        String[] fraseArreglo = frase.split(" ");

        for (String string : fraseArreglo) {
            if (set.add(string)) {
                contPalabrasUnicas++;
            }
        }

        return contPalabrasUnicas;
    }

    

    
}
