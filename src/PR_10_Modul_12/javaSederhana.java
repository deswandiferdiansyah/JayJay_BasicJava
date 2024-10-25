package PR_10_Modul_12;

import java.util.Arrays;

public class javaSederhana {
    public static void main(String[] args){
        // Mendeklarasikan dan menginisialisasikan array merek mobil
        String[] merekMobil = {"Mitsubushi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};

        // Mencetak merek mobil
        System.out.println("Daftar Merek Mobil:");
        for (String merek : merekMobil){
            System.out.println(merek);
        }
    }

}
