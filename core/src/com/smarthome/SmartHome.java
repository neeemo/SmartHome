package com.smarthome;

import java.util.HashMap;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.smarthome.helpers.StaticSprites;
import com.smarthome.screen.MainInterface;
import com.smarthome.screen.Screen;

public class SmartHome extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	public static final Integer SCREEN_MAININTERFACE = 0;
	
	public HashMap<Integer, Screen> screenList;
	public Screen activeScreen;
	public boolean initiated;
	public int width, height;
	
	public SmartHome(){
		
	}
	
	public void initiate(){
		StaticSprites.initiate();
		initiated = true;
		screenList = new HashMap<Integer, Screen>();
		screenList.put(SCREEN_MAININTERFACE, new MainInterface(this));
		activeScreen = screenList.get(SCREEN_MAININTERFACE);
		activeScreen.enter();
	}
	
	@Override
	public void create () {
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		initiated = false;
	}

	public void setScreen(int id){
		activeScreen = screenList.get(id);
		activeScreen.enter();
	}
	
	public 	Screen getState(int id){
		return screenList.get(id);
	}
	
	@Override
	public void render () {
		GL20 gl = Gdx.graphics.getGL20();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(initiated){
			activeScreen.update();
			activeScreen.render();
		}
		else{
			initiate();
		}
	}
	
	public void resize(int x, int y){
		
	}
	
	public void resume(){
		
	}
	
	public void dispose(){
		
	}
	
	
	
	
}