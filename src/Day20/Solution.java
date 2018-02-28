package Day20;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        Sorting sorting = new Sorting(a);
        int swapCount = sorting.bubbleSorting();
        System.out.println("Array is sorted in " + String.valueOf(swapCount) +" swaps.");
        System.out.println("First Element: " + sorting.getFirstElement());
        System.out.println("Last Element: " + sorting.getLastElement());
    }
}

class Sorting {

    private int[] array;

    Sorting(int[] array) {
        this.array = array;
    }

    Integer bubbleSorting() {
        int numberOfSwaps = 0;
        for (int i = 0; i < array.length; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < array.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numberOfSwaps;
    }

    Integer getFirstElement() {
        return array[0];
    }

    Integer getLastElement() {
        return array[array.length - 1];
    }
}
