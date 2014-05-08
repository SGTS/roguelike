package com.sgts.rougelike.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.sgts.roguelike.entity.Component;
/**
 * 
 * @author JoshuaSalazar
 * TouchComponent 
 * give entity for the ability to get where the player touches and moves to.  
 *
 */

public class TouchControls extends Component implements InputProcessor
{
	private Texture playerTexture;
	private Sprite playerSprite;
	private int stageWidth, stageHeight;
	private float movePercentage;
	private Vector2 touchPosition;
	private float velocity;
		
	@Override
	public void Initialize() 
	{
		stageWidth = Gdx.graphics.getWidth();
		stageHeight = Gdx.graphics.getHeight();
		
		movePercentage = 0;
		velocity = 10;
		
		//This is just set a default texture which is the libgdx test image
		playerTexture = new Texture(Gdx.files.internal("data/libgdx.png"));
		playerSprite = new Sprite(playerTexture);
		playerSprite.setPosition(stageWidth/2 - playerSprite.getWidth()/2,
				stageHeight/2 - playerSprite.getHeight()/2);
		
		Gdx.input.setInputProcessor(this);
	}

	public void render() 
	{	
		Vector2 playerPosition = new Vector2(playerSprite.getX(), playerSprite.getY());
		
		//Gets the location the player should move to according to the touch position.
		Vector2 moveLocation = new Vector2(touchPosition.x - playerSprite.getWidth()/2, 
					Gdx.graphics.getHeight() - touchPosition.y - playerSprite.getHeight()/2);
		playerPosition.lerp(moveLocation, movePercentage);
		
		playerSprite.setPosition(playerPosition.x , playerPosition.y);
		
		//Used to lerp to next position. 1 mean that it has arrived to position. 
		if(movePercentage <= 1)
			movePercentage += 0.001f * velocity;
	}
	
	//It's called everytime player touches the screen and gets the touch position of the screen 
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{	
		//MovePercentage is used to reset the lerp
		movePercentage = 0;
		setTouchPosition(new Vector2(screenX, screenY));		
		return false;
	}
	
	public Vector2 getTouchPosition() {
		return touchPosition;
	}

	public void setTouchPosition(Vector2 touchPosition)
	{
		this.touchPosition = touchPosition;
	}
	
	public void setTexture(Texture texture)
	{
		playerTexture = texture;
	}
	
	public Texture getTexture()
	{
		return playerTexture;
	}
	
	public void setSprite(Sprite sprite)
	{
		 playerSprite = sprite;
	}
	
	public Sprite getSprite()
	{
		return playerSprite;
	}
	
	public void setVelocity(float velocity)
	{
		this.velocity = velocity;
	}
	
	public float getVelocity()
	{
		return velocity;
	}
	
	//The methods down here I am not using but are part of the InputProcessor
	public boolean keyDown(int keycode)
	{
		return false;
	}

	public boolean keyUp(int keycode) {
		return false;
	}

	public boolean keyTyped(char character) {
		return false;
	}
	
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	public boolean touchDragged(int screenX, int screenY, int pointer) 
	{	
		return false;
	}

	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	public boolean scrolled(int amount) {
		return false;
	}
}
