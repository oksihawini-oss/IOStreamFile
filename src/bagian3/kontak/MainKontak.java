package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Membuat objek pengelola awal dan mengisinya (dengan data Email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        
        System.out.println("=== TAHAP 1: Mengisi Data Awal (3 Parameter) ===");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        System.out.println("=== TAHAP 2: Pengujian Uji Cari Kontak (Soal 1) ===");
        buku.cariKontak("Budi");  // Harusnya ketemu
        buku.cariKontak("Dewi");  // Harusnya tidak ketemu
        System.out.println();

        System.out.println("=== TAHAP 3: Pengujian Hapus Kontak & Auto-Save (Soal 3) ===");
        buku.hapusKontak("Andi"); // Menghapus Andi dan otomatis simpan ke file
        System.out.println();

        System.out.println("=== TAHAP 4: Membuktikan Data Tersimpan Menggunakan Objek Baru ===");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua(); // Hasilnya tidak boleh ada Andi, tersisa Budi & Citra
        System.out.println("Jumlah kontak saat ini: " + bukuLain.jumlahKontak());
    }
}
