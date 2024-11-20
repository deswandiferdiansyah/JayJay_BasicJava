package OOP;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Kelas Animal dengan metode walk()
class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

// Kelas Bird yang mewarisi Animal dan memiliki metode tambahan fly() dan sing()
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Membuat objek dari kelas Bird
        Bird bird = new Bird();

        // Memanggil metode yang tersedia
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

