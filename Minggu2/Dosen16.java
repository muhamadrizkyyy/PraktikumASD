public class Dosen16 {
    String idDOsen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen16() {
        
    }

    public Dosen16(String id, String nm, String keahlian, boolean status, int tahun) {
        idDOsen = id;
        nama = nm;
        bidangKeahlian = keahlian;
        statusAktif = status;
        tahunBergabung = tahun;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDOsen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        if (statusAktif) {
            System.out.println("Status Aktif: Aktif");
        } else {
            System.out.println("Status Aktif: Nonaktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen berhasil diubah!");
        System.out.println();
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String keahlian) {
        bidangKeahlian = keahlian;
        System.out.println("Keahlian dosen berhasil diubah!");
    }
}