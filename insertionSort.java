class InsertionSort {
    public static void iSort(int array[]){
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void masterInsert(int[] arr){
        iSort(arr);
        System.out.println("List is " + arr.length + " long.");
        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[arr.length-1]);
    }
}
