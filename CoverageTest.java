import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CoverageTest {
    Coverage test = new Coverage();

    //Statement coverage tests
    @ParameterizedTest()
    @CsvSource({"3, 40, 15", "14, 203, 25"})
    void testDiscount1(int numBooks, double sum, int expected){
        int result = test.discount(numBooks, sum);
        assertEquals(expected, result);
    }

    //Branch coverage tests
    @ParameterizedTest()
    @CsvSource({"3, 40, 15", "14, 203, 25", "7, 50, 0"})
    void testDiscount2(int numBooks, double sum, int expected){
        int result = test.discount(numBooks, sum);
        assertEquals(expected, result);
    }

    //Condition coverage tests
    @ParameterizedTest()
    @CsvSource({"3, 40, 15", "14, 203, 25", "7, 50, 0", "4, 150, 0", "4, 207, 0"})
    void testDiscount3(int numBooks, double sum, int expected){
        int result = test.discount(numBooks, sum);
        assertEquals(expected, result);
    }

}
