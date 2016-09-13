package Classes.BasketBall;

import javafx.scene.paint.Color;

public class Ball {

    private double weight;
    private Color color;

    public Ball(double weight, Color color) {

        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
