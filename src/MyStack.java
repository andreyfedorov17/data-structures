public class MyStack {
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long elem) {
        stackArray[++top] = elem;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public char peekN(int n) {
        return ((char) stackArray[n]);
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void displayStack(String str) {
        System.out.print(str);
        System.out.print("stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}