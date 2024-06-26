package at.milgram.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Elipse implements Actor {
    private float xE;
    private float yE;
    private float speed;
    private float directionE;


    public Elipse() {
        Random random = new Random();
        this.xE = random.nextInt(500);
        this.yE = random.nextInt(400);
        this.speed = 6;
        this.directionE = 2;
    }

    public Elipse(float xE, float yE, float speed, float directionE) {
        this.xE = xE;
        this.yE = yE;
        this.speed = speed;
        this.directionE = directionE;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.xE, this.yE, 60, 25);
    }

    public void update(GameContainer gameContainer, int delta) {
        float move = (float) delta / this.speed;
        if (directionE == 2) {
            this.xE += move;
        }

        if (this.xE >= 800 ) {
            this.xE = -10;
            //this.yE = 400;
        }
    }
}
