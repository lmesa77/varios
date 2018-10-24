package anonima;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> pares = lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<String> nombres = Arrays.asList("Jorge", "Juan", "Felipe", "Amparo", "José", "Luis");
        List<String> menorCuatro = nombres.stream().filter(t -> t.length() < 5).collect(Collectors.toList());
        
        

        System.out.println(menorCuatro);

    }
}
