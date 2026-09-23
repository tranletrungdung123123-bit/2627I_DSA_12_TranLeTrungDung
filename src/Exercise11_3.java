public class Exercise11_3 {
    /*
Bài 3:

Các cặp có thể là lệnh union(p,q) gần nhất là:

(4,0)
(5,0)
(8,9)


Giải thích:

Nhánh có root 0 gồm:
{0,1,2,3}
=> kích thước = 4

Phần còn lại của cây root 4 trước khi nối với nhánh 0 là:
{4,5,6,7}
=> kích thước = 4

Hai cây có cùng kích thước.

Theo đề, nếu hai cây bằng nhau thì root của cây chứa q
sẽ trỏ vào root của cây chứa p.

union(4,0):
root 0 trỏ vào root 4
=> đúng với hình.

union(5,0):
5 cũng nằm trong cây có root 4,
nên root 0 vẫn trỏ vào root 4
=> đúng.


union(0,4) không đúng vì lúc đó root 4 sẽ trỏ vào root 0,
ngược với hình.


Ngoài ra, cây 8 và 9 có thể được tạo cuối cùng bởi:

union(8,9)

Hai cây đều có kích thước 1 nên 9 sẽ trỏ vào 8,
đúng với hình.


=> Đáp án: (4,0), (5,0), (8,9).
*/
}
