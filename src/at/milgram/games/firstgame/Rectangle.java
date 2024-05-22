package at.milgram.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;
    private float direction;

    public Rectangle(){
        Random random = new Random();
        this.x = random.nextInt(600);
        this.y = 400;
        this.speed = 4;
        this.direction = 4;
    }
    public Rectangle(float x, float y, float speed, float direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }


    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,50,50);
    }

    public void update(GameContainer gameContainer, int delta){
        float move = (float)delta/this.speed;

        if(direction==1){
            this.x += move;
        }

        if(direction==2){
            this.y += move;
        }

        if(direction==3){
            this.x -= move;
        }

        if(direction==4){
            this.y -= move;
        }

    }
}
