package Classes.BasketBall;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public void AddBall (Ball ball){
        if (ball != null) {
            balls.add(ball);
        }
    }

    public int CountBalls (Color color) {
        int result = 0;

        for (Ball ball: balls) {
            if (ball.getColor() == color) {
                result++;
            }
        }

        return result;
    }

    public double GetWholeWeight() {
        double result = 0;

        for (Ball ball: balls) {
            result += ball.getWeight();
        }

        return result;
    }


}
