import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        StringBuilder vanBan = new StringBuilder();

        Stack<String> lichSu = new Stack<>();

        for (int i = 0; i < q; i++) {

            String dong = sc.nextLine();

            String[] phan = dong.split(" ");

            int loai = Integer.parseInt(phan[0]);

            // Loại 1: thêm chuỗi
            if (loai == 1) {

                // Lưu trạng thái trước khi thay đổi
                lichSu.push(vanBan.toString());

                String them = phan[1];

                vanBan.append(them);
            }

            // Loại 2: xóa k ký tự cuối
            else if (loai == 2) {

                lichSu.push(vanBan.toString());

                int k = Integer.parseInt(phan[1]);

                vanBan.delete(
                        vanBan.length() - k,
                        vanBan.length()
                );
            }

            // Loại 3: in ký tự thứ k
            else if (loai == 3) {

                int k = Integer.parseInt(phan[1]);

                System.out.println(vanBan.charAt(k - 1));
            }

            // Loại 4: undo
            else if (loai == 4) {

                if (!lichSu.isEmpty()) {

                    vanBan = new StringBuilder(
                            lichSu.pop()
                    );
                }
            }
        }

        sc.close();
    }
}