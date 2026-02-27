import java.util.Scanner;

public class MatakuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah16 arrMatkul[] = new Matakuliah16[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.println("---------------------------");

        for (int i = 0; i < arrMatkul.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrMatkul[i] = new Matakuliah16(kode, nama, sks, jumlahJam);
            System.out.println("---------------------------");
        }

        for (int i = 0; i < arrMatkul.length; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arrMatkul[i].kode);
            System.out.println("Nama: " + arrMatkul[i].nama);
            System.out.println("SKS: " + arrMatkul[i].sks);
            System.out.println("Jumlah Jam: " + arrMatkul[i].jumlahJam);
            System.out.println("---------------------------");
        }
    }
}
