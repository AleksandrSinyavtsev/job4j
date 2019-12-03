package ru.job4j.oop;

/**
 * класс BallStory, описывает сказку о колобке.
 */
public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.wasBaked();
        ball.escape();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
