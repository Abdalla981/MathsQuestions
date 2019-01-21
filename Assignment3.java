package exercise;


public class Assignment3
{
    public static void main(String[] args) {

        ScoreBoard xBoard = new ScoreBoard();

        MathQuestion base1 = new MathQuestion("MathQuestion Base case one: ", 1, 2, '+');
        MathQuestion base2 = new MathQuestion("MathQuestion Base case two: ", 3, 4, '-');
        MathQuestion base3 = new MathQuestion("MathQuestion Base case three: ", 5, 6, '*');
        MathQuestion base4 = new MathQuestion("MathQuestion Base case four: ", 7, 8, '%');
        MathQuestion base5 = new MathQuestion("MathQuestion Base case five: ", 0, 100, '#');
        base1.checkAnswer(base1.getUserInput());
        base2.checkAnswer(base2.getUserInput());
        base3.checkAnswer(base3.getUserInput());
        base4.checkAnswer(base4.getUserInput());
        base5.checkAnswer(base5.getUserInput());

        for (int i = 1; i <= 10; i++) {

            int total = xBoard.getTotal();
            int score = xBoard.getScore();
             MathQuestion test = new MathQuestion("MathQuestion Test" + Integer.toString(i) + ": ");
            if (test.checkAnswer(test.getUserInput()))
                xBoard.setScore(score += 1);
            xBoard.setTotal(total += 1);
        }
    }
}