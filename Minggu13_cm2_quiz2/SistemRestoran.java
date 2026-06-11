import java.util.Scanner;

public class SistemRestoran {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n===============================");
        System.out.println("SISTEM ANTREAN ROYAL DELISH");
        System.out.println("===============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        DataAntrian da = new DataAntrian();
        DataPesanan dp = new DataPesanan();
        int pilih;
        do {
            menu();
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pelanggan : ");
                    String pelanggan = sc.nextLine();
                    System.out.print("No HP : ");
                    String nohp = sc.nextLine();
                    Pelanggan pel = new Pelanggan(pelanggan, nohp);
                    da.enqueue(pel);
                    break;
                case 2:
                    System.out.printf("%-10s %-15s %-10s\n", "No Antrian", "Nama Pelanggan", "Nomor HP");
                    da.printAntrian();
                    break;
                case 3:
                    NodeAntrian data = da.dequeue();
                    if (data != null) {
                        System.out.print("Kode Pesanan : ");
                        int kdpesan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String nmpesan = sc.nextLine();
                        System.out.print("Harga : ");
                        int hrg = sc.nextInt();
                        Pesanan pesan = new Pesanan(kdpesan, nmpesan, hrg);
                        dp.addData(data.data, pesan);
                        System.out.println("Antrean " + data.data.namaPelanggan + " berhasil dihapus");
                    } else {
                        System.out.println("Gagal menghapus antrian!");
                    }
                    break;
                case 4:
                    dp.printPesanan();
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        } while (pilih != 0);
    }
}
