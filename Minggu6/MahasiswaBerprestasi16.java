public class MahasiswaBerprestasi16 {
    Mahasiswa16[] listMhs = new Mahasiswa16[5];
    int idx;

    void tambah(Mahasiswa16 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa16 mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println("=======================================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            // System.out.println("iterasi ke-" + i);
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j - 1].ipk < listMhs[j].ipk) {
                    Mahasiswa16 tmp = listMhs[j - 1];
                    listMhs[j - 1] = listMhs[j];
                    listMhs[j] = tmp;
                }
                // for (Mahasiswa16 mahasiswa16 : listMhs) {
                // mahasiswa16.tampilIPK();
                // }
                // System.out.println();
            }
        }
    }

    void selectionSort() {
        // for (int k = 0; k < listMhs.length; k++) {
        // System.out.print(listMhs[k].ipk + " ");
        // }
        // System.out.println();

        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }

            Mahasiswa16 mhsTmp = listMhs[i];
            listMhs[i] = listMhs[idxmin];
            listMhs[idxmin] = mhsTmp;

            // // print sorting tiap perubahan
            // for (int k = 0; k < listMhs.length; k++) {
            // System.out.print(listMhs[k].ipk + " ");
            // }
            // System.out.println();
        }
    }

    void insertionSort() {
        // for (int k = 0; k < listMhs.length; k++) {
        //     System.out.print(listMhs[k].ipk + " ");
        // }
        // System.out.println();

        for (int i = 1; i < listMhs.length - 1; i++) {
            Mahasiswa16 mhstmp = listMhs[i];
            int j = i - 1;
            while (j > -1 && listMhs[j].ipk < mhstmp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }

            listMhs[j + 1] = mhstmp;
        }
    }
}