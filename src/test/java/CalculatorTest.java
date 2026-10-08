import org.example.Calculator.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("calculateValues")
    public void testCalculateValues(String expression,int expected)
    {
        Calculator calculator=new Calculator();
        calculator.setExpression(expression);
        calculator.conversionOfUnits();
        int result=calculator.calculateValues();
        assertEquals(expected,result);
    }

    public static Stream<Arguments> calculateValues() {
        return Stream.of(
                Arguments.of("10 cm + 1 m - 10 mm",1090),
                Arguments.of("5 m - 20 cm + 30 mm",4830),
                Arguments.of("90 mm + 8 cm - 1 cm",160)
        );
    }
}
