public class StackKonversi16 {
    int[] stack;
    int top, size;

    public StackKonversi16() {
        this.size = 32;
        stack = new int[size];
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

    public void push(int nilai) {
        if (!isFull()) {
            top++;
            stack[top] = nilai;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int nilai_biner = stack[top];
            top--;
            return nilai_biner;
        } else {
            System.out.println("Stack Kosong");
            return 0;
        }
    }

    //method untuk cek nilai teratas
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong");
            return 0;
        }
    }

}
