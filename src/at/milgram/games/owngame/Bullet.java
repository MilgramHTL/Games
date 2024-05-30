package at.milgram.games.owngame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Bullet implements Actor{
    private float x,y;
    private String direction;

    public Bullet(float x, float y) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
            graphics.fillOval(this.x, this.y, 10, 20);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
    }
}
