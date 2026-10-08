package org.example.Run;

import org.example.Calculator.Calculator;
import org.example.Calculator.CheckExpression.CheckExpression;

import java.util.Scanner;

public class Run {
    private final boolean valid = true;
    private String expression;

    public void run() {
        // Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        CheckExpression checkExpression = new CheckExpression();
        // System.out.println("Enter the expression");
        // expression=sc.nextLine();
        expression = "10 cm + 1 m - 10 mm";
        calculator.setExpression(expression);
        if (checkExpression.checkExpression(expression) == valid) {
            calculator.conversionOfUnits();
            System.out.println(calculator.calculateValues() + " mm");
        } else {
            System.out.println("Enter a new expression");
            //run();
        }
    }
}