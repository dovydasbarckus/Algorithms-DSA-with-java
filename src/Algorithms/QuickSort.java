package Algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] numbers = {48, -5, 13, 1, 0, 6, -1};
        long start = System.nanoTime();
        int[] result = quickSorting(numbers, 0, numbers.length-1);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(result));
        System.out.println("Sorting takes " +
                (end - start) + " nano seconds");
    }

    public static int[] quickSorting(int[] numbers, int low, int high) {

        if(low<high){

            int pivot = partition(numbers, low, high);
            quickSorting(numbers, low, pivot-1);
            quickSorting(numbers, pivot+1, high);
        }


        return numbers;
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low -1;
        for(int j = low; j<high; j++){
            if(numbers[j] < pivot){
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;

        return i+1;
    }
}