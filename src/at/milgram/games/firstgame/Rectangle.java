package at.milgram.games.firstgame;

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
        this.direction = 1;
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

    public void update(int delta){
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

    }
}
