import java.util.Scanner;

public class CorrectnessInvariant {

    public static void insertionSort(int[] A) {

        for (int i = 1; i < A.length; i++) {

            int value = A[i];

            int j = i - 1;

            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = value;
        }
    }

    public static void printArray(int[] A) {

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);

            if (i < A.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        insertionSort(A);

        printArray(A);
    }
}