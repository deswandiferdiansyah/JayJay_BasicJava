package PR_11_MODUL_13;

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat pertama: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        int secondNumber = scanner.nextInt();

        // Membandingkan menggunakan operator relasional
        System.out.println(firstNumber + " == " + secondNumber + ": " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " != " + secondNumber + ": " + (firstNumber != secondNumber));
        System.out.println(firstNumber + " > " + secondNumber + ": " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + ": " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + ": " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + ": " + (firstNumber <= secondNumber));

        // Menutup scanner
        scanner.close();
    }
}

/*
Penjelasan Program:
Input Pengguna: Program meminta pengguna untuk memasukkan dua bilangan bulat.
Operator Relasional: Program membandingkan kedua bilangan menggunakan operator:
== (sama dengan)
!= (tidak sama dengan)
> (lebih besar dari)
>= (lebih besar atau sama dengan)
< (lebih kecil dari)
<= (lebih kecil atau sama dengan)
Output: Hasil dari setiap perbandingan ditampilkan di layar, menunjukkan apakah perbandingan tersebut benar atau salah.
Anda dapat menjalankan program ini dalam lingkungan Java Anda dan mencoba berbagai bilangan untuk melihat hasil perbandingannya!
 */