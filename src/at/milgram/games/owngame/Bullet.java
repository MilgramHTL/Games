package at.milgram.games.owngame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Bullet implements CollisionActor{
    private float x,y;
    private Shape bulletShape;
    private List<CollisionActor> collisionActorList;

    public Bullet(float x, float y) {
        this.x = x;
        this.y = y;
        this.bulletShape = new Rectangle(this.x,this.y,15,25);
        this.collisionActorList = new ArrayList<>();
    }

    @Override
    public void render(Graphics graphics) {
            graphics.fillOval(this.x, this.y, 10, 20);
            graphics.draw(bulletShape);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
        bulletShape.setY(this.y);
        checkCollision();
    }

    @Override
    public Shape getShape() {
        return null;
    }
    private void addCollisionActor(CollisionActor collisionActor){
        this.collisionActorList.add(collisionActor);
    }

    private void checkCollision() {
        for (CollisionActor collisionActor : this.collisionActorList) {
            if (collisionActor.getShape().intersects(this.getShape())) {
                System.out.println("COLLISION...");
            }
        }
    }
}
