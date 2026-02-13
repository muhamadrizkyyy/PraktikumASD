import java.util.Scanner;

public class tugas2 {
    static String jadwalMatkul[][];
    static Scanner sc = new Scanner(System.in);
    static int matkulTerisi = 0;

    public static void main(String[] args) {
        int jumlahMatkul;
        System.out.println();

        System.out.println("==============================");
        System.out.print("Masukkan jumlah mata kuliah : ");
        jumlahMatkul = sc.nextInt();

        jadwalMatkul = new String[jumlahMatkul][4];

        System.out.println();

        do {
            System.out.println("==============================");
            System.out.println("Menu");
            System.out.println("==============================");
            System.out.println("1. Tambah data mata kuliah");
            System.out.println("2. Cetak seluruh mata kuliah");
            System.out.println("3. Cari data matkul berdasarkan hari");
            System.out.println("4. Cari data matkul berdasarkan nama mata kuliah");
            System.out.println("5. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu : ");
            int menu = sc.nextInt();

            sc.nextLine();

            switch (menu) {
                case 1:
                    addDataMatkul();
                    break;
                case 2: 
                    printDataMatkul();
                    break;
                case 3:
                    System.out.print("Masukkan hari : ");
                    searchDataMatkulByDay(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah : ");
                    searchDataMatkulByName(sc.nextLine());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
            }
        } while (true);
    }

    public static void addDataMatkul() {
        if (matkulTerisi == (jadwalMatkul.length)) {
            System.out.println("==============================");
            System.out.println("Jadwal penuh");
        } else {
            do {
                System.out.println("==============================");
                System.out.print("Nama mata kuliah : ");
                jadwalMatkul[matkulTerisi][0] = sc.nextLine();
                System.out.print("Ruang : ");
                jadwalMatkul[matkulTerisi][1] = sc.nextLine();
                System.out.print("Hari : ");
                jadwalMatkul[matkulTerisi][2] = sc.nextLine();
                System.out.print("Pukul : ");
                jadwalMatkul[matkulTerisi][3] = sc.nextLine();

                matkulTerisi++;

                // if (matkulTerisi != (jadwalMatkul.length - 1)) {
                //     System.out.print("Apakah anda ingin menambahkan data lagi? (y/n) : ");
                //     if (sc.nextLine().equalsIgnoreCase("n")) {
                //         break;
                //     }
                // }
            } while (jadwalMatkul.length != matkulTerisi);

        }
    }

    public static void printDataMatkul() {
        System.out.println("==============================");
        System.out.printf("%-40s %-10s %-10s %-20s\n",
                "Mata Kuliah", "Ruang", "Hari", "Pukul");

        for (int i = 0; i < jadwalMatkul.length; i++) {
            System.out.printf("%-40s %-10s %-10s %-20s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
        }
    }

    public static void searchDataMatkulByDay(String keyword) {
        System.out.println("==============================");
        for (int i = 0; i < jadwalMatkul.length; i++) {
            if (jadwalMatkul[i][2].equalsIgnoreCase(keyword)) {
                System.out.printf("%-40s %-10s %-10s %-20s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
            } else {
                System.out.println("Data tidak ditemukan!");
            }
        }
    }

    public static void searchDataMatkulByName(String keyword) {
        System.out.println("==============================");
        for (int i = 0; i < jadwalMatkul.length; i++) {
            if (jadwalMatkul[i][0].equalsIgnoreCase(keyword)) {
                System.out.printf("%-40s %-10s %-10s %-20s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
            } else {
                System.out.println("Data tidak ditemukan!");
            }
        }
    }
}
