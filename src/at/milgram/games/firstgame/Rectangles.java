package at.milgram.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private float x;
    private float y;
    private float xO;
    private float yO;
    private float xE;
    private float yE;
    private float speed;
    private float direction = 1;
    private float directionO = 1;
    private float directionE = 1;
    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 50;
        this.xO = 100;
        this.yO = 100;
        this.xE = 50;
        this.yE = 50;
        this.speed = 10.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        float move = (float)delta/this.speed;

        if(direction==1){
            this.x += move;
        } if(x > 400){
            direction = 2;
        }

        if(direction==2){
            this.y += move;
        } if(y > 200){
            direction = 3;
        }

        if(direction==3){
            this.x -= move;
        } if(x < 50){
            direction = 4;
        }

        if(direction==4){
            this.y -= move;
        } if(y < 50){
            direction = 1;
        }

        if(directionO==1){
            this.yO += move;
        } if(yO > 400){
            directionO = 2;
        }
        if(directionO==2){
            this.yO -= move;
        } if(yO < 50){
            directionO = 1;
        }

        if(directionE==1){
            this.xE += move;
        } if(xE > 400){
            directionE = 2;
        }
        if(directionE==2){
            this.xE -= move;
        } if(xE < 50){
            directionE = 1;
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawOval(this.xE,this.yE,60,25);
        graphics.drawOval(this.xO,this.yO,100,100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
