public class Exercise14_1 {

    /*
    Bài 1.4.1:

    Cần chứng minh số bộ ba chọn từ N phần tử là:

    N(N-1)(N-2) / 6

    Dùng quy nạp:

    Với N = 3:

    3(3-1)(3-2) / 6 = 1

    Đúng vì từ 3 phần tử chỉ chọn được 1 bộ ba.


    Giả sử công thức đúng với N phần tử:

    T(N) = N(N-1)(N-2) / 6


    Khi có N+1 phần tử:

    Các bộ ba cũ vẫn có:
    N(N-1)(N-2) / 6

    Các bộ ba mới có chứa phần tử mới:
    chỉ cần chọn thêm 2 phần tử trong N phần tử cũ.

    Số cách là:
    N(N-1) / 2


    Vậy:

    T(N+1)
    = N(N-1)(N-2)/6 + N(N-1)/2

    = [N(N-1)(N-2) + 3N(N-1)] / 6

    = N(N-1)(N+1) / 6

    = (N+1)N(N-1) / 6

    Đây chính là công thức khi thay N bằng N+1.

    => Công thức đúng với mọi N >= 3.
    */

}