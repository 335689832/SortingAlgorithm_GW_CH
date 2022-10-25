class QuickSort {
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int lp = low;
        int rp = high;

        while(lp < rp){
            while(arr[lp] <= pivot && lp < rp){
                lp++;
            }

            while(arr[rp] >= pivot && lp<rp){
                rp--;
            }
            swap(arr,lp,rp);
        }
        swap(arr, lp, high);

        return lp;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // //selects last element as pivot, pi using which array is partitioned.
    // public static int partition(int arr[], int low, int high) {
    //     int pi = arr[high];
    //     int i = (low-1); // smaller element index
    //     for (int j=low; j<high; j++) {
    //         // check if current element is less than or equal to pi
    //         if (arr[j] <= pi) {
    //             i++;
    //             // swap intArray[i] and intArray[j]
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }

    //     // swap intArray[i+1] and intArray[high] (or pi)
    //     int temp = arr[i+1];
    //     arr[i+1] = arr[high];
    //     arr[high] = temp;

    //     return i+1;
    // }

    public static void masterQuick(int[] arr){
        quickSort(arr, 0, arr.length-1);
        System.out.println("You are sorting " + arr.length + " values.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}

