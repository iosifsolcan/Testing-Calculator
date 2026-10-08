import org.example.Calculator.CheckExpression.CheckExpression;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckExpressionTest {
    CheckExpression expression1=new CheckExpression();
    private String expression="10 cm + 1 m - 10 mm";
    private boolean result;
    @Test
    public void isValidExpression()
    {
        result= expression1.checkExpression(expression);
        assertEquals(true,result);
    }
}
