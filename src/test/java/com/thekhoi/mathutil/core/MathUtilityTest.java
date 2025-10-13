package com.thekhoi.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
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
    @MethodSource ("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
