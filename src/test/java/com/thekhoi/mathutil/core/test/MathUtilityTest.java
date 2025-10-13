package com.thekhoi.mathutil.core.test;

import com.thekhoi.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
  public void testFactoritalGivienRightArg5RunsWell(){
      assertEquals(24, getFactorial (24));
  }
    @Test //@Test là ghi chú, đánh dấu, kí hiệu - annotation kí hiệu
    // rằng hàm này là hàm main() có thể run
    // 1 class test có thể có nhiều @Test, vậy 1 class test có thể có nhiều hàm mai() - để ứng với nhiều kịch bản test
    //, nhiều test case khác nhau đều được run !!!
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
        assertEquals(expectedValue, actualValue);
        //test nè, so sánh actual vs.expected
        // dùng biến boolean hoặc in ra
        assertEquals(expectedValue, actualValue);
        //import static chỉ dành cho những hàm static, để giúp ta làm biếng gõ tên class chấm. Lẽ ra phải là MathUtility.getFactiruak(2)
        // thì nay chỉ cần gõ getFactorial(5); là đủ
        //giả sử class có nhiều hàm static thì ta đổi qua dấu *;
    }
}