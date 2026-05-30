public class SingleLinkedList16 {
    Node16 head;
    Node16 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node16 temp = head;
            System.out.println("Isi dari Linked List");
            System.out.println("-------------------------------------");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void addFirst(Mahasiswa16 data) {
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

    public void addLast(Mahasiswa16 data) {
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

    public void insertAfter(Mahasiswa16 data, String key) {
        Node16 newNode = new Node16(data, null);
        Node16 keyNode, nextKeyNode;
        Node16 temp = head;

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            System.out.println("New Node has been added as head and tail");
        } else {
            // proses tranverse mencari data sesuai key
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key)) {
                    keyNode = temp; // ambil node yang memiliki key
                    nextKeyNode = keyNode.next; // ambil node selanjutnya dari node yang memiliki key
                    newNode.next = nextKeyNode; // menghubungkan node baru ke node selanjutnya dari node yang memiliki
                                                // key
                    keyNode.next = newNode; // menghubungkan node yang memiliki key ke node baru

                    // pengecekan apabila newNode ditambahkan di posisi terakhir maka tail akan
                    // berubah
                    if (newNode.next == null) {
                        tail = newNode;
                    }
                    System.out.println("New Node has been added after node.data.name with key : " + key);
                    break;
                }
                if (temp.next == null) {
                    System.out.println("key not found! New Node has not been added");
                }
                temp = temp.next;
            }
        }
    }

    public void insertAt(Mahasiswa16 data, int index) {
        if (index < 0) {
            System.out.println("incorrect index!");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node16 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp.next == null) {
                    System.out.println("index melebihi batas linked list, index terakhir : " + i);
                    index = i+1;
                    break;
                }
                temp = temp.next;
            }
            Node16 newNode = new Node16(data, temp.next);
            temp.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }

            System.out.println("New Node has been added at index : " + index);
        }
    }

}
