package at.milgram.games.owngame;

import at.milgram.games.owngame.Actor;
import at.milgram.games.owngame.CollisionActor;
import at.milgram.games.owngame.GameBoard;
import at.milgram.games.owngame.Bullet;
import at.milgram.games.owngame.Revolver;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoard extends BasicGame {
    private List<Actor> actors;

    private List<Human> humanList;
    private Revolver revolver;

    private Input input;
    private Bullet bullet;

    public GameBoard(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        this.humanList = new ArrayList<>();

        Revolver revolver = new Revolver(this);
        this.revolver = revolver;
        this.actors.add(revolver);
        Human human1 = new Human();

        this.actors.add(human1);
        this.humanList.add(human1);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE) {
            Random random = new Random();
            int randomInt = random.nextInt(6);
            if (true) {
                System.out.println("Shoot");
                Bullet b = new Bullet(this.revolver.getX(), this.revolver.getY());
                this.actors.add(b);
                for (Human human : this.humanList) {
                    human.addCollisionActor(b);
                }
            }
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new GameBoard("Roullete"));
            container.setDisplayMode(1000, 1000, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
