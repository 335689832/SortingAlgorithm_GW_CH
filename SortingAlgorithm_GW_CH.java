import java.util.Scanner;
import java.util.Random;


class SortingAlgorithm_GW_CH{
    public static int[] randomArray(int num){
        Random rand = new Random();

        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(Integer.MAX_VALUE);
        }
        return arr;
    }

    public static void mergeSort(int[] arr){
        MergeSort sMergeSort = new MergeSort();

        long begin = System.currentTimeMillis();
        sMergeSort.MasterMerge(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        System.out.println();
    }

    public static void selectSort(int[] arr){
        SelectionSort sSelectionSort = new SelectionSort();

        long begin = System.currentTimeMillis();
        sSelectionSort.MasterSelect(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        System.out.println();
    }

    public static void insertSort(int[] arr){
        InsertionSort sInsertionSort = new InsertionSort();

        long begin = System.currentTimeMillis();
        sInsertionSort.masterInsert(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        System.out.println();
    }

    public static void quickSort(int[] arr){
        QuickSort sQuickSort = new QuickSort();

        long begin = System.currentTimeMillis();
        sQuickSort.masterQuick(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в сортировочную машину");
        System.out.print("Enter the sorting algorithm would you like to use (selection, insertion, merge, quick): ");
        String s = sc.nextLine();
        System.out.print("Enter array size: ");
        int len = sc.nextInt();

        if(s.toLowerCase().equals("selection")){
            if(len == -1){
                int c = 10000;
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                selectSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                selectSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                selectSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                selectSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                selectSort(arr5);
            }
            else{
                int[] arr = randomArray(len);
                selectSort(arr);
            }
        }
        else if(s.toLowerCase().equals("insertion")){
            if(len == -1){
                int c = 10000;
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                insertSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                insertSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                insertSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                insertSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                insertSort(arr5);
            }
            else{
                int[] arr = randomArray(len);
                insertSort(arr);
            }
        }
        else if(s.toLowerCase().equals("merge")){
            if(len == -1){
                int c = 10000;
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                mergeSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                mergeSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                mergeSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                mergeSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                mergeSort(arr5);
            }
            else{
                int[] arr = randomArray(len);
                mergeSort(arr);
            }
        }
        else if(s.toLowerCase().equals("quick")){
            if(len == -1){
                int c = 10000;
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                quickSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                quickSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                quickSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                quickSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                quickSort(arr5);
            }
            else{
                int[] arr = randomArray(len);
                quickSort(arr);
            }
        }
        else{
            System.out.println("Please enter a valid selection.");
        }

        sc.close();
    }
}
