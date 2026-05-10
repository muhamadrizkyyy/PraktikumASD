public class Mahasiswa16 {

    String nama,nim,kelas;
    int nilai;

    public Mahasiswa16() {

    }
    
    public Mahasiswa16(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinlai(int nilai) {
        this.nilai = nilai;
    }

    
}