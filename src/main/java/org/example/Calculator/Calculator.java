package org.example.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private String expression;
    private String[] parts;
    private List<String> values = new ArrayList<>();

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void conversionOfUnits() {
        values.clear();
        parts = expression.split(" ");
        for (int i = 0; i < parts.length ; i++) {
            if (Character.isDigit(parts[i].charAt(0))) {
                String conversion;
                if (parts[i + 1].equals("km")) {
                    conversion = String.valueOf(Integer.parseInt(parts[i]) * 1000000);
                    values.add(conversion);
                }
                if (parts[i + 1].equals("m")) {
                    conversion = String.valueOf(Integer.parseInt(parts[i]) * 1000);
                    values.add(conversion);
                }
                if (parts[i + 1].equals("dm")) {
                    conversion = String.valueOf(Integer.parseInt(parts[i]) * 100);
                    values.add(conversion);
                }
                if (parts[i + 1].equals("cm")) {
                    conversion = String.valueOf(Integer.parseInt(parts[i]) * 10);
                    values.add(conversion);
                }
                if (parts[i + 1].equals("mm")) {
                    conversion = String.valueOf(Integer.parseInt(parts[i]));
                    values.add(conversion);
                }
            } else if ((parts[i].equals("+")||parts[i].equals("-"))) {
                values.add(parts[i]);
            }
        }
    }

    public int calculateValues() {
        int result=Integer.parseInt(values.get(0));
        for (int i = 1; i < values.size(); i += 2) {

            if (values.get(i).equals("+")) {
                result += Integer.parseInt(values.get(i + 1));
            } else if (values.get(i).equals("-")) {
                result -= Integer.parseInt(values.get(i + 1));
            }
        }

        return result;
    }
}