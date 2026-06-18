package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        System.out.println("=== SOAL 1: Cek Keberadaan & Ukuran Berkas ===");
        // 1. Buat objek File yang menunjuk laporan.txt
        File laporan = new File("laporan.txt");
        if (laporan.exists()) {
            System.out.println("Berkas ada, ukuran: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
        
        System.out.println("\n=== SOAL 2: Membuat Folder Baru ===");
        // 2. Buat sebuah folder baru bernama arsip menggunakan method mkdir()
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat (atau sudah ada sebelumnya).");
        }
        
        System.out.println("\n=== SOAL 3: Buat lalu Hapus Berkas ===");
        // 3. Buat objek File sementara.txt, buat berkasnya, lalu hapus kembali
        File sementara = new File("sementara.txt");
        try {
            // Membuat berkas baru
            if (sementara.createNewFile()) {
                System.out.println("Sebelum dihapus, berkas ada? " + sementara.exists());
            }
            
            // Menghapus kembali berkas
            if (sementara.delete()) {
                System.out.println("Sesudah dihapus, berkas ada? " + sementara.exists());
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
    

