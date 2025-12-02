package activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] arr = {25, 12, 9, 30, 2, 45, 18}; 

        System.out.println("Before Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("After Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Insertion Sort Logic
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; 
        }
    }
}
