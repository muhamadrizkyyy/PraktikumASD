import java.util.Scanner;

public class MahasiswaDemo16 {
    static Scanner sc = new Scanner(System.in);
    public static void menu() {
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Daftar Tugas");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu : ");
    }

    public static void main(String[] args) {
        StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);
        int pilih;
        boolean menu = true;

        do {
            System.out.println("=======================================");
            System.out.println("Menu");
            System.out.println("=======================================");
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println("=======================================");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa16 mhs = new Mahasiswa16(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil di kumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa16 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan Nilai: ");
                        int nilai = sc.nextInt();
                        dinilai.nilai = nilai;
                        System.out.printf("Tugas %s berhasil di nilai\n", dinilai.nama);
                    }
                    break;
                case 3:
                    Mahasiswa16 show = stack.peek();
                    if (show != null) {
                        System.out.printf("Tugas Teratas: %s\n", show.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Tugas");
                    stack.print();
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
