public class Exercise11_2 {

    /*
    Bài 2:

    Thực hiện:
    union(0,1), union(0,2), ..., union(0,n-1)

    a) Sau khi thực hiện hết các phép union,
    tất cả phần tử đều nằm trong cùng một tập.

    => Có 1 thành phần liên thông.


    b) Quick-Find:

    Số lần cập nhật mảng lần lượt là:
    1 + 2 + 3 + ... + (n-1)

    = n(n-1)/2

    => xấp xỉ ~ n^2/2.


    c) Quick-Union:

    Sau các phép union, cây có dạng:

    0 -> 1 -> 2 -> ... -> n-1

    Vì vậy find(0) phải đi qua một số phần tử
    tỷ lệ với n.

    => Theta(n).


    d) Weighted Quick-Union:

    Các cây nhỏ hơn được nối vào cây lớn hơn,
    nên 0 vẫn là root của cây.

    Vì vậy find(0) chỉ cần số lần truy cập hằng số.

    => Theta(1).
    */

}
