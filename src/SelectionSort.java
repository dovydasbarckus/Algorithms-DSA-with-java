import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] numbers = {48, -5, 13, 1, 0, 6, -1};

        long start = System.nanoTime();
        int[] result = selectionSorting(numbers);
        long end = System.nanoTime();;
        System.out.println(Arrays.toString(result));
        System.out.println("Sorting takes " +
                (end - start) + " nano seconds");
    }

    public static int[] selectionSorting(int[] numbers){
        int temp = 0;
        int minIndex = 0;

        for (int i = 0; i<numbers.length-1; i++){
            minIndex = i;
            for (int j = i+1; j<numbers.length; j++){
                if (numbers[minIndex] > numbers[j]){
                    minIndex = j;
                }
            }
            temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
