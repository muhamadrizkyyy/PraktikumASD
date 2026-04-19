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
        }
    }

    public void sortByDenda() {
        // for (int k = 0; k < dataPinjam.length; k++) {
        //     System.out.print(dataPinjam[k].denda + " ");
        // }
        // System.out.println();

        for (int i = 0; i < dataPinjam.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < dataPinjam.length; j++) {
                // desc
                // denda pada data index yang dibandingkan dengan data yang dimulai dari index i+1
                if (dataPinjam[idx].denda < dataPinjam[j].denda) {
                    idx = j;
                }
            }

            Peminjaman temp = dataPinjam[i];
            dataPinjam[i] = dataPinjam[idx];
            dataPinjam[idx] = temp;

            // // print sorting tiap perubahan
            // for (int k = 0; k < dataPinjam.length; k++) {
            //     System.out.print(dataPinjam[k].denda + " ");
            // }
            // System.out.println();
        }

        tampilSemuaPeminjaman();
    }

    public void sortByNIM() {
        // for (int k = 0; k < dataMhs.length; k++) {
        //     System.out.print(dataMhs[k].denda + " ");
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
            //     System.out.print(dataMhs[k].denda + " ");
            // }
            // System.out.println();
        }

        // tampilSemuaMahasiswa();
    }

    public void searchByNIM(int start, int end, int keyword) {
        // sorting asc
        sortByNIM();
        
        if (end >= start) {
            int mean = (start + end) / 2;
            if (Integer.valueOf(dataMhs[mean].nim) == keyword) {
                dataMhs[mean].tampilMahasiswa();
            } else if (Integer.valueOf(dataMhs[mean].nim) < keyword) {
                searchByNIM(mean+1, end, keyword);
            } else {
                searchByNIM(start, mean-1, keyword);
            }    
        } else {
            System.out.println("data tidak ditemukan!");
        }
    }
}
