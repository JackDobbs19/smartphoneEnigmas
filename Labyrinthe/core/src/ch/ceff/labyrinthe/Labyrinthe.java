package ch.ceff.labyrinthe;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;

import java.util.EnumMap;

import ch.ceff.labyrinthe.config.GameConfig;
import ch.ceff.labyrinthe.screen.game.GameScreen;

public class Labyrinthe extends Game {
	private static final String TAG = Labyrinthe.class.getSimpleName();

	private AssetManager assetManager;		//Gestionnaire des ressources
	private SpriteBatch spriteBatch; 		//Affichage des BMP (PNG)
	private ShapeRenderer shapeRenderer;	//Affichage des formes géométriques

	//Structure de stockage des fenêtres de l'application
	//Map est une structure qui utilise le stockage : <clé><valeur>
	private FitViewport screenViewport;
	
	@Override
	public void create () {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);

		shapeRenderer = new ShapeRenderer();

		setScreen(new GameScreen());
	}

	@Override
	public void render () {
		super.render();
	}

	public FitViewport getScreenViewport() {
		return screenViewport;
	}

	@Override
	public void dispose () {

	}

	public AssetManager getAssetManager() {
		return assetManager;
	}

	public SpriteBatch getSpriteBatch() {
		return spriteBatch;
	}

	public ShapeRenderer getShapeRenderer() {
		return shapeRenderer;
	}
}
