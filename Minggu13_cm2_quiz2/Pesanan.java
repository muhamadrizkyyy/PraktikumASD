public class Pesanan {
    String namaPesanan;
    int kodePesanan, harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.namaPesanan = namaPesanan;
        this.kodePesanan = kodePesanan;
        this.harga = harga;
    }

    public void printDataPesanan() {
        System.out.printf("%-12s %-25s %-10d\n", kodePesanan, namaPesanan, harga);
    }
}
