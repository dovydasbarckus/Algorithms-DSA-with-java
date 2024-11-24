import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] numbers = {48, -5, 13, 1, 0, 6, -1};
        long start = System.nanoTime();
        int[] result = insertSorting(numbers);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(result));
        System.out.println("Sorting takes " +
                (end - start) + " nano seconds");
    }

    public static int[] insertSorting(int[] numbers){
        int key = 0;
        int j = 0;

        for (int i = 1; i<numbers.length; i++){
            key = numbers[i];
            j = i - 1;
            while (j>=0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
        return numbers;
    }
}