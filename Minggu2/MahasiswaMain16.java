public class MahasiswaMain16 {
    public static void main(String[] args) {
        Mahasiswa16 mhs1 = new Mahasiswa16("Muhamad Rizky Hamdani", "254107020027", "TI-1C", 3.5);
        mhs1.nama = "Muhamad Rizky Hamdani";
        mhs1.nim = "254107020027";
        mhs1.kelas = "TI-1C";
        mhs1.ipk = 3.5;

        mhs1.tampilkaninformasi();
        mhs1.ubahKelas("TI-1D");
        mhs1.updateipk(3.8);
        mhs1.tampilkaninformasi();

        Mahasiswa16 mhs2 = new Mahasiswa16("Andini Juliani", "254107020089", "TI-1F", 3.6);
        mhs2.updateipk(3.65);
        mhs2.tampilkaninformasi();
    }
}
