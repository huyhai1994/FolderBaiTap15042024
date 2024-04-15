package triangleclassifier;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName("a = 2, b =2, c=2")
    public void case1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giac deu";

        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("a = 2, b =2, c=3")
    public void case2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("a = 3, b =4, c=5")
    public void case3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong";
        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("a = -1, b =2, c=1")
    public void case4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("a = 8, b =2, c=3")
    public void case5() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("a = 0, b =2, c=3")
    public void case6() {
        int a = 0;
        int b = 2;
        int c = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.estimateTriangleType(a, b, c);
        assertEquals(expected, result);
    }
}
