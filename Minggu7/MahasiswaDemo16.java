import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        int idx;
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        Scanner sc = new Scanner(System.in);
        // System.out.println();
        // System.out.println("Data Mahasiswa");
        // for (int i = 0; i < list.listMhs.length; i++) {
        // System.out.print("Masukkan NIM : ");
        // String nim = sc.nextLine();
        // System.out.print("Masukkan Nama : ");
        // String nama = sc.nextLine();
        // System.out.print("Masukkan Kelas : ");
        // String kelas = sc.nextLine();
        // System.out.print("Masukkan IPK : ");
        // String tmp = sc.nextLine();
        // double ipk = Double.parseDouble(tmp);

        // System.out.println("-------------------------------------");

        // Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
        // list.tambah(mhs);
        // }

        Mahasiswa16 m1 = new Mahasiswa16("123", "Zidan", "2A", 3.2);
        Mahasiswa16 m2 = new Mahasiswa16("124", "Ayu", "2A", 3.5);
        Mahasiswa16 m3 = new Mahasiswa16("125", "Sofi", "2A", 3.1);
        Mahasiswa16 m4 = new Mahasiswa16("126", "Sita", "2A", 3.9);
        Mahasiswa16 m5 = new Mahasiswa16("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        list.tampil();

        System.out.println("=======================================");
        System.out.println("Pencarian Data");
        System.out.println("=======================================");
        System.out.print("Masukkan IPK yang ingin dicari : ");
        String tmp = sc.nextLine();
        double key = Double.valueOf(tmp);

        System.out.println("Menggunakan sequential search");
        idx = list.sequentialSearch(key);
        list.tampilPosisi(key, idx);
        list.tampilDataSearch(idx);
    }
}
