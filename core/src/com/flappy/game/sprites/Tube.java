package com.flappy.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;


public class Tube {
    private static final int FLUCTUATION = 130;
    private static final int TUBE_GAP = 100;
    private static final int LOWEST_OPENING = 120;
    private Texture topTupe, bottomTube;
    private Vector2 posTopTube, posBotTube;
    private Random rand;

    public Tube(float x){
        topTupe = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");
        rand = new Random();

        posTopTube = new Vector2(x, rand.nextInt(FLUCTUATION) + TUBE_GAP + LOWEST_OPENING);
        posBotTube = new Vector2(x, posTopTube.y - TUBE_GAP - bottomTube.getHeight());
    }

    public Texture getTopTupe() {
        return topTupe;
    }

    public void setTopTupe(Texture topTupe) {
        this.topTupe = topTupe;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public void setBottomTube(Texture bottomTube) {
        this.bottomTube = bottomTube;
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }

    public void setPosTopTube(Vector2 posTopTube) {
        this.posTopTube = posTopTube;
    }

    public Vector2 getPosBotTube() {
        return posBotTube;
    }

    public void setPosBotTube(Vector2 posBotTube) {
        this.posBotTube = posBotTube;
    }
}
