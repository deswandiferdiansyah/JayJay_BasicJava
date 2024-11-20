package OOP;

// Membuat kelas Arithmetic dengan metode add()
class Arithmetic {
    // Metode add menerima dua parameter integer dan mengembalikan jumlahnya
    public int add(int a, int b) {
        return a + b;
    }
}

// Kelas Adder yang mewarisi kelas Arithmetic
class Adder extends Arithmetic {
    // Kelas ini otomatis mewarisi metode add() dari Arithmetic
}

public class Solution {
    public static void main(String[] args) {
        // Membuat objek dari kelas Adder
        Adder adder = new Adder();

        // Memanggil metode add() dan mencetak hasil
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.println(adder.add(20, 22) + " " + adder.add(7, 6) + " " + adder.add(15, 5));
    }
}

