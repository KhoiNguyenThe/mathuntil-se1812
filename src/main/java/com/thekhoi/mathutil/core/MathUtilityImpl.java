package com.thekhoi.mathutil.core;

public class MathUtilityImpl {

    // CHUẨN BỊ BỘ DATA ĐỂ RIÊNG, SAU ĐÓ FILL VÀO LỆNH TEST
    // MẢNG 2 CHIỀU, GỒM GIÁ TRỊ KÌ VONG| CON N!
    public static Object[][] initTestData(){
        //trả về mảng 2 chiều
        Object[][] dataset = {{5,120},
                              {6, 720},
                              {4, 24},
                              {3, 6}}; // ={các phần tử mảng cách nhau dấu,}
        return dataset;
    }
    @ParameterizedTest
    @MethodSource
    public void testFactorialGivenRightArgRunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
