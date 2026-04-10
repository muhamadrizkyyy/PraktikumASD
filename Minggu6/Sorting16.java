public class Sorting16 {
    int[] data;
    int jumData;

    Sorting16(int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            System.out.println("iterasi ke-" + i);
            for (int j = 1; j <= jumData - 1; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }

                // print sorting tiap perubahan
                // for (int k = 0; k < data.length; k++) {
                // System.out.print(data[k] + " ");
                // }
                // System.out.println();
            }
        }
    }

    public void selectionsort() {
        for (int i = 0; i < jumData - 1; i++) {
            // System.out.println("iterasi ke-" + i);
            int min = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
                // System.out.println(min);
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;

            // print sorting tiap perubahan
            // for (int k = 0; k < data.length; k++) {
            // System.out.print(data[k] + " ");
            // }
            // System.out.println();
        }
    }

    public void insertionsort() {
        for (int i = 1; i <= jumData - 1; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;

            }
            // System.out.println(j);
            data[j + 1] = temp;

            // // print sorting tiap perubahan
            // for (int k = 0; k < data.length; k++) {
            // System.out.print(data[k] + " ");
            // }
            // System.out.println();
        }
    }

    public void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}