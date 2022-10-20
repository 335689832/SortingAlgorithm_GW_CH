import java.util.Scanner;
import java.util.Random;


class SortingAlgorithm_GW_CH{
    public static int[] randomArray(int num){
        Random rand = new Random();

        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(Integer.MAX_VALUE);
            // Error on this?
            // Figure it out at some point(not urgent)
        }

        return arr;
    }

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

    //routine to sort the array partitions recursively
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(arr, low, high);

            // sort each partition recursively
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void sInsertSort(){
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int num = sc3.nextInt();

        int[] arr = randomArray(num);
        long start = System.currentTimeMillis();
        iSort(arr);

        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[num-1]);

        long finish = System.currentTimeMillis();
        System.out.println("start:" + start + " finish:" + finish);
        System.out.println("Sorting took " + (finish-start) + " milliseconds.");

        sc3.close();
    }

    public static void sQuickSort(){
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int num = sc2.nextInt();

        int[] arr = randomArray(num);
        long start = System.currentTimeMillis();
        quickSort(arr, 0, num-1);

        System.out.println("The smallest value is " + arr[0]);
        System.out.println("The largest value is " + arr[num-1]);

        long finish = System.currentTimeMillis();
        System.out.println("start:" + start + " finish:" + finish);
        System.out.println("Sorting took " + (finish-start) + " milliseconds.");

        sc2.close();
    }

    public static void main(String[] args){
        MergeSort sMergeSort = new MergeSort();
        SelectionSort sSelectionSort = new SelectionSort();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Добро пожаловать в сортировочную машину");
        System.out.print("Enter the sorting algorithm would you like to use (selection, insertion, merge, quick): ");
        String s = sc1.nextLine();

        if(s.toLowerCase().equals("selection")){
            System.out.print("Enter array size: ");
            int selecLen = sc1.nextInt();
            long begin = System.currentTimeMillis();
            sSelectionSort.main(args, randomArray(selecLen));
            // Minor error to understand
            long finish = System.currentTimeMillis();
            System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        }
        else if(s.toLowerCase().equals("insertion")){
            sInsertSort();
        }
        else if(s.toLowerCase().equals("merge")){
            System.out.print("Enter array size: ");
            int mergeLen = sc1.nextInt();
            long begin = System.currentTimeMillis();
            sMergeSort.main(args, randomArray(mergeLen));
            // Minor error to understand
            long finish = System.currentTimeMillis();
            System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        }
        else if(s.toLowerCase().equals("quick")){
            sQuickSort();
        }
        else{
            System.out.println("Please enter a valid selection.");
        }

        sc1.close();
    }
}
