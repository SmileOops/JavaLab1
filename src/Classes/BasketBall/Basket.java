package Classes.BasketBall;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public void addBall(Ball ball) {
        if (ball != null) {
            balls.add(ball);
        }
    }

    public int countBalls(Color color) {
        int result = 0;

        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                result++;
            }
        }

        return result;
    }

    public int getWholeWeight() {
        int result = 0;

        for (Ball ball : balls) {
            result += ball.getWeight();
        }

        return result;
    }


}
