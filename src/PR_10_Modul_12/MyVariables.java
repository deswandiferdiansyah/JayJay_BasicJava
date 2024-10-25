package PR_10_Modul_12;

public class MyVariables {
    // Mendeklarasikan variabel dengan tipe data yang sesuai
    int myNum = 9;               // Tipe data int untuk bilangan bulat
    float myNum2 = 8.99f;       // Tipe data float untuk bilangan pecahan
    char myLetter = 'A';        // Tipe data char untuk karakter tunggal
    boolean myState = false;     // Tipe data boolean untuk nilai true/false
    String myText = "Hello World"; // Tipe data String untuk teks

    public static void main(String[] args) {
        MyVariables variables = new MyVariables();

        // Menampilkan nilai variabel
        System.out.println("myNum: " + variables.myNum);
        System.out.println("myNum2: " + variables.myNum2);
        System.out.println("myLetter: " + variables.myLetter);
        System.out.println("myState: " + variables.myState);
        System.out.println("myText: " + variables.myText);
    }
}
