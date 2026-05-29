import java.util.Scanner;

public class LayananPengajuanKRS {
    static AntrianKRS antrian = new AntrianKRS(3);

    public static void infoAntrian() {
        System.out.println("Jumlah Antrian: " + antrian.getSize());
        System.out.println("Jumlah Mahasiswa yang sudah melakukan proses KRS: " + antrian.getMHSRegistered());
        System.out.println("Jumlah Mahasiswa yang belum melakukan proses KRS: " + antrian.getMHSUnregistered());
    }

    public static void menu() {
        System.out.println("\n=== Menu Antrian Layanan Pengajuan KRS ===");
        System.out.println("1. Daftar Pengajuan KRS");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Antrian Terdepan");
        System.out.println("4. Lihat Semua Antrian");
        System.out.println("5. Lihat Antrian Terbelakang");
        System.out.println("6. Informasi Antrian");
        System.out.println("0. Keluar");
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            menu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sc.nextLine();
                    // tambah mahasiswa ke antrian
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa16 mhs = new Mahasiswa16(nim, nama, prodi, kelas);
                    antrian.registration(mhs);
                    System.out.println(nama + " berhasil terdaftar!");
                    break;
                case 2:
                    // layani mahasiswa
                    Mahasiswa16[] dt = antrian.dequeue();
                    if (dt.length > 0) {
                        System.out.println("Mahasiswa yang selesai dilayani: ");
                        for (Mahasiswa16 m : dt) {
                            m.printData();
                        }
                    }
                    break;
                case 3:
                    // lihat mahasiswa terdepan
                    antrian.peek();
                    break;
                case 4:
                    // lihat semua antrian
                    antrian.print();
                    break;
                case 5:
                    // lihat mahasiswa terbelakang
                    antrian.peekRear();
                    break;
                case 6:
                    // informasi antrian
                    infoAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
    }
}
