package com.thekhoi;

import com.thekhoi.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            testFactorialGivenRightArg0RunsWell();
            testFactorialGivenRightArg0RunsWell();
    }

    //TEST CASE #1l: Check getFactorial() method with valid parameter, e.g. n = 0
    // STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 0
    //2. Call/invoke getFactorial(n = 0)
    //3. Execute
    // EXPECTED RESULT:
    // The method wil return 1 as the result of 0!
    //STATUS:
    // PASSED HAY FAILED chờ chạy app đã !!!
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // đầu vào
        long expectedValue = 1; // hope to see 0! = 1, kì vọng thay
        // gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //test nè, so sánh actual vs.expected
        // dùng biến boolean hoặc in ra
        System.out.println("0! expected: " + expectedValue);
        System.out.println("0! actual: " + actualValue);
        //TEST CASE #4: Check/Verify getFactorial() method with Invalid parameter,
         //e.g. n = -5
        //STEPS/PROCEDURE
        // 1. Given an invalid n, e.g. n = -5
        // 2. Call/invoke getFactorial (n = -5)
        // 3. Execute
        //EXPECTED RESULT:
        // The method will throw exception
        //STATUS
        //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP CÁI ĐÃ!!!

    public static void testFactorialGivenWrongArgMinus5ThrowsException(){
        MathUtility.getFactorial( -5); //PASSED, VÌ KÌ VỌNG NGOẠI LỆ XUẤT HIỆN, VÀ NGOẠI LỆ XH THẬT
        // THẤY NGOẠI LỆ MÀ PASSED LÀ TÌNH HUỐNG TA THIẾT KẾ HÀM SẼ XẢY RA NGOẠI LỆ VỚI SỐ ÂM GIAI THỪA!!!


        }
    }
}