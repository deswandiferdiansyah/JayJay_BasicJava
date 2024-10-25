package VariableIntro;

import java.util.Locale;

public class BelajarCharDanString {
    public static void main(String[] args){

        // Contoh Char
        char varChar = 'A';
        System.out.println(varChar + 1);


        // Contoh Char dengan bilangan
        char varCharBilangan = 65;
        System.out.println(varCharBilangan);

        // Contoh String
        String varString = "Hello World";
        System.out.println(varString);

        // String inerpolation menggunakan *
        System.out.println(varString + " " + "JeyJey");

        // String interpolation menggunakan String.format
        System.out.println(String.format("%s Jayjay QA Engineer", varString));

        /*
        String Method:
        1. To lower case
        2. to upper case
        3. concat
        4. Char at
        5. Length
         */


        String name = "Deswandi Ferdiansyah";
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));

        System.out.println(name.concat("DeswandiFerdiansyah"));

        System.out.println(name.charAt(1));

        System.out.println(name.length());


        /* Use Case String
        1. Get Text Web Element
        2. Input text
         */




    }
}
