package com.thekhoi.mathutil.core;

public class MathUtility {
    //class này chứa các hàm tiện ích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó không lưu lại kết quả xử lý của nó bên trong
    //vậy nó sẽ được thiết kết là static method!!!!

   //hàm tính n! = 1.2.3....n; trong đó n phải >0
    //quy ước 0! = 1, 1!= 1, 2! = 1 * 2 = 2 ....
    //20! vừa đủ kiểu long, 18 con số 0; 21! long chứa không nổi
    // không có âm giai thừa
    //bài này giai thừa chỉ tính từ 0,...20, ngoài vùng này gọi là không hợp lệ n!!!
    //0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    // 0, 20 -> boundary - biên giới của tập giá trị
    //          xích qua 1 xíu là sang vùng invalid boundary!!!
    // 0, xích nhẹ sang trái 1 đơn vị, không ổn, không tính được, -1 sao tính !!!
    public static long getFactorial(int n) {
       return 0;
    }
}
