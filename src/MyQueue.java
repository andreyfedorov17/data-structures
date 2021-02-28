public class MyQueue {
    private final int maxSize;
    private final long[] queArray;
    private int front;
    private int rear;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize + 1;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long elem) {
        if (rear == maxSize - 1) {
            rear = -1;
            queArray[++rear] = elem;
        }
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return (maxSize - 1) + (rear + 1);
        }
    }
}
