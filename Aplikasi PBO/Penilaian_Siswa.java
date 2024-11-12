/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
public class Penilaian_Siswa {

    // Prosedur utama untuk memproses penilaian siswa
    public static void prosesPenilaian(String nama, int nilai) {
        String keterangan = cekKelulusan(nilai); // Memanggil fungsi cek kelulusan
        tampilkanHasil(nama, nilai, keterangan); // Menampilkan hasil penilaian
    }

    // Prosedur untuk menampilkan hasil penilaian
    public static void tampilkanHasil(String nama, int nilai, String keterangan) {
        System.out.println("\nHasil Penilaian:");
        System.out.println("Nama Siswa    : " + nama);
        System.out.println("Nilai         : " + nilai);
        System.out.println("Keterangan    : " + keterangan);
    }

    // Fungsi untuk mengecek kelulusan berdasarkan nilai
    public static String cekKelulusan(int nilai) {
        return (nilai > 70) ? "Lulus" : "Tidak Lulus";
    }
}
    

