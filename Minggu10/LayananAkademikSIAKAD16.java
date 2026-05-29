import java.util.Scanner;

public class LayananAkademikSIAKAD16 {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Lihat Mahasiswa Terbelakang");
        System.out.println("0. Keluar");
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaQueue16 queue = new MahasiswaQueue16(10);
        int pilihan;

        do {
            menu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.next();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.next();
                    System.out.print("Masukkan Prodi Mahasiswa: ");
                    String prodi = sc.next();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = sc.next();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa dt_mhs = queue.dequeue();
                    System.out.println("Mahasiswa yang dilayani: ");
                    dt_mhs.printData();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + queue.getJumlahAntrian());
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }while (pilihan != 0);

        sc.close();
    }
}
