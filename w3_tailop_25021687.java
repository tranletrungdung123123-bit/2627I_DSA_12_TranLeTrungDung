import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_25021687 {

    // Hàm cho biết độ ưu tiên của dấu phép toán
    static int doUuTien(char dau) {

        if (dau == '+' || dau == '-') {
            return 1;
        }

        if (dau == '*' || dau == '/') {
            return 2;
        }

        return 0;
    }

    // Hàm chuyển biểu thức trung tố sang hậu tố
    static String chuyenSangHauTo(String bieuThuc) {

        Stack<Character> nganXep = new Stack<>();

        StringBuilder ketQua = new StringBuilder();

        for (int viTri = 0; viTri < bieuThuc.length(); viTri++) {

            char kyTu = bieuThuc.charAt(viTri);

            // Nếu gặp khoảng trắng thì bỏ qua
            if (kyTu == ' ') {
                continue;
            }

            // Nếu là chữ hoặc số thì đưa thẳng vào kết quả
            if (Character.isLetterOrDigit(kyTu)) {

                ketQua.append(kyTu).append(' ');
            }

            // Nếu gặp dấu (
            else if (kyTu == '(') {

                nganXep.push(kyTu);
            }

            // Nếu gặp dấu )
            else if (kyTu == ')') {

                while (!nganXep.isEmpty()
                        && nganXep.peek() != '(') {

                    ketQua.append(nganXep.pop()).append(' ');
                }

                if (!nganXep.isEmpty()) {
                    nganXep.pop();
                }
            }

            // Nếu gặp +, -, *, /
            else if (kyTu == '+'
                    || kyTu == '-'
                    || kyTu == '*'
                    || kyTu == '/') {

                while (!nganXep.isEmpty()
                        && nganXep.peek() != '('
                        && doUuTien(nganXep.peek()) >= doUuTien(kyTu)) {

                    ketQua.append(nganXep.pop()).append(' ');
                }

                nganXep.push(kyTu);
            }
        }

        // Sau khi đọc hết biểu thức,
        // lấy các dấu còn lại trong Stack ra
        while (!nganXep.isEmpty()) {

            ketQua.append(nganXep.pop()).append(' ');
        }

        return ketQua.toString();
    }

    public static void main(String[] args) {

        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap bieu thuc trung to: ");

        String bieuThuc = banPhim.nextLine();

        String hauTo = chuyenSangHauTo(bieuThuc);

        System.out.println("Bieu thuc hau to: " + hauTo);

        banPhim.close();
    }
}