package PR_12_Modul_14;

public class CheckOddEven {

    public static void main(String[] args) {
        // Rentang angka yang akan dicek, bisa disesuaikan
        for (int i = 1; i <= 12; i++) {
            checkNumber(i);
        }
    }

    public static void checkNumber(int number) {
        if (number >= 1 && number <= 10) {
            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9) {
                System.out.println(number + " adalah ganjil");
            } else {
                System.out.println(number + " adalah genap");
            }
        } else {
            System.out.println(number + " adalah angka di luar jangkauan");
        }
    }
}

/*
Penjelasan Kode:
Metode checkNumber:

Memeriksa apakah angka berada dalam rentang 1 hingga 10.
Jika angkanya ganjil (1, 3, 5, 7, atau 9), program akan mencetak bahwa angka tersebut "ganjil".
Jika angkanya genap (2, 4, 6, 8, atau 10), program akan mencetak bahwa angka tersebut "genap".
Jika angka berada di luar rentang 1-10, program akan mencetak "angka di luar jangkauan".
Loop di main:

Sebagai contoh, di main kita melakukan loop dari angka 1 hingga 12 untuk menunjukkan hasil sesuai kriteria.
 */