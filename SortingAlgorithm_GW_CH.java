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

    // public static void sQuickSort(){

    //     Scanner sc2 = new Scanner(System.in);

    //     System.out.print("Enter array size: ");
    //     int num = sc2.nextInt();

    //     int[] arr = randomArray(num);
    //     long start = System.currentTimeMillis();
    //     quickSort(arr, 0, num-1);

    //     System.out.println("The smallest value is " + arr[0]);
    //     System.out.println("The largest value is " + arr[num-1]);

    //     long finish = System.currentTimeMillis();
    //     System.out.println("start:" + start + " finish:" + finish);
    //     System.out.println("Sorting took " + (finish-start) + " milliseconds.");

    //     sc2.close();
    // }

    public static void main(String[] args){
        MergeSort sMergeSort = new MergeSort();
        SelectionSort sSelectionSort = new SelectionSort();
        QuickSort sQuickSort = new QuickSort();
        InsertionSort sInsertionSort = new InsertionSort();
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
            // Needs class import

            // sInsertSort();
            System.out.print("Enter array size: ");
            int selecLen = sc1.nextInt();
            long begin = System.currentTimeMillis();
            sInsertionSort.iSort(randomArray(selecLen));
            // Minor error to understand
            long finish = System.currentTimeMillis();
            System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
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
            // sQuickSort();
            System.out.print("Enter array size: ");
            int selecLen = sc1.nextInt();
            long begin = System.currentTimeMillis();
            sQuickSort.quickSort(randomArray(selecLen), 0, selecLen - 1);
            // Minor error to understand
            long finish = System.currentTimeMillis();
            System.out.println("Sorting took " + (finish - begin) + " milliseconds.");
        }
        else{
            System.out.println("Please enter a valid selection.");
        }

        sc1.close();
    }
}
