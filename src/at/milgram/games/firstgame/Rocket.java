package at.milgram.games.firstgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket implements Actor {
    private Image rocketImage;

    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/rocket.png");
        this.rocketImage = tmp.getScaledCopy(50,50);
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(100,100);
    }

    @Override
    public void update(int delta) {

    }
}
