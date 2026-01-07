package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    @DisplayName("ทำการตรวจสอบ [ ตอนเริ่มต้น")
    public void case1(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ทำการตรวจสอบ ( ตอนเริ่มต้น")
    public void case2(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    public void case3(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

    @Test
    public void case4(){
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStart();
        assertEquals(2, result);
    }

}