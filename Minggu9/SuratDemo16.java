import java.util.Scanner;

public class SuratDemo16 {
    static Scanner sc = new Scanner(System.in);
    public static void menu() {
        System.out.println("1. Terima Surat");
        System.out.println("2. Proses Surat");
        System.out.println("3. Melihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu : ");
    }

    public static void main(String[] args) {
        StackSurat16 surat = new StackSurat16(10);
        boolean menu = true;
        int pilih;
        do {
            System.out.println("=======================================");
            System.out.println("Menu");
            System.out.println("=======================================");
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.println("=======================================");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan id surat: ");
                    String id_surat = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (A/I/S): ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan durasi: ");
                    int durasi = sc.nextInt();
                    Surat16 s = new Surat16(id_surat, nama, kelas, jenis, durasi);
                    surat.push(s);
                    System.out.printf("Surat dengan id %s berhasil ditambahkan\n", id_surat);
                    break;
                case 2:
                    Surat16 data = surat.pop();
                    if (data != null) {
                        System.out.printf("Surat dengan id %s berhasil diproses\n", data.idSurat);
                    } else {
                        System.out.println("Surat gagal di proses!");
                    }
                    break;
                case 3:
                    Surat16 last = surat.peek();
                    if (last != null) {
                        System.out.println("Surat Terakhir");
                        System.out.println("ID-Surat Nama Mahasiswa Kelas Jenis-Izin Durasi");
                        System.out.println(last.idSurat + " " + last.namaMhs + " " + last.kelas + " " + last.jenisIzin + " " + last.durasi);
                    }
                    break;
                case 4:
                    System.out.println("PENCARIAN DATA SURAT");
                    System.out.print("Masukkan Nama: ");
                    String cari = sc.nextLine();
                    Surat16 cariSurat = surat.findData(cari);
                    if (cariSurat != null) {
                        System.out.println("Data ditemukan");
                        System.out.println("ID-Surat Nama Mahasiswa Kelas Jenis-Izin Durasi");
                        System.out.println(cariSurat.idSurat + cariSurat.namaMhs + cariSurat.kelas + cariSurat.jenisIzin + cariSurat.durasi);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (menu);
    }
}
