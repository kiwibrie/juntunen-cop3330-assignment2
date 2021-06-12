package ex28;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class calculateSumTest {
    App app = new App();

    @Test
    @DisplayName("example test")
    public void test1(){
        int[] input = new int[]{1, 2, 3, 4, 5};
        assertEquals(15, app.calculateSum(input));
    }

    @Test
    @DisplayName("zeros")
    public void test2(){
        int[] input = new int[]{0, 0, 0, 0, 0};
        assertEquals(0, app.calculateSum(input));
    }

    @Test
    @DisplayName("bignum") //not really that big
    public void test3(){
        int[] input = new int[]{256, 256, 256, 256, 256};
        assertEquals(1280, app.calculateSum(input));
    }

    @Test
    @DisplayName("negatives")
    public void test4(){
        int[] input = new int[]{-256, -256, -256, -256, -256};
        assertEquals(-1280, app.calculateSum(input));
    }

    @Test
    @DisplayName("get zero")
    public void test5(){
        int[] input = new int[]{-256, 256, -256, 0, 256};
        assertEquals(0, app.calculateSum(input));
    }

    @Test
    @DisplayName("empty entries")
    public void test6(){
        int[] input = new int[5];
        assertEquals(0, app.calculateSum(input));
    }

}