package at.milgram.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rocketball implements Actor {
    private float x,y;

    public Rocketball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x,this.y,10,10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
    }
}
