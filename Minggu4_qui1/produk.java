public class produk {
    String nama16;
    double harga16, diskon16;
    int stok16;

    public produk() {
        
    }

    public produk(String nama16, double harga16, double diskon16, int stok16) {
        this.nama16 = nama16;
        this.harga16 = harga16;
        this.diskon16 = diskon16;
        this.stok16 = stok16;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama produk : " + nama16);
        System.out.println("Harga produk : " + harga16);
        System.out.println("Stok produk : " + stok16);
        System.out.println("Diskon produk : " + diskon16 + "%");
    }

    public double hitungHargaDiskon(double diskon16, double harga16) {
        return harga16 - (harga16 * diskon16 / 100);
    }
}