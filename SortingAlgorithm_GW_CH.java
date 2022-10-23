import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.IOException;


class SortingAlgorithm_GW_CH{
    public static int[] randomArray(int num){
        Random rand = new Random();

        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(Integer.MAX_VALUE);
        }
        return arr;
    }

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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в сортировочную машину");
        System.out.print("Enter the sorting algorithm would you like to use (selection, insertion, merge, quick): ");
        String s = sc.nextLine();
        System.out.print("Enter array size: ");
        String lenString = sc.nextLine();
        int len = Integer.valueOf(lenString);
        int[][] lastThing = new int[5][2];

        if(s.toLowerCase().equals("selection")){
            if(len == -1){
                int c = 10000;
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                lastThing[0][0] = 10000;
                lastThing[0][1] = selectSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                lastThing[1][0] = 20000;
                lastThing[1][1] = selectSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                lastThing[2][0] = 40000;
                lastThing[2][1] = selectSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                lastThing[3][0] = 80000;
                lastThing[3][1] = selectSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                lastThing[4][0] = 160000;
                lastThing[4][1] = selectSort(arr5);

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
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                lastThing[0][0] = 10000;
                lastThing[0][1] = insertSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                lastThing[1][0] = 20000;
                lastThing[1][1] = insertSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                lastThing[2][0] = 40000;
                lastThing[2][1] = insertSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                lastThing[3][0] = 80000;
                lastThing[3][1] = insertSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                lastThing[4][0] = 160000;
                lastThing[4][1] = insertSort(arr5);

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
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                lastThing[0][0] = 10000;
                lastThing[0][1] = mergeSort(arr1);

                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                lastThing[1][0] = 20000;
                lastThing[1][1] = mergeSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                lastThing[2][0] = 40000;
                lastThing[2][1] = mergeSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                lastThing[3][0] = 80000;
                lastThing[3][1] = mergeSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                lastThing[4][0] = 160000;
                lastThing[4][1] = mergeSort(arr5);

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
                // for(int i = 0; i <= 4; i++){
                int[] arr1 = randomArray(c);
                lastThing[0][0] = 10000;
                lastThing[0][1] = quickSort(arr1);
                // }
                int d = 20000;
                int[] arr2 = randomArray(d);
                lastThing[1][0] = 20000;
                lastThing[1][1] = quickSort(arr2);
                int e = 40000;
                int[] arr3 = randomArray(e);
                lastThing[2][0] = 40000;
                lastThing[2][1] = quickSort(arr3);
                int f = 80000;
                int[] arr4 = randomArray(f);
                lastThing[3][0] = 80000;
                lastThing[3][1] = quickSort(arr4);
                int g = 160000;
                int[] arr5 = randomArray(g);
                lastThing[4][0] = 160000;
                lastThing[4][1] = quickSort(arr5);

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
