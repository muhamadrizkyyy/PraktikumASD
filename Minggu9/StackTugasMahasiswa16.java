public class StackTugasMahasiswa16 {
    Mahasiswa16[] stack;
    int top, size;

    public StackTugasMahasiswa16() {

    }

    public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa16 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public Mahasiswa16 pop() {
        if (!isEmpty()) {
            Mahasiswa16 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    //method untuk cek nilai teratas
    public Mahasiswa16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + " " + stack[i].nim + " " + stack[i].kelas);
            }
        } else {
            System.out.println("Stack Kosong");
        }
    }
}
