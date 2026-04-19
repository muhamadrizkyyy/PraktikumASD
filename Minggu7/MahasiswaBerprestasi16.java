public class MahasiswaBerprestasi16 {
    Mahasiswa16[] listMhs;
    int idx;

    public MahasiswaBerprestasi16() {

    }

    public MahasiswaBerprestasi16(int jmlMhs) {
        listMhs = new Mahasiswa16[jmlMhs];
    }

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

    public void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[idxMax].ipk) {
                    idxMax = j;
                }
            }
            Mahasiswa16 tmp = listMhs[i];
            listMhs[i] = listMhs[idxMax];
            listMhs[idxMax] = tmp;
        }
    }

    public int sequentialSearch(double key) {
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == key) {
                return i;
            }
        }
        return -1;
    }

    public void tampilPosisi(double ipk, int idx) {
        if (idx != -1) {
            System.out.println("Mahasiswa dengan ipk " + ipk + " ditemukan pada array index ke - " + idx);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan!");
        }
    }

    public int findByBinarySearch(int start, int end, double key) {
        System.out.println();
        if (end >= start) {
            int mid = (start + end) / 2;
            if (listMhs[mid].ipk == key) {
                return mid;
            } else if (key > listMhs[mid].ipk) {
                return findByBinarySearch(start, mid - 1, key);
            } else {
                return findByBinarySearch(mid + 1, end, key);
            }
        }
        return -1;
    }

    public void tampilDataSearch(int idx) {
        if (idx != -1) {
            System.out.println("NIM : " + listMhs[idx].nim);
            System.out.println("Nama : " + listMhs[idx].nama);
            System.out.println("Kelas : " + listMhs[idx].kelas);
            System.out.println("IPK : " + listMhs[idx].ipk);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan!");
        }
    }
}