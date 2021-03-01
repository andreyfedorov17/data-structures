public class MyPriorityQueue {
    private final int maxSize;
    private final long[] queArray;
    private int nItems;

    public MyPriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (int i = nItems - 1; i >= 0; i--) {
                if (item > queArray[i]) {
                    queArray[i + 1] = queArray[i];
                } else {
                    break;
                }
                queArray[i + 1] = item;
                nItems++;
            }
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
