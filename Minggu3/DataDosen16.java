public class DataDosen16 {
    public void dataSemuaDosen(Dosen16[] arrDosen) {
        int x = 1;
        for (Dosen16 dosen16 : arrDosen) {
            System.out.println("Data Dosen ke-" + (x++));
            System.out.println("Kode: " + dosen16.kode);
            System.out.println("Nama: " + dosen16.nama);
            System.out.println("Jenis Kelamin: " + (dosen16.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia: " + dosen16.usia);
            System.out.println("---------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen16[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen16 dosen16 : arrDosen) {
            if (dosen16.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (Dosen16 dosen16 : arrDosen) {
            if (dosen16.jenisKelamin) {
                jumlahPria++;
                totalUsiaPria += dosen16.usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += dosen16.usia;
            }
        }

        System.out.println("Rerata Usia Dosen Pria: " + (jumlahPria == 0 ? 0 : (double) totalUsiaPria / jumlahPria));
        System.out.println("Rerata Usia Dosen Wanita: " + (jumlahWanita == 0 ? 0 : (double) totalUsiaWanita / jumlahWanita));
    }

    public void infoDosenPalingTua(Dosen16[] arrDosen) {
        int maxUsia = 0;
        Dosen16 dosenPalingTua = null;
        for (Dosen16 dosen16 : arrDosen) {
            if (dosen16.usia > maxUsia) {
                maxUsia = dosen16.usia;
                dosenPalingTua = dosen16;
            }
        }

        System.out.println("Dosen Paling Tua: " + dosenPalingTua.nama);
    }

    public void infoDosenPalingMuda(Dosen16[] arrDosen) {
        int minUsia = 100;
        Dosen16 dosenTermuda = null;
        for (Dosen16 dosen16 : arrDosen) {
            if (dosen16.usia < minUsia) {
                minUsia = dosen16.usia;
                dosenTermuda = dosen16;
            }
        }

        System.out.println("Dosen Paling Muda: " + dosenTermuda.nama);
    }
}
