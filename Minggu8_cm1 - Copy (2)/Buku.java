public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    public Buku() {
        
    }

    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku() {
        System.out.println("Kode Buku : " + kodeBuku + " | Judul : " + judul + " | Tahun Terbit : " + tahunTerbit);
    }
}
