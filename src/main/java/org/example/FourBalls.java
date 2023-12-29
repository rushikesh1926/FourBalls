import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 10;

    Balls ball1, ball2, ball3, ball4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Balls(0, HEIGHT / 5, 1);
        ball2 = new Balls(0, 2 * (HEIGHT / 5), 2);
        ball3 = new Balls(0, 3 * (HEIGHT / 5), 3);
        ball4 = new Balls(0, 4 * (HEIGHT / 5), 4);
    }

    @Override
    public void draw() {
        ball1.display(this);
        ball2.display(this);
        ball3.display(this);
        ball4.display(this);
    }

}