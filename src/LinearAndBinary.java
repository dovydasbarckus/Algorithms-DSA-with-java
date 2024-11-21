import java.util.stream.IntStream;

public class LinearAndBinary {
    public static void main(String[] args) {

//        int[] numbers = {5,7,9,10,11,16};
        int checkIndexPlace = 10000;
        int[] numbers = IntStream.rangeClosed(1, 100000).toArray();
//        int[] numbers = new int[1000];
        int target = 10000;

        int index = linearSearch(numbers, checkIndexPlace);
        if (index != -1)
            System.out.println("This number is at index(linear search): " + index);
        else
            System.out.println("This number do not exist in list");

        int indexWithBinary = binarySearch(numbers, checkIndexPlace);
        if (indexWithBinary != -1)
            System.out.println("This number is at index(binary search): " + indexWithBinary);
        else
            System.out.println("This number do not exist in list");

        int binarySearchRecursive = binarySearchRecursive(numbers, target, 0, numbers.length-1, 0);
        if (binarySearchRecursive != -1)
            System.out.println("This number is at index(binary recursive search): " + binarySearchRecursive);
        else
            System.out.println("This number do not exist in list");

    }

    public static int linearSearch(int[] numbers, int checkIndexPlace) {
        int steps = 0;
        for (int i = 0; i < numbers.length; i++) {
            steps++;
            if (numbers[i] == checkIndexPlace){
                System.out.println(steps);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] numbers, int checkIndexPlace) {
        int steps = 0;
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (numbers[mid] == checkIndexPlace) {
                System.out.println(steps);
                return mid;
            }
            else if(numbers[mid] < checkIndexPlace){
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] numbers, int target,int left, int right, int steps) {
        steps++;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                System.out.println(steps);
                return mid;
            }
            else if(numbers[mid] < target){
                return binarySearchRecursive(numbers, target, mid + 1, right, steps);
            }
            else
                return binarySearchRecursive(numbers, target, left, mid - 1,steps);
        }
        return -1;
    }

}