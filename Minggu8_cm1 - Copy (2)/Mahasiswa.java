public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa() {
        
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("Nama : " + nama + " | NIM : " + nim + " | Prodi : " + prodi);
    }
}
