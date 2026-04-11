public class Mahasiswa16 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa16() {

    }

    public Mahasiswa16(String nim,String nama,String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public double ip () {
        return 0;
    }

    public void tampilInformasi() {
        System.out.println("Data Mahasiswa");
        System.out.println("nim : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("ipk : " + ipk);
    }

    public void tampilIPK() {
        System.out.print(ipk + " ");
    }
}