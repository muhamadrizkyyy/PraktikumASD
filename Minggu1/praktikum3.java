import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[] = {
                "Agama",
                "Aljabar Linier",
                "Desain Antarmuka",
                "Sistem Operasi",
                "Rekayasa Perangkat Lunak",
                "Basis Data",
                "Praktikum Basis Data",
                "Algoritma dan Struktur Data",
                "Praktikum Algoritma Dan Struktur Data"
        };
        int sks[] = {
                2,
                2,
                2,
                2,
                2,
                2,
                2,
                2,
                3
        };
        int totalsks = 0;
        double totalBobotNilai = 0, ipk;
        String hasilBelajar[][] = new String[matkul.length][3];

        System.out.println("\n========== INPUT NILAI MAHASISWA ==========");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai " + matkul[i] + " : ");
            hasilBelajar[i][0] = sc.nextLine();
            
            //grade, nilai setara
            if (80 < Integer.parseInt(hasilBelajar[i][0]) && Integer.parseInt(hasilBelajar[i][0]) <= 100) {
                hasilBelajar[i][1] = "A";
                hasilBelajar[i][2] = "4";
            } else if (Integer.parseInt(hasilBelajar[i][0]) > 73 && Integer.parseInt(hasilBelajar[i][0]) <= 80) {
                hasilBelajar[i][1] = "B+";
                hasilBelajar[i][2] = "3.5";
            } else if(Integer.parseInt(hasilBelajar[i][0]) > 65 && Integer.parseInt(hasilBelajar[i][0]) <= 73){
                hasilBelajar[i][1] = "B";
                hasilBelajar[i][2] = "3";
            } else if (Integer.parseInt(hasilBelajar[i][0]) > 60 && Integer.parseInt(hasilBelajar[i][0]) <= 65) {
                hasilBelajar[i][1] = "C+";
                hasilBelajar[i][2] = "2.5";
            } else if (Integer.parseInt(hasilBelajar[i][0]) > 50 && Integer.parseInt(hasilBelajar[i][0]) <= 60) {
                hasilBelajar[i][1] = "C";
                hasilBelajar[i][2] = "2";
            } else if (Integer.parseInt(hasilBelajar[i][0]) > 39 && Integer.parseInt(hasilBelajar[i][0]) <= 50) {
                hasilBelajar[i][1] = "D"; 
                hasilBelajar[i][2] = "1";
            } else {
                hasilBelajar[i][1] = "E";
                hasilBelajar[i][2] = "0";
            }

            totalsks += sks[i];
            totalBobotNilai += (Double.parseDouble(hasilBelajar[i][2]) * sks[i]);
        }

        ipk = totalBobotNilai / totalsks;
        System.out.println("\n========== HASIL KONVERSI NILAI ==========");
        System.out.printf("%-40s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Nilai", "Huruf", "Bobot");
        
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-10s %-10s %-10s\n",
                    matkul[i], hasilBelajar[i][0], hasilBelajar[i][1], hasilBelajar[i][2]);
        }

        System.out.println("==================================================");
        System.out.println();
        System.out.printf("IPK : %.2f", ipk);
    }
}
