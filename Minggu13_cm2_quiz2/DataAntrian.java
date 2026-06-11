public class DataAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int counterAntrian = 0;

    public DataAntrian() {
        head = tail = null;
    }

    public boolean isEmpty() {
        if (head != null && tail != null) {
            return false;
        }
        return true;
    }

    public void enqueue(Pelanggan data) {
        NodeAntrian newNd = new NodeAntrian(data, null, null, ++counterAntrian);
        if (isEmpty()) {
            head = newNd;
            tail = newNd;
            System.out.println("Antrean baru " + data.namaPelanggan + " berhasil ditambahkan");
        } else {
            tail.next = newNd;
            newNd.prev = tail;
            tail = newNd;
            System.out.println("Antrean " + data.namaPelanggan + " berhasil ditambahkan");
        }
    }

    public NodeAntrian dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
        } else if (head == tail) {
            NodeAntrian tmp = head;
            head = tail = null;
            return tmp;
        } else {
            head = head.next;
            head.prev = null;
            return head;
        }

        return null;
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
        } else {
            NodeAntrian tmp = head;
            while (tmp != null) {
                System.out.printf("%-10d %-15s %-10s\n", tmp.noAntrian, tmp.data.namaPelanggan, tmp.data.noHp);
                tmp = tmp.next;
            }
        }
    }
}
