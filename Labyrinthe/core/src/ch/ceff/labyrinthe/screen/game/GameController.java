package ch.ceff.labyrinthe.screen.game;

import com.badlogic.gdx.math.Vector2;

public class GameController {
    public boolean isTouch = false;
    public void update(float delta) {

    }

    public boolean touchDown(Vector2 touchpos, int pointer, int button) {
        isTouch = true;
        return true;
    }

    public boolean touchUp() {
        isTouch = false;
        return true;
    }

}
