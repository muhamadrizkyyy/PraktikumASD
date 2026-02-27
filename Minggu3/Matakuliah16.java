public class Matakuliah16 {
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliah16() {
    }

    public Matakuliah16(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("Data berhasil ditambahkan!");
    }
}
