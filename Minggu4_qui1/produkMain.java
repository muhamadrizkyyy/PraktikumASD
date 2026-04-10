public class produkMain {
    public static void main(String[] args) {
        produk[] listProduk16 = new produk[4];

        listProduk16[0] = new produk("Beras", 75000, 5, 23);
        listProduk16[1] = new produk("Gula", 17000, 5, 58);
        listProduk16[2] = new produk("Roti", 22000, 2, 26);
        listProduk16[3] = new produk("Susu", 12000, 3, 64);

        System.out.println("\n\n-----------------------------------------");
        System.out.println("| Daftar Produk");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < listProduk16.length; i++) {
            System.out.println("| Produk " + (i+1) + " |");
            listProduk16[i].tampilkanInformasi();
            System.out.println("Harga setelah diskon : " + listProduk16[i].hitungHargaDiskon(listProduk16[i].diskon16, listProduk16[i].harga16));
            System.out.println("-----------------------------------------");
        }
    }
}
