public class MahasiswaQueue16 {
    Mahasiswa[] data;
    int front, rear, size, max;

    public MahasiswaQueue16(int size) {
        this.size = 0;
        this.data = new Mahasiswa[size];
        this.max = size;
        this.front = -1;
        this.rear = -1;
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

    public void enqueue(Mahasiswa value) {
        if (isFull()) {
            System.out.println("Antrian sudah full");
            System.exit(0);
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

            data[rear] = value;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa dt = null;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Data paling awal antrian adalah : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].printData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Data paling akhir antrian adalah : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].printData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Data Mahasiswa Pada Antrian ");
            int i = front;
            while (i != rear) {
                data[i].printData();
                System.out.println();
                i = (i + 1) % max;
            }
            data[i].printData();
            System.out.println();
            System.out.println("jumlah data pada antrian adalah : " + size);
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

    public int getJumlahAntrian() {
        return size;
    }
}
