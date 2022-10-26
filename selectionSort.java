class SelectionSort
{
    /**
     * Uses a for loop to move through each element of arr
     * At each element, it uses a for loop to check if there is a lower value in the array
     * If a lower value is found, it switches the spots of the two values
     * @param arr the array needing to be sorted
     */
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Driver code to test above
    /**
     * Main method that runs the applicable code
     * @param arr
     */
    public static void MasterSelect(int arr[])
    {
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        System.out.println("You are sorting " + arr.length + " values.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}
