import java.util.Scanner;

class praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai_tgs, nilai_kuis, nilai_uts, nilai_uas, nilai_akhir;
        String grade = "";

        System.out.println("\n========== PROGRAM MENGHITUNG NILAI AKHIR ==========");
        System.out.println("==================================================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilai_tgs = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        nilai_kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilai_uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilai_uas = sc.nextDouble();

        System.out.println("==================================================");

        if (nilai_tgs > 100 || nilai_kuis > 100 || nilai_uts >100 || nilai_uas > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            // Menghitung nilai akhir matkul algoritma mahasiswa
            nilai_akhir = ((nilai_tgs*0.2) + (nilai_kuis*0.2) + (nilai_uts*0.3) + (nilai_uas*0.3));

            // cek predikat nilai akhir matkul algoritma mahasiswa
            if (80 < nilai_akhir && nilai_akhir <= 100) {
                grade = "A";
            } else if (nilai_akhir > 73 && nilai_akhir <= 80) {
                grade = "B+";
            } else if(nilai_akhir > 65 && nilai_akhir <= 73){
                grade = "B";
            } else if (nilai_akhir > 60 && nilai_akhir <= 65) {
                grade = "C+";
            } else if (nilai_akhir > 50 && nilai_akhir <= 60) {
                grade = "C";
            } else if (nilai_akhir > 39 && nilai_akhir <= 50) {
                grade = "D"; 
            } else {
                grade = "E";
            }
            System.out.println("Nilai Akhir : " + nilai_akhir);
            System.out.println("Nilai Huruf : " + grade);
        }

        System.out.println("==================================================");
        if (grade != "") {
            if (grade == "D" || grade == "E") {
                System.out.println("Anda Tidak Lulus!");
            } else {
                System.out.println("Selamat Anda Lulus!");
            }
        }
    }
}