public class Mahasiswa16 {
    String nim, nama, prodi, kelas;
    boolean statusKRS = false;

    public Mahasiswa16(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void printData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas + " - " + (statusKRS ? "Sudah Mengajukan" : "Belum Mengajukan"));
    }
}