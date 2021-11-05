package ch.ceff.labyrinthe.config;

public class GameConfig {
    ///Fenêtre
    public static final String TITLE = "Labyrinthe";
    public static final int WIDTH = 1080; //1280;
    public static final int HEIGHT = 1920; //960;

    ///Monde
    public static final float PPM = 100; ///Pixels Per Meter --> 50px = 1m
    public static final float WORLD_WIDTH = WIDTH / PPM;
    public static final float WORLD_HEIGHT = HEIGHT / PPM;
    public static final float GAME_SIZE = 100;
    public static final float GAME_BORDER_LEFT = (WORLD_WIDTH - GAME_SIZE) / 2f;
    public static final float GAME_BORDER_BOTTOM = (WORLD_HEIGHT - GAME_SIZE) / 2f;


}
