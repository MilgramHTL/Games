package at.milgram.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangle rectangle;

    private float xO;
    private float yO;
    private float xE;
    private float yE;
    private float speed;

    private float directionO = 1;
    private float directionE = 1;
    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100,50,10.0f,1);
        this.xO = 100;
        this.yO = 100;
        this.xE = 50;
        this.yE = 50;
        this.speed = 10.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        float move = (float)delta/this.speed;
        this.rectangle.update(delta);

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
        this.rectangle.render(graphics);
        graphics.drawOval(this.xE,this.yE,60,25);
        graphics.drawOval(this.xO,this.yO,100,100);
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
