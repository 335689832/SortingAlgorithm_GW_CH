class QuickSort {
    /**
     * Recursively run until array is fully sorted
     * @param arr array to be sorted
     * @param low lowest index
     * @param high highest index
     */
    public static void quickSort(int arr[], int low, int high) {
        //base case
        if (low >= high) {
            return;
        }
        //get pivot
        int pi = partition(arr, low, high);

        //recursively use methods split according to pivot
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }

    /**
     * Return the pivot after sorting the array into proper halves
     * @param arr the array being sorted
     * @param low lowest index
     * @param high highest index
     * @return the pivot
     */
    public static int partition(int arr[], int low, int high){
        //set up pivot and partitions
        int pivot = arr[high];

        int lp = low;
        int rp = high;

        //loop until left partition is the same as right partition
        while(lp < rp){
            /*
            move the left partition forward in the array as 
            long as the left partition is smaller than the pivot
            and the two partitions don't cross
            */
            while(arr[lp] <= pivot && lp < rp){
                lp++;
            }

            /*
            move the right partition back in the array as 
            long as the right partition is greater than the pivot
            and the two partitions don't cross
            */
            while(arr[rp] >= pivot && lp<rp){
                rp--;
            }
            //switch both partitions 
            swap(arr,lp,rp);
        }
        //switch left partition and pivot
        swap(arr, lp, high);

        //return new pivot location 
        return lp;
    }

    /**
     * swap the two index values for the array specified
     * @param arr the array to reference
     * @param index1 the first index to swap
     * @param index2 the second index to swap
     */
    public static void swap(int[] arr, int index1, int index2){
        //store the first index value in a temporary array
        int temp = arr[index1];
        //set the second index value equal to first index
        arr[index1] = arr[index2];
        //set second index equal to first index value
        arr[index2] = temp;
    }

    /**
     * Run the method, print array size, the smallest value, and largest value
     * @param arr
     */
    public static void masterQuick(int[] arr){
        quickSort(arr, 0, arr.length-1);
        System.out.println("You are sorting " + arr.length + " values.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}

