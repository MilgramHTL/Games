package at.milgram.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    private Rectangle rectangle;
    private Oval oval;
    private Elipse elipse;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle();
            this.actors.add(rectangle);
        }
        for (int i = 0; i < 10; i++) {
            Oval oval = new Oval();
            this.actors.add(oval);
        }
        for (int i = 0; i < 10; i++) {
            Elipse elipse = new Elipse();
            this.actors.add(elipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors) {
            actor.render(graphics);
        }
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
