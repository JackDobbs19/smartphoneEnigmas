package ch.ceff.labyrinthe.screen.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import ch.ceff.labyrinthe.entity.Ball;

public class GameController {
    public static final String TAG = GameController.class.getSimpleName();

    public boolean isTouch = false;
    private Ball ball;

    public GameController() {
        ball = new Ball();
    }

    public void update(float delta) {

    }

    public boolean touchDown(Vector2 touchpos, int pointer, int button) {
        ball.setPosition(touchpos);
        Gdx.app.log(TAG, "x: " + touchpos.x + ", y: " + touchpos.y);
        return true;
    }

    public boolean touchUp() {
        isTouch = false;
        return true;
    }

    public boolean touchDragged(Vector2 touchpos, int pointer) {
        isTouch = false;
        return true;
    }

    public Ball getBall() {
        return ball;
    }
}
