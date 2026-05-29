public class AntrianKRS {
    Mahasiswa16[] antrian;
    int front, rear, size, max, sizeMhs;
    Mahasiswa16[] datamhs = new Mahasiswa16[30];

    public AntrianKRS(int max) {
        this.size = 0;
        this.antrian = new Mahasiswa16[max];
        this.max = max;
        this.front = -1;
        this.rear = -1;

        sizeMhs = 0;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Mahasiswa16 value) {
        if (isFull()) {
            System.out.println("Antrian sudah full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            antrian[rear] = value;
            antrian[rear].statusKRS = true;
            size++;
        }
    }

    public Mahasiswa16[] dequeue() {
        int s = 2;
        if (getSize() < 2) {
            s = getSize();
        }
        Mahasiswa16[] dt = new Mahasiswa16[s];
        if (!isEmpty()) {
            if (front == max - 1) {
                front = 0;
            }
            int idx = front;
            for (int i = 0; i < dt.length; i++) {
                dt[i] = antrian[idx];
                size--;
                front++;
                idx++;
            }

            // cari data mhs terdaftar yang belum pengajuan
            for (Mahasiswa16 dtm : datamhs) {
                if (dtm != null) {
                    if (!dtm.statusKRS && !isFull()) {
                        // masukkan ke antrian
                        enqueue(dtm);
                    }
                }
            }
        } else {
            System.out.println("Antrian kosong!");
        }

        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Data Antrian Terdepan");
            antrian[front].printData();
            if (!(getSize() < 2)) {
                antrian[front + 1].printData();
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Data Antrian Terbelakang");
            antrian[rear].printData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Data pada antrian");
            System.out.println("NIM - NAMA - PRODI - KELAS - STATUS KRS");
            int i = front;
            while (i != rear) {
                antrian[i].printData();
                i = (i + 1) % max;
            }
            antrian[i].printData();
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            front = -1;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        }
    }

    public int getSize() {
        return size;
    }

    // kelola data mahasiswa
    public void registration(Mahasiswa16 mhs) {
        datamhs[sizeMhs] = mhs;
        sizeMhs++;

        enqueue(mhs);
        if (isFull()) {
            System.out.println("Silahkan tunggu di antrian berikutnya");
        }
    }

    public int getMHSRegistered() {
        int n = 0;
        for (Mahasiswa16 dt : datamhs) {
            if (dt != null) {
                if (dt.statusKRS) {
                    n++;
                }
            }
        }
        return n;
    }

    public int getMHSUnregistered() {
        int n = 0;
        for (Mahasiswa16 dt : datamhs) {
            if (dt != null) {
                if (!dt.statusKRS) {
                    n++;
                }
            }
        }
        return n;
    }
}
