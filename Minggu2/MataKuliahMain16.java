public class MataKuliahMain16 {
    public static void main(String[] args) {
        MataKuliah16 mk1 = new MataKuliah16("PBO","Pemrograman Berorientasi Objek", 3, 5);
        MataKuliah16 mk2 = new MataKuliah16("ASD","Algoritma dan Struktur Data", 4, 4);
        MataKuliah16 mk3 = new MataKuliah16("PWB","Pemrograman Web", 3, 6);

        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(2);
        mk1.kurangiJam(20);
        mk1.tampilInformasi();

        System.out.println("====================================");
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(4);
        mk2.kurangiJam(5);
        mk2.kurangiJam(10);
        mk2.tampilInformasi();

        System.out.println("====================================");
        mk3.tampilInformasi();
        mk3.ubahSKS(4);
        mk3.tambahJam(3);
        mk3.kurangiJam(1);
        mk3.kurangiJam(10);
        mk3.tampilInformasi();
    }
}
