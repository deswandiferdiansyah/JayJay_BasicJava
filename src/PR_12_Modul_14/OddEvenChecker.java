package PR_12_Modul_14;

public class OddEvenChecker {

    public static void main(String[] args) {
        int number = 5; // Ganti angka ini untuk pengujian angka lain

        if (number < 1 || number > 10) {
            System.out.println("angka di luar jangkauan");
        } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9) {
            System.out.println("ganjil");
        } else {
            System.out.println("genap");
        }
    }
}