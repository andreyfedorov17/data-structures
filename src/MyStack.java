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

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}