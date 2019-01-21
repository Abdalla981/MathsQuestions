package exercise;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ScoreBoard for keeping and displaying score and total
 * @author pffung
 */
public class ScoreBoard {
    private JFrame window;
    private JLabel scoreLabel;
    private JLabel totalLabel;
    private int score;
    private int total;
    
    public ScoreBoard()
    {
        total = 0;
        score = 0;
        
        window = new JFrame("Score Board");
        window.setSize(300, 100);
        window.setLayout(new GridLayout(2,2));
        window.add(new JLabel("<html><h2 style='color:red;'>Score</h2></html>"));
        window.add(scoreLabel = new JLabel("" + score));
        window.add(new JLabel("<html><h2 style='color:blue;'>Total</h2></html>"));
        window.add(totalLabel = new JLabel("" + total));
        window.setLocation(800, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setTotal(int newTotal)
    {
        System.out.println(this.getClass().getSimpleName() + " instance method setTotal(" + newTotal + ")");
        total = newTotal;
        totalLabel.setText("" + total);
    }

    public void setScore(int newScore)
    {
        System.out.println(this.getClass().getSimpleName() + " instance method setScore(" + newScore + ")");
        score = newScore;
        scoreLabel.setText("" + score);
    }
}