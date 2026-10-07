import java.util.Scanner;

public class InsertionSortPart1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;

        int value = arr[n - 1];

        int i = n - 2;

        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];

            printArray(arr);

            i--;
        }

        arr[i + 1] = value;

        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertIntoSorted(arr);
    }
}