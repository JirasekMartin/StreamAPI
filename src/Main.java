// Stream API: Použijte Java Stream API k provádění úloh, jako je filtrování,
// mapování, redukce a agregace.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Seznam čísel
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrování pouze sudých čísel
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Mapování na druhé mocniny
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // Redukce - součet všech čísel
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Součet čísel: " + sum);

        // Agregace - nalezení maximální hodnoty
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Maximální hodnota: " + max);
    }
}

// V tomto programu je použito Java Stream API k provádění různých úloh:
//
//Filtrování sudých čísel pomocí metody filter.
//Mapování na druhé mocniny pomocí metody map.
//Redukce na součet všech čísel pomocí metody reduce.
//Agregace pro nalezení maximální hodnoty pomocí metody max.
//Stream API poskytuje funkcionální a deklarativní přístup k
// manipulaci s kolekcemi, což zjednodušuje psaní čitelného a efektivního kódu.