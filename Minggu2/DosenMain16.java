public class DosenMain16 {
    public static void main(String[] args) {
        Dosen16 dos1 = new Dosen16("TI0087", "Balaraja Syahputra", "Pemrograman Web", true, 2019);
        Dosen16 dos2 = new Dosen16("TI0023", "Gusti Handoko", "Jaringan Komputer", true, 2011);
        Dosen16 dos3 = new Dosen16("TI0010", "Supriadi", "IOT", false, 1999);

        System.out.println("====================================");
        dos1.tampilInformasi();
        System.out.println("Lama masa kerja : " + dos1.hitungMasaKerja(2026) + " tahun");
        System.out.println("====================================");
        dos1.setStatusAktif(false);
        dos1.ubahKeahlian("Pemrogaraman Web & Mobile");
        System.out.println("====================================");
        dos1.tampilInformasi();

        System.out.println("====================================");
        dos2.tampilInformasi();
        System.out.println("Lama masa kerja :" + dos2.hitungMasaKerja(2026) + " tahun");
        System.out.println("====================================");
        dos2.setStatusAktif(false);
        dos2.ubahKeahlian("Computer Science");
        System.out.println("====================================");
        dos2.tampilInformasi();

        System.out.println("====================================");
        dos3.tampilInformasi();
        System.out.println("Lama masa kerja :" + dos3.hitungMasaKerja(2026) + " tahun");
        System.out.println("====================================");
        dos3.setStatusAktif(true);
        dos3.ubahKeahlian("PBO");
        System.out.println("====================================");
        dos3.tampilInformasi();
    }
}
