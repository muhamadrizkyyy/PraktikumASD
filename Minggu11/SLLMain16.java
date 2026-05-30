import java.util.Locale;
import java.util.Scanner;

public class SLLMain16 {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa16 formMhs() {
        sc.useLocale(Locale.US);
        System.out.print("NIM: ");
        String nim = sc.next();
        System.out.print("Nama: ");
        String nama = sc.next();
        System.out.print("Prodi: ");
        String prodi = sc.next();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();

        return new Mahasiswa16(nim, nama, prodi, ipk);
    }

    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        Mahasiswa16 mhs1 = new Mahasiswa16("2541", "Andi", "SI-A", 3.7);
        Mahasiswa16 mhs2 = new Mahasiswa16("2542", "Budi", "SI-A", 3.0);
        Mahasiswa16 mhs3 = new Mahasiswa16("2543", "Cindy", "SI-A", 3.9);
        Mahasiswa16 mhs4 = new Mahasiswa16("2544", "Dedi", "SI-A", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter(mhs3, "dedi");
        // sll.print();
        // sll.insertAt(mhs2, 10);
        // sll.print();

        
        int pilihan;
        do {
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add After");
            System.out.println("4. Add At");
            System.out.println("5. Print");
            System.out.println("0. Exit");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    sll.addFirst(formMhs());
                    break;
                case 2:
                    sll.addLast(formMhs());
                    break;
                case 3:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    sll.insertAfter(formMhs(), nama);
                    break;
                case 4:
                    System.out.print("Index: ");
                    int index = sc.nextInt();
                    sll.insertAt(formMhs(), index);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
    }
}
