public class DatabasePeminjaman {
    Peminjaman dataPinjam[] = new Peminjaman[5];
    Mahasiswa dataMhs[] = new Mahasiswa[3];
    Buku dataBuku[] = new Buku[4];

    public void tampilSemuaBuku() {
        for (Buku buku : dataBuku) {
            buku.tampilBuku();
        }
    }

    public void tampilSemuaMahasiswa() {
        for (Mahasiswa mhs : dataMhs) {
            mhs.tampilMahasiswa();
        }
    }

    public void tampilSemuaPeminjaman() {
        for (Peminjaman pjm : dataPinjam) {
            pjm.tampilPeminjaman();
            System.out.println();
        }
    }

    public void sortByDenda() {
        // for (int k = 0; k < dataPinjam.length; k++) {
        // System.out.print(dataPinjam[k].denda + " ");
        // }
        // System.out.println();

        for (int i = 0; i < dataPinjam.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < dataPinjam.length; j++) {
                // desc
                // denda pada data index yang dibandingkan dengan data yang dimulai dari index
                // i+1
                if (dataPinjam[idx].denda < dataPinjam[j].denda) {
                    idx = j;
                }
            }

            Peminjaman temp = dataPinjam[i];
            dataPinjam[i] = dataPinjam[idx];
            dataPinjam[idx] = temp;

            // // print sorting tiap perubahan
            // for (int k = 0; k < dataPinjam.length; k++) {
            // System.out.print(dataPinjam[k].denda + " ");
            // }
            // System.out.println();
        }

        tampilSemuaPeminjaman();
    }

    public void sortByNIM() {
        // for (int k = 0; k < dataMhs.length; k++) {
        // System.out.print(dataMhs[k].denda + " ");
        // }
        // System.out.println();

        for (int i = 0; i < dataMhs.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < dataMhs.length; j++) {
                // asc
                if (Integer.valueOf(dataMhs[idx].nim) > Integer.valueOf(dataMhs[j].nim)) {
                    idx = j;
                }
            }

            Mahasiswa temp = dataMhs[i];
            dataMhs[i] = dataMhs[idx];
            dataMhs[idx] = temp;

            // // print sorting tiap perubahan
            // for (int k = 0; k < dataMhs.length; k++) {
            // System.out.print(dataMhs[k].denda + " ");
            // }
            // System.out.println();
        }

        // tampilSemuaMahasiswa();
    }

    public void sortByProdi() {
        for (int i = 0; i < dataMhs.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < dataMhs.length; j++) {
                String name_key = dataMhs[j].prodi;
                String name_target = dataMhs[idxmin].prodi;

                if (name_key.compareTo(name_target) < 0) {
                    /*
                     * compareTo() akan membandingkan perabjad.
                     * misalnya : andi vs dina.
                     * andi compareTo dina ---> 'a' apakah < 'c' = FALSE
                     * pengecekan itu akan menghasilkan nilai -2,
                     * hal tersebut diperoleh dari unicode a = 65 , c = 67
                     * so... 65 - 67 = -2.
                     * jika sama maka pengecekan akan berlanjut ke abjad selanjutnya.
                     */
                    idxmin = j;
                }
            }

            Mahasiswa tmpMhs = dataMhs[i];
            dataMhs[i] = dataMhs[idxmin];
            dataMhs[idxmin] = tmpMhs;
        }

        tampilSemuaMahasiswa();
    }

    public void searchByNIM(int start, int end, int keyword) {
        // sorting asc
        sortByNIM();

        if (end >= start) {
            int mean = (start + end) / 2;
            if (Integer.valueOf(dataMhs[mean].nim) == keyword) {
                dataMhs[mean].tampilMahasiswa();
            } else if (Integer.valueOf(dataMhs[mean].nim) < keyword) {
                searchByNIM(mean + 1, end, keyword);
            } else {
                searchByNIM(start, mean - 1, keyword);
            }
        } else {
            System.out.println("data tidak ditemukan!");
        }
    }

    public void searchAllProdi(String keyword) {
        int firstIdx = searchFirstProdi(0, dataMhs.length - 1, keyword);
        System.out.println(firstIdx);

        if (firstIdx == -1) {
            System.out.println("Data tidak ada!");
        }

        int lastIdx = searchLastProdi(0, dataMhs.length - 1, keyword);

        System.out.println(lastIdx);

        for (int i = firstIdx; i <= lastIdx; i++) {
            dataMhs[i].tampilMahasiswa();
        }
    }

    public int searchFirstProdi(int start, int end, String keyword) {
        if (end >= start) {
            int mid = (start + end) / 2;
            int compare = dataMhs[mid].prodi.compareTo(keyword);

            if (compare == 0) {
                //paksa cek kiri dari mid jika sudah sama
                int cekKiri = searchFirstProdi(start, mid - 1, keyword);
                return (cekKiri != -1) ? cekKiri : mid;
            } else if (compare < 0) {
                return searchFirstProdi(start, mid - 1, keyword);
            } else {
                return searchFirstProdi(mid + 1, end, keyword);
            }
        }

        return -1;
    }

    public int searchLastProdi(int start, int end, String keyword) {
        if (end >= start) {
            int mid = (start + end) / 2;
            int compare = dataMhs[mid].prodi.compareTo(keyword);

            if (compare == 0) {
                // paksa cek kana jika mid langsung sama dengan keyword
                int cekKanan = searchLastProdi(mid + 1, end, keyword);
                return (cekKanan != -1) ? cekKanan : mid;
            } else if (compare < 0) {
                return searchLastProdi(mid + 1, end, keyword);
            } else {
                return searchLastProdi(start, mid - 1, keyword);
            }
        }

        return -1;
    }
}
