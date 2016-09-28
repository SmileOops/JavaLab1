package Tests;

import Classes.BasketBall.Ball;
import Classes.BasketBall.Basket;
import javafx.scene.paint.Color;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {
    @Test
    public void countBalls() throws Exception {
        Basket basket = new Basket();
        basket.addBall(new Ball(30, Color.BLUE));
        basket.addBall(new Ball(20, Color.BEIGE));
        basket.addBall(new Ball(25, Color.BLACK));
        basket.addBall(new Ball(15, Color.BLUE));
        basket.addBall(new Ball(16, Color.BLUE));

        Assert.assertEquals(3, basket.countBalls(Color.BLUE));
    }

    @Test
    public void getWholeWeight() throws Exception {
        Basket basket = new Basket();
        basket.addBall(new Ball(30, Color.BLUE));
        basket.addBall(new Ball(20, Color.BEIGE));
        basket.addBall(new Ball(25, Color.BLACK));
        basket.addBall(new Ball(15, Color.BLUE));
        basket.addBall(new Ball(16, Color.BLUE));

        Assert.assertEquals(106, basket.getWholeWeight());
    }

}