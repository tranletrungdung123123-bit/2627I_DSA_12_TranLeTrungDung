public class Exercise11_1 {

    /*
    Bài 1:

    Chọn n = 3.

    Ban đầu:
    leader = [0, 1, 2]

    Thực hiện union(0, 1):
    leader = [1, 1, 2]

    Sau đó thực hiện union(0, 2):
    leader = [2, 1, 2]

    Chọn i = 0, j = 1.

    Ta có:
    find(0) = 2
    find(1) = 1

    => find(0) != find(1), trong khi 0 và 1 đã được nối với nhau từ trước.

    Nguyên nhân là leader[p] bị thay đổi ngay trong lúc vòng lặp đang chạy,
    nên phần tử 1 bị bỏ sót.
    */

}
