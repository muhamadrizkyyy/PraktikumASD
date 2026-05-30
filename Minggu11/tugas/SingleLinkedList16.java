public class SingleLinkedList16 {
    Node16 head;
    Node16 tail;
    int size, maxAntrian = 5;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == maxAntrian;
    }

    public void addFirst(Mahasiswa data) {
        Node16 newNode = new Node16(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            System.out.println("New Node has been added as head and tail");
        } else {
            newNode.next = head; // menghubungkan node baru ke node head
            head = newNode; // mengubah head menjadi node baru
            System.out.println("New Node has been added as head");
        }
    }

    public void addLast(Mahasiswa data) {
        Node16 newNode = new Node16(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            System.out.println("New Node has been added as head and tail");
        } else {
            tail.next = newNode; // menghubungkan node pada tail ke node baru
            tail = newNode; // mengubah tail menjadi node baru
            System.out.println("New Node has been added as tail");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty, cannot remove first node");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            System.out.println("First Node has been removed");
        }
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh silahkan tunggu beberapa saat!");
        } else {
            if (isEmpty()) {
                addFirst(data);
                System.out.println("Antrian pertama telah ditambahkan!");
            } else {
                addLast(data);
                System.out.println("Antrian telah ditambahkan!");
            }
            size++;
        }
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa diambil!");
            return null;
        } else {
            Mahasiswa data = head.data;
            removeFirst();
            size--;
            return data;
        }
    }

    public void clearQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus!");
        } else {
            head = null;
            tail = null;
            size = 0;
            System.out.println("Antrian telah dikosongkan!");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa ditampilkan!");
        } else {
            System.out.println("Antrian pertama : ");
            head.data.tampilInformasi();
        }
    }

    public void peekLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa ditampilkan!");
        } else {
            System.out.println("Antrian terakhir : ");
            tail.data.tampilInformasi();
        }
    }

    public int getSize() {
        return size;
    }

}
