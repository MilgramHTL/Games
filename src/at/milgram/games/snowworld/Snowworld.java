package at.milgram.games.snowworld;

import at.milgram.games.firstgame.ObjectsGame;
import org.newdawn.slick.*;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Snowworld extends BasicGame {
    private List<Actor> actors;
    private Snowflake snowflake;
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;

    public Snowworld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            Snowflake snowflakeB = new Snowflake(Snowflake.SIZE.BIG);
            this.actors.add(snowflakeB);
        }
        for (int i = 0; i < 500; i++) {
            Snowflake snowflakeM = new Snowflake(Snowflake.SIZE.MIDDLE);
            this.actors.add(snowflakeM);
        }
        for (int i = 0; i < 500; i++) {
            Snowflake snowflakeS = new Snowflake(Snowflake.SIZE.SMALL);
            this.actors.add(snowflakeS);
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
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowworld"));
            container.setDisplayMode(SCREEN_WIDTH,SCREEN_HEIGHT,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
