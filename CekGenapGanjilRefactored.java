import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kelas CekGenapGanjilRefactored digunakan untuk mengecek apakah bilangan yang dimasukkan oleh pengguna adalah
 * bilangan genap atau ganjil.
 * Program ini akan meminta input dari pengguna dan menampilkan hasilnya.
 */
public class CekGenapGanjilRefactored {
    /**
     * Metode utama yang akan dijalankan saat program dimulai.
     * Metode ini mengatur proses input bilangan, pengecekan genap/ganjil, dan menampilkan hasil.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int bilangan = inputBilangan(scanner);
            tampilkanHasil(bilangan, cekGenap(bilangan));
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan angka bulat!");
        } finally {
            scanner.close();
        }
    }

    /**
     * Meminta pengguna untuk memasukkan bilangan bulat.
     *
     * @param scanner Scanner yang digunakan untuk membaca input dari pengguna.
     * @return Bilangan bulat yang dimasukkan oleh pengguna.
     * @throws InputMismatchException jika input yang dimasukkan bukan angka bulat.
     */
    private static int inputBilangan(Scanner scanner) {
        System.out.print("Masukkan bilangan: ");
        return scanner.nextInt();
    }

    /**
     * Mengecek apakah bilangan yang diberikan adalah bilangan genap.
     *
     * @param bilangan Bilangan bulat yang akan diperiksa.
     * @return true jika bilangan adalah genap, false jika ganjil.
     */
    private static boolean cekGenap(int bilangan) {
        return bilangan % 2 == 0;
    }

    /**
     * Menampilkan hasil pengecekan apakah bilangan genap atau ganjil.
     *
     * @param bilangan Bilangan bulat yang diperiksa.
     * @param isGenap Nilai boolean yang menunjukkan apakah bilangan genap (true) atau ganjil (false).
     */
    private static void tampilkanHasil(int bilangan, boolean isGenap) {
        String hasil = isGenap ? "genap" : "ganjil";
        System.out.println(bilangan + " adalah bilangan " + hasil + ".");
    }
}
