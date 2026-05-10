public class StackSurat16 {
    Surat16[] stack;
    int top , size;

    public StackSurat16() {
        
    }

    public StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
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

    public void push(Surat16 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 data_surat = stack[top];
            top--;
            return data_surat;
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    //method untuk cek nilai teratas
    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public Surat16 findData(String nama) {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMhs.equals(nama)) {
                    return stack[i];
                }
            }
            return null;
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }
}
