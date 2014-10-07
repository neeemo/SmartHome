package com.smarthome.screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.smarthome.SmartHome;
import com.smarthome.helpers.StaticSprites;

public class MainInterface extends Screen{

	private SmartHome home;
	private int width, height;
	private Vector3 translationVector;
	private SpriteBatch batcher;
	private float delta;
	
	public MainInterface(SmartHome home){
		this.home = home;
		width = home.width;
		height = home.height;
		batcher = new SpriteBatch();
		translationVector = new Vector3();
		
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		translationVector.set(screenX, screenY, 0);
		Gdx.app.log("MainInterface.class", "X pos: " + Float.toString(translationVector.x));
		Gdx.app.log("MainInterface.class", "Y pos: " + Float.toString(translationVector.y));
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		Gdx.app.log("MainInterface.class", Float.toString(delta));
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		delta = Math.min(Gdx.graphics.getDeltaTime(), 1/60f);
		
	}

	@Override
	public void render() {
		batcher.begin();
		batcher.draw(StaticSprites.test, 0, 0, width, height);
		
		batcher.end();
		
	}

	@Override
	public void enter() {
		Gdx.input.setCatchBackKey(true);
		Gdx.input.setInputProcessor(this);
		
		Gdx.app.log("MainInterface.class", "Screen Width: " + Integer.toString(width));
		Gdx.app.log("MainInterface.class", "Screen Height: " + Integer.toString(height));
		
	}

}