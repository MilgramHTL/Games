package at.milgram.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle {
    private float x;
    private float y;
    private float speed;
    private float direction = 1;

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
    }
}
