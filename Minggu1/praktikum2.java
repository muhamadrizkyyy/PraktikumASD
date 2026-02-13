public class praktikum2 {
    public static void main(String[] args) {
        // nim = 254107020027
        int n = 27;

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else {
                if (i % 3 == 0) {
                    System.out.print(" # ");
                } else if (i % 2 == 0 && i % 3 != 0) {
                    System.out.print(" " + i + " ");
                } else if (i % 2 != 0) {
                    System.out.print(" * ");
                }   
            }
        }
    }
}
