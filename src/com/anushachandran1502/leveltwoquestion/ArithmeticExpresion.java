package com.anushachandran1502.leveltwoquestion;


public class ArithmeticExpresion{
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1};
        int targetResult = 10;

        generateExpressions(numbers, targetResult, "", 0);
    }
    public static void generateExpressions(int[] numbers, int targetResult, String currentExpression, int index) {
        if (index == numbers.length) {
            if (evaluateExpression(currentExpression) == targetResult) {
                System.out.println("Expression: " + currentExpression + " = " + targetResult);
                System.exit(0);             }
            return;
        }     
        generateExpressions(numbers, targetResult, currentExpression + numbers[index], index + 1);
        generateExpressions(numbers, targetResult, currentExpression + "+" + numbers[index], index + 1);
        generateExpressions(numbers, targetResult, currentExpression + "-" + numbers[index], index + 1);
        generateExpressions(numbers, targetResult, currentExpression + "*" + numbers[index], index + 1);
        generateExpressions(numbers, targetResult, currentExpression + "/" + numbers[index], index + 1);
    }
    public static int evaluateExpression(String expression) {
        String[] tokens = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length-1; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
            }
        }

        return result;
    }
}