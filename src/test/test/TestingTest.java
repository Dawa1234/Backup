package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {
    Testing t1;
    int result;

    @Test
    void getA() {
        result = -1;
        t1 = new Testing();
        t1.a = 2;
        switch (t1.a){
            case 1:
                result = 1;
                break;
            case 2:
                result = 2;
                break;
            case 3:
                result = 3;
                break;
            default:
                result = -1;
        }
        assertEquals(t1.a,result);
    }
}