public class Exercise11_4 {
    /*
Bài 4:

Các giá trị có thể của parent[8] là:

0, 4, 8


Giải thích:

Hiện tại 9 trỏ tới 8 nên cây có root 8 gồm:
{8,9}
=> kích thước = 2.


parent[8] = 8:

8 vẫn là root của cây {8,9}.
=> Có thể.


parent[8] = 0:

Cây root 0 có kích thước 4:
{0,1,2,3}

Cây {8,9} có kích thước 2.

Weighted Quick-Union có thể nối cây nhỏ vào cây lớn:
8 -> 0

=> Có thể.


parent[8] = 4:

Cây root 4 có kích thước 4:
{4,5,6,7}

Cây {8,9} có kích thước 2.

Có thể nối:
8 -> 4

=> Có thể.


Các giá trị còn lại không thỏa mãn cấu trúc
Weighted Quick-Union trong hình.

=> parent[8] có thể là 0, 4 hoặc 8.
*/
}
