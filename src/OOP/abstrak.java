package OOP;

import java.util.*;

// Kelas abstrak Book
abstract class Book {
    String title;

    // Metode abstrak yang harus diimplementasikan oleh subclass
    abstract void setTitle(String s);

    // Metode untuk mendapatkan judul buku
    String getTitle() {
        return title;
    }
}

// Implementasi kelas MyBook
class MyBook extends Book {
    // Implementasi dari metode abstrak setTitle()
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        // Membuat objek dari kelas MyBook
        MyBook new_novel = new MyBook();

        // Mengatur judul buku menggunakan setTitle()
        new_novel.setTitle(title);

        // Menampilkan judul buku
        System.out.println("The title is: " + new_novel.getTitle());

        // Menutup Scanner
        sc.close();
    }
}

