import java.util.Scanner;

public class LayananUnitMahasiswa {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Mahasiswa Terbelakang");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Clear Antrian");
        System.out.println("0. Keluar");
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList16 SLLqueue = new SingleLinkedList16();
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
                    SLLqueue.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa dt_mhs = SLLqueue.dequeue();
                    System.out.println("Mahasiswa yang dilayani: ");
                    dt_mhs.tampilInformasi();
                    break;
                case 3:
                    SLLqueue.peek();
                    break;
                case 4:
                    SLLqueue.peekLast();
                    break;
                case 5:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + SLLqueue.getSize());
                    break;
                case 6:
                    SLLqueue.clearQueue();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
