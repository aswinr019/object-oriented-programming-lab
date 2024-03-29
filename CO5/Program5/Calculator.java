import java.util.Stack;

public class Calculator {
    public static double evaluate(String expression) {
        try {
            String postfix = convertToPostfix(expression);
            return evaluatePostfix(postfix);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    private static String convertToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                postfix.append(ch);
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && stack.peek() != '(' && hasHigherPrecedence(stack.peek(), ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }

    private static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(Double.parseDouble(Character.toString(ch)));
            } else if (ch == '.') {
                int decimalDigits = 0;
                double decimalValue = 0.0;
                i++;

                while (i < postfix.length() && Character.isDigit(postfix.charAt(i))) {
                    decimalValue = decimalValue * 10 + Character.getNumericValue(postfix.charAt(i));
                    decimalDigits++;
                    i++;
                }

                double decimalNumber = decimalValue / Math.pow(10, decimalDigits);
                stack.push(stack.pop() + decimalNumber);
                i--; 
            } else if (isOperator(ch)) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(ch, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static double performOperation(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0.0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

