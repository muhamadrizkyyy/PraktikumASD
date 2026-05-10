public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam, batasPinjam = 5, terlambat,denda;
    boolean statusTerlambat = false;

    public Peminjaman() {
        
    }

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            denda = terlambat * 2000;
            statusTerlambat = true;
        } else {
            denda = 0;
            terlambat = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.print("NIM : " + mhs.nim + " | Nama : " + mhs.nama + " | Judul Buku : " + buku.judul + " | Lama Pinjam : " + lamaPinjam + " | Terlambat : " + terlambat + " | Denda : " + denda + " | Status Keterlmbatan : ");
        if (statusTerlambat) {
            System.out.print(" Terlambat");
        } else {
            System.out.print(" Tidak Terlambat");
        }
    }

}
