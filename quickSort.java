class QuickSort {
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(arr, low, high);

            // sort each partition recursively
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    //selects last element as pivot, pi using which array is partitioned.
    public static int partition(int arr[], int low, int high) {
        int pi = arr[high];
        int i = (low-1); // smaller element index
        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (arr[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}

