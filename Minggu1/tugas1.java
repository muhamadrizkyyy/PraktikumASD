import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char KODE[] = {
                'A',
                'B',
                'D',
                'E',
                'F',
                'G',
                'H',
                'L',
                'N',
                'T'
        };

        char KOTA[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ' }
        };

        char pilih;
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Masukkan kode plat : ");
        pilih = sc.next().charAt(0);
        System.out.println("==================================================");
        for (int i = 0; i < KODE.length; i++) {
            if (Character.toUpperCase(pilih) == KODE[i]) {
                for (int n = 0; n < KOTA[i].length; n++) {
                    System.out.print(KOTA[i][n]);
                }
            } else {
                System.out.println("Kode tidak ditemukan!");
            }
        }

    }
}