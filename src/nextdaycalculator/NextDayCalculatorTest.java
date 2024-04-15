package nextdaycalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testIncreaseADay_NormalCase() {
        NextDayCalculator calculator = new NextDayCalculator(28, 2, 2020);
        String expectedResult = "1" + "/" + "3" + "/" + "2020";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_LeapYearFebruary() {
        NextDayCalculator calculator = new NextDayCalculator(28, 2, 2020);
        String expectedResult = "1" + "/" + "3" + "/" + "2020";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_NormalMonth() {
        NextDayCalculator calculator = new NextDayCalculator(30, 4, 2020);
        String expectedResult = "1" + "/" + "5" + "/" + "2020";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_EndOfYear() {
        NextDayCalculator calculator = new NextDayCalculator(31, 12, 2020);
        String expectedResult = "1" + "/" + "1" + "/" + "2021";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_EndOfMonth() {
        NextDayCalculator calculator = new NextDayCalculator(31, 12, 2020);
        String expectedResult = "1" + "/" + "1" + "/" + "2021";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_EndOfMonth_LeapYear() {
        NextDayCalculator calculator = new NextDayCalculator(29, 2, 2020);
        String expectedResult = "1" + "/" + "3" + "/" + "2020";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_EndOfMonth_NormalYear() {
        NextDayCalculator calculator = new NextDayCalculator(30, 2, 2020);
        String expectedResult = "1" + "/" + "3" + "/" + "2020";
        assertEquals(expectedResult, calculator.increaseADay());
    }

    @Test
    void testIncreaseADay_EndOfMonth_NormalYear_LastDayOfMonth() {
        NextDayCalculator calculator = new NextDayCalculator(31, 12, 2020);
        String expectedResult = "1" + "/" + "1" + "/" + "2021";
        assertEquals(expectedResult, calculator.increaseADay());
    }
}