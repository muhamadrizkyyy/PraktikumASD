import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen16 arrDosen[] = new Dosen16[3];

        for (int i = 0; i < arrDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kd = sc.nextLine();
            System.out.print("Nama: ");
            String nm = sc.nextLine();
            System.out.print("Jenis kelamin (p/w): ");
            char jk = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Usia: ");
            String dummy = sc.nextLine();
            int usia = Integer.parseInt(dummy);

            do {
                if (jk == 'p' || jk == 'P') {
                    arrDosen[i] = new Dosen16(kd, nm, true, usia);
                    System.out.println("---------------------------");
                    break;
                } else if (jk == 'w' || jk == 'W') {
                    arrDosen[i] = new Dosen16(kd, nm, false, usia);
                    System.out.println("---------------------------");
                    break;
                } else {
                    System.out.println("Jenis Kelamin tidak valid!");
                    System.out.println("---------------------------");
                    System.out.print("Jenis kelamin (p/w): ");
                    jk = sc.next().charAt(0);
                }
            } while (true);

        }

        System.out.println();

        // int x = 1;
        // for (Dosen16 dosen16 : arrDosen) {
        // System.out.println("Data Dosen ke-" + (x++));
        // System.out.println("Kode: " + dosen16.kode);
        // System.out.println("Nama: " + dosen16.nama);
        // System.out.println("Jenis Kelamin: " + (dosen16.jenisKelamin ? "Pria" :
        // "Wanita"));
        // System.out.println("Usia: " + dosen16.usia);
        // System.out.println("---------------------------");
        // }

        System.out.println("---------------------------");
        DataDosen16 dataDosen16 = new DataDosen16();
        dataDosen16.dataSemuaDosen(arrDosen);
        dataDosen16.jumlahDosenPerJenisKelamin(arrDosen);
        System.out.println("---------------------------");
        dataDosen16.rerataUsiaDosenPerJenisKelamin(arrDosen);
        System.out.println("---------------------------");
        dataDosen16.infoDosenPalingMuda(arrDosen);
        System.out.println("---------------------------");
        dataDosen16.infoDosenPalingTua(arrDosen);
        System.out.println("---------------------------");
    };
}
