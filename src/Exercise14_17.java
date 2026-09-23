public class Exercise14_17 {

    public static void farthestPair(double[] a) {

        if (a == null || a.length < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return;
        }

        double min = a[0];
        double max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Cap xa nhat: " + min + " va " + max);
        System.out.println("Hieu tuyet doi: " + Math.abs(max - min));
    }

    public static void main(String[] args) {

        double[] a = {4.0, 10.0, -2.0, 7.0, 20.0};

        farthestPair(a);
    }

    /*
    Bài 1.4.17:

    Cặp xa nhất trong mảng là giá trị nhỏ nhất
    và giá trị lớn nhất.

    Với mảng:
    [4, 10, -2, 7, 20]

    min = -2
    max = 20

    => Cặp xa nhất là (-2, 20)

    Hiệu tuyệt đối:
    |-2 - 20| = 22

    Thuật toán chỉ duyệt mảng một lần
    để tìm min và max.

    => Thời gian chạy: O(N)
    => Bộ nhớ phụ: O(1)
    */
}