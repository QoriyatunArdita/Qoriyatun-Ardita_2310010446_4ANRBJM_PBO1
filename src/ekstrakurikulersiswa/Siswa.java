// Siswa.java

package ekstrakurikulersiswa; // Pastikan ini sesuai dengan nama paket Anda

import java.util.ArrayList;
import java.util.List;

public class Siswa { // 1. Class: Mendefinisikan blueprint untuk objek Siswa

    // Atribut
    private String namaLengkap; // 3. Atribut: Data anggota kelas Siswa
    private String nis;         // 3. Atribut: Data anggota kelas Siswa
    private String kelas;       // 3. Atribut: Data anggota kelas Siswa
    private List<String> ekstrakurikuler; // 3. Atribut: List ekstrakurikuler yang diikuti siswa

    // Konstruktor
    public Siswa(String namaLengkap, String nis, String kelas) { // 4. Constructor: Digunakan untuk membuat objek Siswa baru
        this.namaLengkap = namaLengkap;
        this.nis = nis;
        this.kelas = kelas;
        this.ekstrakurikuler = new ArrayList<>(); // Inisialisasi list ekstrakurikuler
    }

    // Mutator (Setter)
    public void setNamaLengkap(String namaLengkap) { // 5. Mutator: Untuk mengubah nilai atribut namaLengkap
        this.namaLengkap = namaLengkap;
    }

    public void setNis(String nis) { // 5. Mutator: Untuk mengubah nilai atribut nis
        this.nis = nis;
    }

    public void setKelas(String kelas) { // 5. Mutator: Untuk mengubah nilai atribut kelas
        this.kelas = kelas;
    }

    // Overloading Mutator (Polymorphism - Ad-hoc polymorphism)
    public void addEkstrakurikuler(String eksekul) { // 9. Polymorphism: Overloading method untuk menambahkan satu ekstrakurikuler
        this.ekstrakurikuler.add(eksekul);
    }

    public void addEkstrakurikuler(String eksekul1, String eksekul2) { // 9. Polymorphism: Overloading method untuk menambahkan dua ekstrakurikuler
        this.ekstrakurikuler.add(eksekul1);
        this.ekstrakurikuler.add(eksekul2);
    }


    // Accessor (Getter)
    public String getNamaLengkap() { // 6. Accessor: Untuk mendapatkan nilai atribut namaLengkap
        return namaLengkap;
    }

    public String getNis() { // 6. Accessor: Untuk mendapatkan nilai atribut nis
        return nis;
    }

    public String getKelas() { // 6. Accessor: Untuk mendapatkan nilai atribut kelas
        return kelas;
    }

    public List<String> getEkstrakurikuler() { // 6. Accessor: Untuk mendapatkan list ekstrakurikuler
        return ekstrakurikuler;
    }

    // Encapsulation: Semua atribut private dan diakses melalui method public (setter/getter)
    // 7. Encapsulation: Atribut-atribut (namaLengkap, nis, kelas, ekstrakurikuler) diatur sebagai private
    //    dan hanya bisa diakses atau dimodifikasi melalui method-method public (getter dan setter).
    //    Ini melindungi data dari akses langsung yang tidak sah.

    // Method untuk menampilkan informasi siswa
    public void displaySiswaInfo() {
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("NIS: " + nis);
        System.out.println("Kelas: " + kelas);
        System.out.print("Ekstrakurikuler: ");
        if (ekstrakurikuler.isEmpty()) {
            System.out.println("Tidak ada");
        } else {
            for (int i = 0; i < ekstrakurikuler.size(); i++) { // 11. Perulangan: Menggunakan for loop untuk iterasi daftar ekstrakurikuler
                System.out.print(ekstrakurikuler.get(i));
                if (i < ekstrakurikuler.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}