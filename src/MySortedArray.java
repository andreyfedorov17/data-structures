public class MySortedArray {
    private long[] arr;
    private int nElems;

    public MySortedArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int find(int key) {
        int low = 0;
        int high = nElems - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (key > arr[middle]) {
                low = middle + 1;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] > value) {
                break;
            }
        }

        for (int j = nElems; j > i; j--) {
            arr[j + 1] = arr[j];
        }

        arr[i] = value;
        nElems++;
    }

    public boolean delete(int key) {
        int deletedItem = find(key);

        if (deletedItem != -1) {
            for (int i = deletedItem; i < nElems; i++) {
                arr[i] = arr[i + 1];
            }
            nElems--;
            return true;
        } else {
            return false;
        }
    }
}
