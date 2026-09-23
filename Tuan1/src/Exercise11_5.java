public class Exercise11_5 {
    /*
Bài 5:

Không thể là biểu diễn của Weighted Quick-Union.


Xét nhánh có root 0 trước khi 0 được nối vào 5:

Các phần tử thuộc cây của 0 là:

{0,1,2,3,4,6,8}

=> kích thước = 7.


Cây của 5 trước khi nối với 0 nhiều nhất gồm:

{5,7,9}

=> kích thước = 3.


Theo Weighted Quick-Union,
cây nhỏ phải được nối vào cây lớn.

Nhưng trong hình lại có:

0 -> 5

tức là cây kích thước 7 được nối vào cây kích thước 3.

Điều này không thể xảy ra với Weighted Quick-Union.

=> Kết luận: Không thể.
*/
}
