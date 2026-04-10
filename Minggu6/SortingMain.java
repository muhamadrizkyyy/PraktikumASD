public class SortingMain {
    public static void main(String[] args) {
        // int[] a = {20, 10, 2, 7, 12};
        // Sorting16 obj1 = new Sorting16(a, a.length);
        // System.out.println("Data awal");
        // obj1.tampil();
        // obj1.bubbleSort();
        // System.out.println("Data berhasil diurutkan");
        // obj1.tampil();

        // int[] b = {30, 20, 2, 8, 14};
        // Sorting16 obj2 = new Sorting16(b, b.length);

        // System.out.println("Data awal");
        // obj2.tampil();
        // obj2.selectionsort();
        // System.out.println("Data berhasil diurutkan");
        // obj2.tampil();

        int[] c = {40, 10, 4, 9, 3};
        Sorting16 obj3 = new Sorting16(c, c.length);
        System.out.println("Data awal");
        obj3.tampil();
        obj3.insertionsort();
        System.out.println("Data berhasil diurutkan");
        obj3.tampil();
    }
}
