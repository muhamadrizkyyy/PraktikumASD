public class queue16 {
    int[] data;
    int front, rear, size, max;

    public queue16(int size) {
        this.size = 0;
        this.data = new int[size];
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

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue sudah full");
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

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue kosong!");
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
            System.out.println("Data paling awal queue adalah : " + data[front]);
        } else {
            System.out.println("Queue kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            System.out.println("Data pada queue adalah : ");
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.print(data[i] + " ");
            System.out.println();
            System.out.println("jumlah data pada queue adalah : " + size);
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            front = -1;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!");
        }
    }
}
