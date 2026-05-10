import java.util.Scanner;

public class PerpustakaanDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        Buku book1 = new Buku("B001", "Algoritma", 2020);
        Buku book2 = new Buku("B002", "Basis Data", 2019);
        Buku book3 = new Buku("B003", "Pemrograman", 2021);
        Buku book4 = new Buku("B004", "Fisika", 2024);

        Peminjaman pjm1 = new Peminjaman(mhs1, book1, 7);
        Peminjaman pjm2 = new Peminjaman(mhs2, book2, 3);
        Peminjaman pjm3 = new Peminjaman(mhs3, book3, 10);
        Peminjaman pjm4 = new Peminjaman(mhs3, book4, 6);
        Peminjaman pjm5 = new Peminjaman(mhs1, book2, 4);

        DatabasePeminjaman dbperpus = new DatabasePeminjaman();

        dbperpus.dataMhs[0] = mhs1;
        dbperpus.dataMhs[1] = mhs2;
        dbperpus.dataMhs[2] = mhs3;

        dbperpus.dataBuku[0] = book1;
        dbperpus.dataBuku[1] = book2;
        dbperpus.dataBuku[2] = book3;
        dbperpus.dataBuku[3] = book4;

        dbperpus.dataPinjam[0] = pjm1;
        dbperpus.dataPinjam[1] = pjm2;
        dbperpus.dataPinjam[2] = pjm3;
        dbperpus.dataPinjam[3] = pjm4;
        dbperpus.dataPinjam[4] = pjm5;

        System.out.println();
        boolean menu = true;
        do {
            System.out.println("=== SISTEM PEMINJAMAN BUKU JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("===================================");
            System.out.print("Pilih: ");
            String tmp = sc.nextLine();
            int pilih = Integer.valueOf(tmp);
            System.out.println("===================================");

            switch (pilih) {
                case 0:
                    System.out.println("Terima Kasih");
                    menu = false;
                    break;
                case 1:
                    System.out.println("Data Mahasiswa");
                    dbperpus.tampilSemuaMahasiswa();
                    break;
                case 2:
                    System.out.println("Data Buku");
                    dbperpus.tampilSemuaBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman");
                    dbperpus.tampilSemuaPeminjaman();
                    break;
                case 4:
                    System.out.println("Data Peminjaman Urut Berdasarkan Denda (DESC)");
                    dbperpus.sortByDenda();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    int input = Integer.valueOf(sc.nextLine());
                    dbperpus.searchByNIM(0, dbperpus.dataMhs.length - 1, input);
                    break;
                case 6:
                    dbperpus.sortByProdi();
                    break;
                case 7:
                    dbperpus.searchAllProdi("Teknik Informatika");
                    break;
                default:
                    System.out.println("Inputan salah, masukkan angka di rentang 1 - 5");
                    break;
            }
        } while (menu);
        // dbperpus.sortByDenda();
        // dbperpus.sortByNIM();
        // dbperpus.searchByNIM(0, dbperpus.dataMhs.length, 22000);
    }
}
