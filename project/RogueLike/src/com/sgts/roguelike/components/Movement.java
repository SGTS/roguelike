package com.sgts.roguelike.components;

import com.badlogic.gdx.math.Vector2;
import com.sgts.roguelike.entity.Component;
/**
 * 
 * @author Daniel
 * Component to be used for manipulating the position of an entity.
 *
 */
public class Movement extends Component {
	
	//Variables
	int movementSpeed;
	Vector2 velocity;
	
	//Getters and Setters
	public int getMovementSpeed() {
		return movementSpeed;
	}
	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}
	public Vector2 getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}
	
	//Overridden functions
	@Override
	public void Initialize() {
		movementSpeed = 0;
		velocity = Vector2.Zero;
	}

}
