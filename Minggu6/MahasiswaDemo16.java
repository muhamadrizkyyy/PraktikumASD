import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Data Mahasiswa");
        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.print("Masukkan NIM : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            String tmp = sc.nextLine();
            double ipk = Double.parseDouble(tmp);

            System.out.println("-------------------------------------");

            Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("Data Mahasiswa sebelum disorting");
        System.out.println("=======================================");
        list.tampil();

        System.out.println();
        System.out.println("Data setelah disorting");
        list.bubbleSort();
        System.out.println("=======================================");
        list.tampil();
    }
}
