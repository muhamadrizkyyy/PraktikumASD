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

    public int sequentialSearch(double key) {
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == key) {
                return i;
            }
        }
        return -1;
    }

    public void tampilPosisi(double ipk, int idx) {
        if (idx != -2) {
            System.out.println("Mahasiswa dengan ipk " + ipk + " ditemukan pada array index ke - " + idx);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan!");
        }
    }

    public void tampilDataSearch(int idx) {
        if (idx != -2) {
            System.out.println("NIM : " + listMhs[idx].nim);
            System.out.println("Nama : " + listMhs[idx].nama);
            System.out.println("Kelas : " + listMhs[idx].kelas);
            System.out.println("IPK : " + listMhs[idx].ipk);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan!");
        }
    }
}