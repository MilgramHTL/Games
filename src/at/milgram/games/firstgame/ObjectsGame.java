package at.milgram.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangle rectangle;
    private Oval oval;
    private Elipse elipse;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100,50,10.0f,1);
        this.oval = new Oval(100,100,5.0f, 1);
        this.elipse = new Elipse(50,50,3.0f,1);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.oval.update(delta);
        this.elipse.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.elipse.render(graphics);
        this.oval.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
