import java.util.Scanner;

public class InsertionSortPart2 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void insertionSortPart2(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int value = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = value;

            printArray(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSortPart2(arr);
    }
}