import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // Thêm phần tử vào queue
    public static void enqueue(int x) {
        stack1.push(x);
    }

    // Chuyển dữ liệu từ stack1 sang stack2 khi cần
    public static void chuyenStack() {

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    // Xóa phần tử đầu queue
    public static void dequeue() {

        chuyenStack();

        if (!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    // In phần tử đầu queue
    public static void printFront() {

        chuyenStack();

        if (!stack2.isEmpty()) {
            System.out.println(stack2.peek());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int loai = sc.nextInt();

            // Loại 1: thêm phần tử
            if (loai == 1) {

                int x = sc.nextInt();
                enqueue(x);
            }

            // Loại 2: xóa phần tử đầu
            else if (loai == 2) {

                dequeue();
            }

            // Loại 3: in phần tử đầu
            else if (loai == 3) {

                printFront();
            }
        }

        sc.close();
    }
}