import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class nameManipulatorTest {
    private nameManipulator nameManip;

    @BeforeEach
    void setUp(){
        nameManip = new nameManipulator();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 4, 6})
    void testVowelCount1(int position){
        int result = nameManip.vowelCount(position);
        assertEquals(2, result);
    }

    @Test
    void testVowelCount4(){
        int result = nameManip.vowelCount(3);
        assertEquals(3, result);
    }

    @Test
    void testVowelCount6(){
        int result = nameManip.vowelCount(5);
        assertEquals(1, result);
    }



}
