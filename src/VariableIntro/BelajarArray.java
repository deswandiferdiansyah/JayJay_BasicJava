package VariableIntro;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BelajarArray {
    public static void main(String[] args){

        /* Apa itu Array ?
        1. Array adalah sekumpulan data
        2. Data di array harus seragam
        3. Array bersifat immutable atau tidak bisa di rubah
         */

        // Array integer
        Integer[] arrayBilangan = {24, 2, 9, 12};
        System.out.println(Arrays.toString(arrayBilangan));

        // Array String
        String[] arrayString = {"Melon", "Jeruk", "Apel", "Nanas"};
        System.out.println(Arrays.toString(arrayString));

        // Akses Data Array
        System.out.println(arrayBilangan[1]);
        System.out.println(arrayString[arrayString.length - 1]);
        System.out.println();

        // Print Array loop
        for (Integer bil: arrayBilangan){
            System.out.println("Index array : " + bil);
        }

        // Sorting Array
        /*Arrays.sort(arrayBilangan);
        System.out.println(arrayBilangan.toString(arrayBilangan));


        // List integer
        List<Integer> listBilangan = new ArrayList<>();

        listBilangan.add(3);
        listBilangan.add(5);

        System.out.println(listBilangan);

        //listBilangan.remove(index:2);
        //System.out.println(listBilangan);

        // List String
        List<String> listString = new ArrayList<>();
        listString.add("Zebra");
        listString.add("Buaya");

        System.out.println(listString);

        // Modifikasi list
       /* listBilangan.forEach(bilangaan) -> {
            System.out.println("Isi dari list: " + bilangaan);
            System.out.println("####");
        };

        System.out.println(listBilangan.contains(3));
        */

    }
}
