Tentu, saya akan menyesuaikan template yang Anda berikan agar sesuai dengan proyek "EkstrakurikulerSiswa" Anda, tanpa mengubah urutan atau struktur, hanya mengganti informasi yang relevan.

-----

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data **siswa ekstrakurikuler** menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa **NIS siswa dan memungkinkan pengguna mencari informasi detail siswa serta menampilkan daftar ekstrakurikuler yang diikuti**. Aplikasi ini juga **menampilkan daftar siswa yang telah terdaftar beserta informasi lengkapnya**.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1.  **Class** adalah template atau blueprint dari object. Pada kode ini, `Siswa` dan `EkstrakurikulerApp` adalah contoh dari class.

    ```java
    public class Siswa {
        ...
    }

    public class EkstrakurikulerApp {
        ...
    }
    ```

2.  **Object** adalah instance dari class. Pada kode ini, `Siswa siswa1 = new Siswa("Muhammad Chaidar Hafizi", "0093959933", "XI DKV");` adalah contoh pembuatan object.

    ```java
    Siswa siswa1 = new Siswa("Muhammad Chaidar Hafizi", "0093959933", "XI DKV");
    ```

3.  **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaLengkap`, `nis`, `kelas`, dan `ekstrakurikuler` adalah contoh atribut.

    ```java
    private String namaLengkap;
    private String nis;
    private String kelas;
    private List<String> ekstrakurikuler;
    ```

4.  **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Siswa`.

    ```java
    public Siswa(String namaLengkap, String nis, String kelas) {
        this.namaLengkap = namaLengkap;
        this.nis = nis;
        this.kelas = kelas;
        this.ekstrakurikuler = new ArrayList<>();
    }
    ```

5.  **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaLengkap`, `setNis`, dan `setKelas` adalah contoh method mutator.

    ```java
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    ```

6.  **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaLengkap`, `getNis`, `getKelas`, dan `getEkstrakurikuler` adalah contoh method accessor.

    ```java
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNis() {
        return nis;
    }

    public String getKelas() {
        return kelas;
    }

    public List<String> getEkstrakurikuler() {
        return ekstrakurikuler;
    }
    ```

7.  **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaLengkap`, `nis`, `kelas`, dan `ekstrakurikuler` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

    ```java
    private String namaLengkap;
    private String nis;
    private String kelas;
    private List<String> ekstrakurikuler;
    ```

8.  **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, **inheritance tidak diimplementasikan secara eksplisit dengan `extends` karena `Siswa` adalah kelas tunggal yang tidak memiliki subclass.**

    ```java
    // Tidak ada implementasi extends di sini sesuai proyek Anda.
    // Contoh untuk referensi jika ada:
    // public class MahasiswaDetail extends Mahasiswa {
    //     ...
    // }
    ```

9.  **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `addEkstrakurikuler(String)` di `Siswa` merupakan overloading method `addEkstrakurikuler` untuk menambahkan satu ekstrakurikuler, dan `addEkstrakurikuler(String, String)` merupakan overloading untuk menambahkan dua ekstrakurikuler.

    ```java
    public void addEkstrakurikuler(String eksekul) {
        this.ekstrakurikuler.add(eksekul);
    }

    public void addEkstrakurikuler(String eksekul1, String eksekul2) {
        this.ekstrakurikuler.add(eksekul1);
        this.ekstrakurikuler.add(eksekul2);
    }
    ```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` untuk memeriksa apakah siswa ditemukan berdasarkan NIS, serta kondisi `if` untuk `exit` dari pencarian.

    ```java
    if (nisCari.equalsIgnoreCase("exit")) {
        System.out.println("Keluar dari pencarian.");
        break;
    }

    // ...

    if (s.getNis().equals(nisCari)) {
        System.out.println("\nSiswa ditemukan:");
        s.displaySiswaInfo();
        ditemukan = true;
        break;
    }
    ```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan data siswa dan `do-while` untuk meminta input NIS berulang kali.

    ```bash
    for (Siswa s : daftarSiswa) {
        ...
    }

    // ...

    do {
        ...
    } while (true);
    ```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input NIS dan method `System.out.println` untuk menampilkan output.

    ```bash
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan NIS: ");
    String nisCari = scanner.nextLine();

    System.out.println("\nDaftar Siswa dan Ekstrakurikuler mereka:");
    System.out.println("\nSiswa ditemukan:");
    ```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `List<Siswa> daftarSiswa = new ArrayList<>();` adalah contoh penggunaan ArrayList sebagai implementasi array dinamis untuk menyimpan objek `Siswa`.

    ```bash
    List<Siswa> daftarSiswa = new ArrayList<>();
    ```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error yang mungkin terjadi selama proses pencarian siswa.

    ```bash
    try {
        for (Siswa s : daftarSiswa) {
            if (s.getNis().equals(nisCari)) {
                System.out.println("\nSiswa ditemukan:");
                s.displaySiswaInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Siswa dengan NIS " + nisCari + " tidak ditemukan.");
        }
    } catch (Exception e) {
        System.err.println("Terjadi kesalahan saat mencari siswa: " + e.getMessage());
    }
    ```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Qoriyatun Ardita
NPM: 2310010446

-----
