package bagian3.kontak;

public class Kontak {
    private String nama;
    private String nomor;
    private String email; // Tambahan Soal No. 2

    // Constructor diperbarui untuk menerima 3 parameter (Soal No. 2)
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    // Getter untuk email (Soal No. 2)
    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi baris teks dengan 3 bagian (Soal No. 2)
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan lengkap kontak (Soal No. 2)
    public String info() {
        return nama + " | " + nomor + " | " + email;
    }
}
