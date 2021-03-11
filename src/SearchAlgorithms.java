public class SearchAlgorithms {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

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

    public static int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int middle = (low + high) / 2;

            if (key > arr[middle]) {
                return recursiveBinarySearch(arr, key, middle + 1, high);
            } else if (key < arr[middle]) {
                return recursiveBinarySearch(arr, key, low, middle - 1);
            } else {
                return middle;
            }
        }
        return -1;
    }
}