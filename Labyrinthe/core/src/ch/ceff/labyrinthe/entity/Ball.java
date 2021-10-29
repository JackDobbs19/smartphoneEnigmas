package ch.ceff.labyrinthe.entity;

import com.badlogic.gdx.math.Vector2;

public class Ball {
    private Vector2 position;
    private int size;

    public Ball() {
        this.position = new Vector2(2, 2);
        this.size = 20;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
