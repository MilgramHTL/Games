package at.milgram.games.firstgame;

import org.newdawn.slick.Graphics;

public class Elipse {
    private float xE;
    private float yE;
    private float speed;
    private float directionE;
    public Elipse(float xE, float yE, float speed, float directionE){
        this.xE = xE;
        this.yE = yE;
        this.speed = speed;
        this.directionE = directionE;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.xE, this.yE, 60, 25);
    }

    public void update(int delta){
        float move = (float)delta/this.speed;
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
}
