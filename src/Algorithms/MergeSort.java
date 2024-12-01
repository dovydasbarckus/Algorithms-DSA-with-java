package Algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = {48, -5, 13, 1, 0, 6, -1};
        long start = System.nanoTime();
        int[] result = mergeSorting(numbers, 0, numbers.length - 1);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(result));
        System.out.println("Sorting takes " +
                (end - start) + " nano seconds");
    }

    public static int[] mergeSorting(int[] numbers, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;
            mergeSorting(numbers, left, mid);
            mergeSorting(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }

        return numbers;
    }

        private static int[] merge ( int[] numbers, int left, int mid, int right){
            int n1 = mid - left + 1;
            int n2 = right - mid;
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];

            for(int x=0; x<n1;x++){
                leftArr[x] = numbers[left+x];
            }
            for(int x=0; x<n2;x++){
                rightArr[x] = numbers[mid+1+x];
            }
            int i = 0;
            int j = 0;
            int k = left;

            while(i<n1 && j<n2){
                if(leftArr[i]<=rightArr[j]){
                    numbers[k] = leftArr[i];
                    i++;
                }
                else{
                    numbers[k] = rightArr[j];
                    j++;
                }
                k++;
            }

            while(i<n1){
                numbers[k] = leftArr[i];
                i++;
                k++;
            }

            while(j<n2){
                numbers[k] = rightArr[j];
                j++;
                k++;
            }

            return numbers;
        }
}
