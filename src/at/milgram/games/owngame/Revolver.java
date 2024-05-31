package at.milgram.games.owngame;

import org.newdawn.slick.*;
import java.util.Random;

public class Revolver implements Actor {
    private Image revolverImage;
    private boolean Collision;
    private GameBoard gb;
    private float x;
    private float y;
    private CollissionChecker collissionChecker;

    public Revolver() throws SlickException {
        Image tmp = new Image("testdata/revolver.png");
        this.revolverImage = tmp.getScaledCopy(50,50);
        this.Collision = true;
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
            revolverImage.draw(this.x,this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_D)){
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_A)){
            this.x--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_S)){
            this.y++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_W)){
            this.y--;
        }

        Collision = false;
        gb.cChecker.equals(this);

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
