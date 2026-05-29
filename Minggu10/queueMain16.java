import java.util.Scanner;

public class queueMain16 {
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Exit");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue16 queue16 = new queue16(5);
        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = sc.nextInt();
                    queue16.enqueue(data);
                    break;
                case 2:
                    queue16.dequeue();
                    break;
                case 3:
                    queue16.print();
                    break;
                case 4:
                    queue16.peek();
                    break;
                case 5:
                    queue16.clear();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (true);
    }
}
