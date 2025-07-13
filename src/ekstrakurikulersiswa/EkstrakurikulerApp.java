// EkstrakurikulerApp.java

package ekstrakurikulersiswa; // Pastikan ini sesuai dengan nama paket Anda

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException; // Untuk Error Handling
import java.util.Scanner; // Untuk IO Sederhana

public class EkstrakurikulerApp {

    public static void main(String[] args) {
        System.out.println("--- Aplikasi Daftar Siswa Ekstrakurikuler SMKN 1 Marabahan ---");

        // 13. Array: Menggunakan ArrayList untuk menyimpan objek Siswa
        List<Siswa> daftarSiswa = new ArrayList<>();

        // 2. Object: Membuat instance/objek dari kelas Siswa
        Siswa siswa1 = new Siswa("Muhammad Chaidar Hafizi", "0093959933", "XI DKV");
        siswa1.addEkstrakurikuler("Silat", "Paskibra"); // 9. Polymorphism: Menggunakan overloaded method
        daftarSiswa.add(siswa1);

        Siswa siswa2 = new Siswa("Siti Ravalina", "0096343806", "XI DKV");
        siswa2.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa2);

        Siswa siswa3 = new Siswa("Taupik Rahman", "0086571298", "XI DKV");
        siswa3.addEkstrakurikuler("Silat", "Vocal");
        daftarSiswa.add(siswa3);

        Siswa siswa4 = new Siswa("Fitriani", "0081520539", "XI DKV");
        siswa4.addEkstrakurikuler("Lukis", "Tari");
        daftarSiswa.add(siswa4);

        Siswa siswa5 = new Siswa("Rifa Akhmalia", "0085239845", "XI DKV");
        siswa5.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa5);

        Siswa siswa6 = new Siswa("Azzahra Reskiana", "0097884044", "XI DKV");
        siswa6.addEkstrakurikuler("Lukis", "Tari");
        daftarSiswa.add(siswa6);

        Siswa siswa7 = new Siswa("Nadia", "0098594684", "XI DKV");
        siswa7.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa7);

        Siswa siswa8 = new Siswa("Robby D.A", "0093764501", "XI DKV");
        siswa8.addEkstrakurikuler("Silat", "Paskibra");
        daftarSiswa.add(siswa8);

        Siswa siswa9 = new Siswa("Nur aini", "0088449499", "XI DKV");
        siswa9.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa9);

        Siswa siswa10 = new Siswa("NYOMAN GANDHI.", "0091370914", "XI DKV");
        siswa10.addEkstrakurikuler("Silat", "Paskibra");
        daftarSiswa.add(siswa10);

        Siswa siswa11 = new Siswa("Panji putra", "0092751143", "XI DKV");
        siswa11.addEkstrakurikuler("Silat", "Vocal");
        daftarSiswa.add(siswa11);

        Siswa siswa12 = new Siswa("Maulida rijkya", "0089096683", "XI DKV");
        siswa12.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa12);

        Siswa siswa13 = new Siswa("Siti aida", "0076714709", "XI DKV");
        siswa13.addEkstrakurikuler("Tari", "Vocal");
        daftarSiswa.add(siswa13);

        Siswa siswa14 = new Siswa("Candra fayi", "0082304126", "XI DKV");
        siswa14.addEkstrakurikuler("Silat", "Paskibra");
        daftarSiswa.add(siswa14);

        System.out.println("\nDaftar Siswa dan Ekstrakurikuler mereka:");
        for (Siswa s : daftarSiswa) { // 11. Perulangan: Menggunakan enhanced for loop untuk menampilkan setiap siswa
            s.displaySiswaInfo();
            System.out.println("--------------------");
        }

        // 10. Seleksi: Contoh penggunaan if-else untuk mencari siswa berdasarkan NIS
        Scanner scanner = new Scanner(System.in); // 12. IO Sederhana: Menggunakan Scanner untuk input dari konsol
        System.out.println("\nCari siswa berdasarkan NIS (ketik 'exit' untuk keluar):");
        String nisCari;
        do {
            System.out.print("Masukkan NIS: ");
            nisCari = scanner.nextLine(); // 12. IO Sederhana: Membaca input dari user

            if (nisCari.equalsIgnoreCase("exit")) {
                System.out.println("Keluar dari pencarian.");
                break;
            }

            boolean ditemukan = false;
            try { // 14. Error Handling: Menggunakan try-catch untuk menangani potensi error
                for (Siswa s : daftarSiswa) {
                    if (s.getNis().equals(nisCari)) { // 10. Seleksi: Membandingkan NIS
                        System.out.println("\nSiswa ditemukan:");
                        s.displaySiswaInfo();
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Siswa dengan NIS " + nisCari + " tidak ditemukan.");
                }
            } catch (Exception e) { // 14. Error Handling: Menangkap exception umum
                System.err.println("Terjadi kesalahan saat mencari siswa: " + e.getMessage());
            }

        } while (true);

        scanner.close(); // Menutup scanner
    }
}