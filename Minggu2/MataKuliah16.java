public class MataKuliah16 {
    String kodeMk, nama;
    int sks, jumlahJam;

    public MataKuliah16() {
        
    }

    public MataKuliah16(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMk);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah!");
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam matkul berhasil ditambahkan!");
        System.out.println("Jumlah jam : " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam matkul berhasil dikurangi!");
            System.out.println("Jumlah jam : " + jumlahJam);
        }
    }
}
