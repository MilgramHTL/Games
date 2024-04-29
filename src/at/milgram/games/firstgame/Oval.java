package at.milgram.games.firstgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Oval implements Actor{
    private float xO;
    private float yO;
    private float widthO;
    private float heightO;
    private float speed;
    private float directionO;
    public Oval(){
        Random random = new Random();
        this.xO = random.nextInt(1000);
        this.yO = random.nextInt(600);
        this.speed = 4.0f;
        this.directionO = 1;
        this.widthO = 40;
        this.heightO = 40;
    }
    public Oval(float xO, float yO, float speed, float directionO){
        this.xO = xO;
        this.yO = yO;
        this.speed = speed;
        this.directionO = directionO;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.xO, this.yO, this.widthO, this.heightO);
    }

    public void update(int delta){
        float move = (float)delta/this.speed;
        if(directionO==1){
            this.yO += move;
        }
        if(directionO==2){
            this.yO -= move;
        }
        if(directionO==1){
            this.widthO += 0.1;
            this.heightO += 0.1;
        }
    }
}
