public class DataPesanan {
    NodePesanan head;
    NodePesanan tail;

    public DataPesanan() {
        head = tail = null;
    }

    public boolean isEmpty() {
        if (head != null && tail != null) {
            return false;
        }
        return true;
    }

    public void addData(Pelanggan p,Pesanan data) {
        NodePesanan newNd = new NodePesanan(data, null, null);
        if (isEmpty()) {
            head = tail = newNd;
            System.out.println(p.namaPelanggan + " telah memesan " + data.namaPesanan);
        } else {
            tail.next = newNd;
            newNd.prev = tail;
            tail = newNd;
            System.out.println(p.namaPelanggan + " telah memesan " + data.namaPesanan);
        }
    }

    public void printPesanan() {
        if (isEmpty()) {
            System.out.println("Tidak ada pesanan");
        } else {
            System.out.printf("%-12s %-25s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Nomor HP");
            NodePesanan temp2 = head;
            while (temp2 != null) {
                temp2.data.printDataPesanan();
                temp2 = temp2.next;
            }
            System.out.println("(sebelum)");
            System.out.println();
            System.out.println("(sesudah)");
            insertionSort();
            NodePesanan temp = head;
            System.out.printf("%-12s %-25s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Nomor HP");
            while (temp != null) {
                temp.data.printDataPesanan();
                temp = temp.next;
            }
        }
    }

    private void insertionSort() {
        if (isEmpty()) return;

        NodePesanan current = head.next; // Mulai dari elemen kedua

        while (current != null) {
            NodePesanan nextNode = current.next; // Amankan node berikutnya
            NodePesanan search = current.prev;

            if (nextNode == null) {
                tail = search;
            }

            int compare = current.data.namaPesanan.compareTo(search.data.namaPesanan);
            // Berjalan mundur selama nomor antrean lebih besar dari current (REVERSE TRANVERSAL)
            while (search != null && compare < 0) {
                search = search.prev;
            }

            // Jika posisi current sudah benar, tidak perlu dipindahkan
            if (search == current.prev) {
                current = nextNode;
                continue;
            }

            // --- PROSES MANIPULASI POINTER (Mencabut dan Menjahit Ulang) ---
            
            // 1. Cabut 'current' dari posisi lamanya
            current.prev.next = current.next;

            if (current.next != null) {
                current.next.prev = current.prev;
            }

            // 2. Jahit 'current' ke posisi barunya (setelah node 'search')
            if (search == null) {
                // Kasus: Disisipkan di paling depan (menjadi Head baru)
                current.next = head;
                current.prev = null;
                head.prev = current;
                head = current;
            } else {
                // Kasus: Disisipkan di tengah atau di akhir list
                current.next = search.next;
                current.prev = search;
                if (search.next != null) {
                    search.next.prev = current;
                }
                search.next = current;
            }

            current = nextNode; // Maju ke elemen yang diamankan tadi
        }
    }
}
