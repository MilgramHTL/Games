package at.milgram.games.owngame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Human implements CollisionActor{
    private Image HumanImage;
    private float x,y;
    private Shape shapeHuman;
    private List<CollisionActor> collisionActors;

    public Human() throws SlickException {
        Image tmp = new Image("testdata/human.png");
        this.HumanImage = tmp.getScaledCopy(50,100);
        this.x = 20;
        this.y = 20;

        this.shapeHuman = new Rectangle(this.x,this.y, HumanImage.getWidth(), HumanImage.getHeight());
        this.collisionActors = new ArrayList<>();
    }

    @Override
    public void render(Graphics graphics) {
        this.HumanImage.draw(this.x,this.y);
        graphics.draw(this.shapeHuman);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        checkCollision();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void addCollisionActor(CollisionActor collisionActor) {
        this.collisionActors.add(collisionActor);
    }

    private void checkCollision() {
        for (CollisionActor collisionActor : this.collisionActors) {
            if (collisionActor.getShape().intersects(this.getShape())) {
                System.out.println("Collision...");
            }
        }
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
