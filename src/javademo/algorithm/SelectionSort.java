package javademo.algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] n = new int[] {7, 3, 2, 5, 6, 10, 9, 8, 1} ;

        s.selectionSort(n);

        for (int i: n) {
            System.out.println(i);
        }
    }
}


 class Solution {
    public void selectionSort(int[] arr) {
        // Mutates arr so that it is sorted via selecting the minimum element and
        // swapping it with the corresponding index
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // Swap current index with minimum element in rest of list
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}