public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    String kategori_lama_pinjam; //modifikasi A3
    int lamaPinjam, batasPinjam = 5, terlambat,denda;

    public Peminjaman() {
        
    }

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;

        //modifikasi A3
        if (lamaPinjam > 5) {
            kategori_lama_pinjam = "Lama";
        } else if (lamaPinjam <= 5 && lamaPinjam > 3) {
            kategori_lama_pinjam = "Normal";
        } else {
            kategori_lama_pinjam = "Cepat";
        }
        hitungDenda();
    }

    public void hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            denda = terlambat * 2000;
        } else {
            denda = 0;
            terlambat = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println("NIM : " + mhs.nim + " | Nama : " + mhs.nama + " | Judul Buku : " + buku.judul + " | Lama Pinjam : " + lamaPinjam + " | Terlambat : " + terlambat + " | Denda : " + denda + " | Kategori Durasi : " + kategori_lama_pinjam); //modifikasi A3
    }

}
