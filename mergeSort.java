class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    /**
     * Find the size of both halves of the array
     * Copy each half to a temporary array
     * Merge the temporary arrays in ascending order
     * @param arr an array to split into subarrays then merge
     * @param l the left side of the array
     * @param m the middle value of the array
     * @param r the right side of the array
     */
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    /**
     * Finds the middle point, then runs itself recursively until each element is by itelf,
     * then merges them back together in ascending order
     * @param arr an array to sort
     * @param l the left side of the array
     * @param r the right side of the array
     */
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Driver code
    /**
     * Main method that runs the applicable code
     * @param arr
     */
    public static void MasterMerge(int[] arr)
    {
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("You are sorting " + arr.length + " values.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}
