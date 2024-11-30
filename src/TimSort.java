
import java.util.Arrays;

public class TimSort {

    // The size of a "run" (subarray for insertion sort)
    static int RUN = 32;

    public static void main(String[] args) {
        int[] arr = {5, 21, 7, 23, 19, -1, 13, 0, 4, 6, 8};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        timSort(arr, arr.length);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    // Perform Timsort on an array
    public static void timSort(int[] arr, int n) {
        // Step 1: Sort individual runs of size RUN using insertion sort
        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min(i + RUN - 1, n - 1));
        }

        // Step 2: Merge runs using merge sort
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
    }

    // Perform insertion sort on a subarray
    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < len2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

