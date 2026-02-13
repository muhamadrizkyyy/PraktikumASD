public class praktikum4 {
    public static final int[][] stockBunga = {
        {10, 5, 15, 7}, 
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };

    public static void totalPendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int total = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                if (j == 0) {
                    //aglonema
                    total += (stockBunga[i][j]*75000);
                } else if (j == 1) {
                    //keladi
                    total += (stockBunga[i][j]*50000);
                } else if (j == 2) {
                    //Alocasia
                    total += (stockBunga[i][j]*60000);
                } else {
                    //Mawar
                    total += (stockBunga[i][j]*10000);
                }
            }
            System.out.print("Total pendapatan cabang ke-" + (i + 1) + ": " + total);
            if (total > 1500000) {
                System.out.print(" (Status : Sangat Baik)");
            } else {
                System.out.print(" (Status : Perlu Evaluasi)");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\n========== PROGRAM MENGHITUNG PENDAPATAN CABANG TOKO ==========");
        System.out.println("==================================================");
        totalPendapatanPerCabang();
        System.out.println("==================================================\n");
    }
}
