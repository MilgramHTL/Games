package at.milgram.games.snowworld;

import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflake implements Actor {
    public enum SIZE{BIG, MIDDLE, SMALL};
    private float x;
    private float y;
    private int size;
    private int speed;
    private float move;
    private Random random;

    public Snowflake(SIZE size){
        this.random = new Random();
        if(size == SIZE.BIG){
            this.size = 8;
            this.speed = 1;
        }
        if(size == SIZE.MIDDLE){
            this.size = 4;
            this.speed = 2;
        }
        if(size == SIZE.SMALL){
            this.size = 2;
            this.speed = 3;
        }
        randomPosition();
    }
    public void randomPosition(){
        this.x = random.nextInt(800);
        this.y = (int) (random.nextDouble() * -400);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, this.size, this.size);
    }

    @Override
    public void update(int delta) {
        float move = (float)delta/this.speed;
        this.y += move;
        if(this.y > 800){
            randomPosition();
        }
    }
}
