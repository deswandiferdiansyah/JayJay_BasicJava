import java.util.Arrays;

public class AnagramChecker {
    // Metode untuk memeriksa apakah dua string adalah anagram
    public static boolean isAnagram(String strA, String strB) {
        // Ubah kedua string menjadi huruf kecil agar tidak peka huruf besar-kecil
        strA = strA.toLowerCase();
        strB = strB.toLowerCase();

        // Jika panjang kedua string berbeda, tidak mungkin menjadi anagram
        if (strA.length() != strB.length()) {
            return false;
        }

        // Ubah string menjadi array karakter dan urutkan
        char[] arrA = strA.toCharArray();
        char[] arrB = strB.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // Periksa apakah array yang sudah diurutkan sama
        return Arrays.equals(arrA, arrB);
    }

    // Main method untuk menguji metode isAnagram
    public static void main(String[] args) {
        String A = "CAT";
        String B = "tac";

        // Tes apakah A dan B adalah anagram
        boolean result = isAnagram(A, B);
        System.out.println("Apakah \"" + A + "\" dan \"" + B + "\" adalah anagram? " + result);
    }
}