package at.milgram.games.owngame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.*;

public class Human implements Actor{
    private final Rectangle solidArea;
    private Image StickmanImage;
    private float x,y;

    public Human() throws SlickException {
        Image tmp = new Image("testdata/human.png");
        this.StickmanImage = tmp.getScaledCopy(50,100);
        this.x = 20;
        this.y = 20;

        solidArea = new Rectangle(this.x,this.y, StickmanImage.getWidth(), StickmanImage.getHeight());
    }

    @Override
    public void render(Graphics graphics) {
        this.StickmanImage.draw(this.x,this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
