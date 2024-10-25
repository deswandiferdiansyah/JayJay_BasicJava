package PR_11_MODUL_13;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Operasi aritmatika
        int sum = a + b;                 // Penjumlahan
        int difference = a - b;          // Pengurangan
        int product = a * b;             // Perkalian
        int quotient = (b != 0) ? a / b : 0; // Pembagian (cek jika b tidak 0)
        int remainder = (b != 0) ? a % b : 0; // Sisa bagi (cek jika b tidak 0)

        // Menampilkan hasil
        System.out.println("Jumlah (sum): " + sum);
        System.out.println("Selisih (difference): " + difference);
        System.out.println("Produk (product): " + product);
        System.out.println("Kuas (quotient): " + quotient);
        System.out.println("Sisa (remainder): " + remainder);

        scanner.close();
    }
}

/*Penjelasan Program:
Input Pengguna: Program meminta pengguna untuk memasukkan dua integer a dan b.
Operasi Aritmatika:
sum: Penjumlahan dari a dan b.
difference: Pengurangan b dari a.
product: Perkalian a dan b.
quotient: Pembagian a dengan b, dengan pengecekan agar tidak terjadi pembagian dengan nol.
remainder: Sisa bagi a dengan b, juga dengan pengecekan.
Output: Hasil dari setiap operasi ditampilkan di layar.
Pastikan untuk menjalankan program ini dalam lingkungan Java yang sesuai!*/