package exercise;

import java.lang.Math;
import javax.swing.JOptionPane;

public class MathQuestion {

    private String title;
    private int expected_answer, a, b;
    private char op;

    MathQuestion(String title, int a, int b, char operator) {

        this.a = a;
        this.b = b;
        op = operator;

        if (a > 99 || a < 1)
            this.a = 1;
        if (b > 99 || b < 1)
            this.b = 1;
        if (op != '+' && op != '-' && op != '*' && op != '%')
            op = '+';

        this.title = title + '(' + Integer.toString(this.a) + ' ' + op + ' ' + Integer.toString(this.b) + ')';

    }

    MathQuestion(String title) {

        this.a = (int) (Math.random() * 98) + 1;
        this.b = (int) (Math.random() * 98) + 1;
        int op_random = (int) (Math.random() * 4);

        if (op_random == 0) {
            op = '+';
            this.title = title + '(' + Integer.toString(a) + ' ' + op + ' ' + Integer.toString(b) + ')';
        }
        if (op_random == 1) {
            op = '-';
            this.title = title + '(' + Integer.toString(a) + ' ' + op + ' ' + Integer.toString(b) + ')';
        }
        if (op_random == 2) {
            op = '*';
            this.title = title + '(' + Integer.toString(a) + ' ' + op + ' ' + Integer.toString(b) + ')';
        }
        if (op_random == 3) {
            op = '%';
            this.title = title + '(' + Integer.toString(a) + ' ' + op + ' ' + Integer.toString(b) + ')';
        }
    }

    public String getUserInput() {

        String answer = JOptionPane.showInputDialog(title, "<type your answer here>");
        while (answer == null)
            answer = JOptionPane.showInputDialog(title, "<type your answer here>");
        return answer;
    }

    public boolean checkAnswer(String answer) {

        if (op == '+')
            expected_answer = a + b;
        if (op == '-')
            expected_answer = a - b;
        if (op == '*')
            expected_answer = a * b;
        if (op == '%')
            expected_answer = a % b;
        try {
            if (expected_answer == Integer.parseInt(answer))
                return true;
            else
                return false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input a number!");
            return checkAnswer(getUserInput());
        }
    }
}