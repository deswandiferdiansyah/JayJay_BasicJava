public class CetakWarna {
    public static void main(String[] args) {
        // Membuat array string bernama "warna"
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        // Bagian pertama: mencetak semua warna
        System.out.println("Bagian Pertama: Mencetak semua warna");
        for (String w : warna) {
            System.out.println("Warnanya adalah " + w);
        }

        // Baris kosong sebagai pemisah
        System.out.println();

        // Bagian kedua: mencetak semua warna kecuali "putih"
        System.out.println("Bagian Kedua: Mencetak semua warna kecuali 'putih'");
        for (String w : warna) {
            if (w.equals("putih")) {
                continue; // Lewati warna "putih"
            }
            System.out.println(w);
        }
    }
}

/*
Penjelasan
Bagian pertama mencetak semua warna dalam array warna menggunakan loop for-each.
Bagian kedua mencetak warna dalam array warna namun melewati (skip) warna "putih" menggunakan pernyataan continue.

 */