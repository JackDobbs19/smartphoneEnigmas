package ch.ceff.labyrinthe.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import ch.ceff.labyrinthe.Labyrinthe;

public class Utils {
    private Utils() {}

    /**
     * Cette méthode retourne l'objet AssetManager de la classe TheorieBase
     * @return AssetManager
     */
    public static AssetManager getAssetManager() {
        return ((Labyrinthe) Gdx.app.getApplicationListener()).getAssetManager();
    }

    /**
     * Cette méthode retourne l'objet SpriteBatch de la classe TheorieBase
     * @return SpriteBatch
     */
    public static SpriteBatch getSpriteBatch() {
        return ((Labyrinthe) Gdx.app.getApplicationListener()).getSpriteBatch();
    }

    /**
     * Cette méthode retourne l'objet ShapeRenderer de la classe TheorieBase
     * @return ShapeRenderer
     */
    public static ShapeRenderer getShapeRenderer() {
        return ((Labyrinthe) Gdx.app.getApplicationListener()).getShapeRenderer();
    }

    /**
     * Cette méthode retourne le signe (-1 ou 1) de l'angle
     * @param angle
     * @return
     */
    public static int sign(float angle) {
        return angle < 0 ? -1 : 1;
    }
}
