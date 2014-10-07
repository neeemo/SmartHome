package com.smarthome.helpers;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class StaticSprites {

	public static Sprite test;
	
	public static void initiate(){
		//sprites here
		test = new Sprite(new Texture(Gdx.files.internal("data/maininterface.png")));
	}
	
}
