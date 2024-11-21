import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {

        int[] numbers = {48, -5, 13, 1, 0, 6, -1};

        int[] result = bubbleSorting(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSorting(int[] numbers) {

        for (int i = 0; i < numbers.length; i++){
            boolean swapped = false;
            int temp = 0;

            for (int j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j] > numbers[j + 1]){

                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return numbers;
    }
}
