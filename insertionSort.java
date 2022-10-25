class InsertionSort {
    public static void iSort(int array[]){
        int n = array.length;

        //Run for each entry in the array
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while ( (j > -1) && ( array [j] > key ) ) {
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void masterInsert(int[] arr){
        iSort(arr);
        System.out.println("You are sorting " + arr.length + " values.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}
