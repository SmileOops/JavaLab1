package Classes.BasketBall;

import javafx.scene.paint.Color;

public class Ball {

    private int weight;
    private Color color;

    public Ball(int weight, Color color) {

        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
