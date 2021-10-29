package ch.ceff.labyrinthe.screen.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import ch.ceff.labyrinthe.Labyrinthe;
import ch.ceff.labyrinthe.config.GameConfig;
import ch.ceff.labyrinthe.entity.Ball;
import ch.ceff.labyrinthe.util.Utils;

public class GameScreen extends ScreenAdapter {
    private final GameController controller;
    private final Viewport gameViewport;
    private final SpriteBatch spriteBatch;
    private final ShapeRenderer shapeRenderer;
    private final Ball ball;

    private final Vector2 touchpos; //1 copie

    public GameScreen() {
        controller = new GameController();
        gameViewport = new FillViewport(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, new OrthographicCamera());
        spriteBatch = Utils.getSpriteBatch();
        shapeRenderer = Utils.getShapeRenderer();

        ball = new Ball();

        touchpos = new Vector2();

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                touchpos.set(screenX,screenY);
                gameViewport.unproject(touchpos); //point de click --> m
                return controller.touchDown(touchpos, pointer, button);
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                touchpos.set(screenX,screenY);
                gameViewport.unproject(touchpos); //point de click --> m
                return controller.touchUp();
            }
        });
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255, 0,0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        controller.update(delta);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.circle(2, 2, ball.getSize());
        shapeRenderer.end();
    }
}
