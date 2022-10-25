import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.IOException;


class SortingAlgorithm_GW_CH{
    /**
     * Creates an array of random integers
     * @param num the length of the array
     * @return the random array
     */
    public static int[] randomArray(int num){
        Random rand = new Random();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(Integer.MAX_VALUE);
        }
        return arr;
    }
    /**
     * Runs the MasterMerge method from the MergeSort class and counts the amount of time
     * needed to finish sorting
     * @param arr the array to be sorted
     * @return the time it took to finish(in milliseconds)
     */
    public static int mergeSort(int[] arr){
        MergeSort sMergeSort = new MergeSort();

        long begin = System.currentTimeMillis();
        sMergeSort.MasterMerge(arr);
        long finish = System.currentTimeMillis();
        Long time = finish - begin;
        int doneTime = time.intValue();
        System.out.println("Sorting took " + (time) + " milliseconds.");
        System.out.println();
        return doneTime;
    }
    /**
     * Runs the MasterSelect method from the SelectionSort class and counts the amount of time
     * needed to finish sorting
     * @param arr the array to be sorted
     * @return the time it took to finish(in milliseconds)
     */
    public static int selectSort(int[] arr){
        SelectionSort sSelectionSort = new SelectionSort();

        long begin = System.currentTimeMillis();
        sSelectionSort.MasterSelect(arr);
        long finish = System.currentTimeMillis();
        Long time = finish - begin;
        int doneTime = time.intValue();
        System.out.println("Sorting took " + (time) + " milliseconds.");
        System.out.println();
        return doneTime;
    }
    /**
     * Runs the masterInsert method from the InsertionSort class and counts the amount of time
     * needed to finish sorting
     * @param arr the array to be sorted
     * @return the time it took to finish(in milliseconds)
     */
    public static int insertSort(int[] arr){
        InsertionSort sInsertionSort = new InsertionSort();

        long begin = System.currentTimeMillis();
        sInsertionSort.masterInsert(arr);
        long finish = System.currentTimeMillis();
        Long time = finish - begin;
        int doneTime = time.intValue();
        System.out.println("Sorting took " + (time) + " milliseconds.");
        System.out.println();
        return doneTime;
    }
    /**
     * Runs the masterQuick method from the QuickSort class and counts the amount of time
     * needed to finish sorting
     * @param arr the array to be sorted
     * @return the time it took to finish(in milliseconds)
     */
    public static int quickSort(int[] arr){
        QuickSort sQuickSort = new QuickSort();

        long begin = System.currentTimeMillis();
        sQuickSort.masterQuick(arr);
        long finish = System.currentTimeMillis();
        Long time = finish - begin;
        int doneTime = time.intValue();
        System.out.println("Sorting took " + (time) + " milliseconds.");
        System.out.println();
        return doneTime;
    }
    /**
     * Calls the runCode void method which will:
     * - Ask the user which sorting algorithm they want to use
     * - Ask the user for a size for their array
     * - Get a random array from the randomArray method
     * - Run the appropriate sorting algorithm on the random array
     * - Print the amount of time taken to sort, as well as highest and lowest values
     * - Use the putInCsv method to print pre-planned data results into a separate csv file named by the user
     * @param args
     */
    public static void main(String[] args){
        runCode();
    }
    /**
     * - Ask the user which sorting algorithm they want to use
     * - Ask the user for a size for their array
     * - Get a random array from the randomArray method
     * - Run the appropriate sorting algorithm on the random array
     * - Print the amount of time taken to sort, as well as highest and lowest values
     * - Create a 2D array with pre-planned numbers of values in the first column, and their time to complete in the second
     * - Use the putInCsv method to print the 2D array into a separate csv file named by the user
     */
    private static void runCode() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Sorting Machine");
        System.out.print("Enter the sorting algorithm would you like to use (selection, insertion, merge, quick): ");
        String s = sc.nextLine();
        System.out.print("Enter array size: ");
        String lenString = sc.nextLine();
        int len = Integer.valueOf(lenString);
        int[][] lastThing = new int[5][2];

        if(s.toLowerCase().equals("selection")){
            if(len == -1){
                int c = 10000;
                for(int i = 0; i <= 4; i++){
                    lastThing[i][0] = c;
                    lastThing[i][1] = selectSort(randomArray(c));
                    c = c*2;
                }

                System.out.println("Enter the name of your file: ");
                String name = sc.nextLine();
                putInCsv(name, lastThing);
            }
            else{
                int[] arr = randomArray(len);
                selectSort(arr);
            }
        }
        else if(s.toLowerCase().equals("insertion")){
            if(len == -1){
                int c = 10000;
                for(int i = 0; i <= 4; i++){
                    int[] arr = randomArray(c);
                    lastThing[i][0] = c;
                    lastThing[i][1] = insertSort(arr);
                    c = c*2;
                }

                System.out.println("Enter the name of your file: ");
                String name = sc.nextLine();
                putInCsv(name, lastThing);
            }
            else{
                int[] arr = randomArray(len);
                insertSort(arr);
            }
        }
        else if(s.toLowerCase().equals("merge")){
            if(len == -1){
                int c = 10000;
                for(int i = 0; i <= 4; i++){
                    lastThing[i][0] = c;
                    lastThing[i][1] = mergeSort(randomArray(c));
                    c = c*2;
                }

                System.out.println("Enter the name of your file: ");
                String name = sc.nextLine();
                putInCsv(name, lastThing);
            }
            else{
                int[] arr = randomArray(len);
                mergeSort(arr);
            }
        }
        else if(s.toLowerCase().equals("quick")){
            if(len == -1){
                int c = 10000;
                for(int i = 0; i <= 4; i++){
                    lastThing[i][0] = c;
                    lastThing[i][1] = quickSort(randomArray(c));
                    c = c*2;
                }

                System.out.println("Enter the name of your file: ");
                String name = sc.nextLine();
                putInCsv(name, lastThing);
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
    /**
     * Initializes a new file give name
     * Loops through a 2D array given by the user and prints the values by row, separated by commas
     * @param name the name for the file to be created
     * @param data the 2D array of data to be written into the file
     */
    public static void putInCsv(String name, int[][] data){
        try {
            // Initialize new file
            File myObj = new File(name);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter writer = new FileWriter(name);
                // Loop through both axis of the array and write each section into the file
                // Separate j values with commas and i values with new lines
                for (int i = 0; i < data.length; i++){
                    for (int j = 0; j < data[i].length; j++){
                        writer.write(String.valueOf(data[i][j]));
                        if (j < data[i].length - 1){
                            writer.write(",");
                        }
                    }
                    writer.write("\n");

                }
                writer.close();
            // If file already exists, give an appropriate warning
            } else {
                System.out.println("File already exists.");
            }
          } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
          }

    }
}
