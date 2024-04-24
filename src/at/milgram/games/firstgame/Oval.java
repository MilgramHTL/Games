package at.milgram.games.firstgame;

import org.newdawn.slick.Graphics;

public class Oval {
    private float xO;
    private float yO;
    private float speed;
    private float directionO;
    public Oval(float xO, float yO, float speed, float directionO){
        this.xO = xO;
        this.yO = yO;
        this.speed = speed;
        this.directionO = directionO;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.xO, this.yO, 40, 40);
    }

    public void update(int delta){
        float move = (float)delta/this.speed;
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
    }
}
