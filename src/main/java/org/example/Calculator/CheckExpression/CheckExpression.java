package org.example.Calculator.CheckExpression;


public class CheckExpression {
    private String[] expressionByParts;
    private final String[] units = {"mm", "cm", "dm", "m", "km"};
    private boolean isValidExpression;
    private int validUnitFound;

    public boolean checkExpression(String expression) {
        isValidExpression = true;
        validUnitFound = 0;
        expressionByParts = expression.split(" ");
        if (expressionByParts.length >= 2) {
            for (int i = 0; i < expressionByParts.length; i++) {
                if ((i > 0 && Character.isDigit(expressionByParts[i - 1].charAt(0)))
                        && (expressionByParts[i].equals(units[0])
                        || expressionByParts[i].equals(units[1])
                        || expressionByParts[i].equals(units[2])
                        || expressionByParts[i].equals(units[3])
                        || expressionByParts[i].equals(units[4]))) {
                    validUnitFound++;
                } else if (Character.isLetter(expressionByParts[i].charAt(0))) {
                    isValidExpression = false;
                    break;
                }
                if(Character.isDigit(expressionByParts[i].charAt(0)))
                {
                    if (i + 1 == expressionByParts.length) {
                        isValidExpression = false;
                        break;
                    } else if (!Character.isLetter(expressionByParts[i + 1].charAt(0))) {
                        isValidExpression = false;
                        break;
                    }
                }
                if(expressionByParts[i].charAt(0)=='+' || expressionByParts[i].charAt(0)=='-')
                {
                    if(i+1==expressionByParts.length||!Character.isDigit(expressionByParts[i+1].charAt(0)))
                    {
                        isValidExpression=false;
                        break;
                    }
                }
            }
        } else {
            isValidExpression = false;
        }
        if (validUnitFound != 0 && isValidExpression) {
            System.out.println("Expression is valid --> " + expression);
            return isValidExpression;
        } else {
            System.out.println("Expression is invalid --> " + expression);
            return isValidExpression;
        }
    }
}