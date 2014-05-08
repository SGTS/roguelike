package com.sgts.roguelike.components;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

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
	
	/**
	 * Creates an instance of the Movement class
	 * @return Component
	 */	
	public static Component createComponent() {
		Class<Movement> componenetClass = Movement.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Movement component = null;
		
		try {
			component = (Movement) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}
	
	//Overridden functions
	@Override
	public void Initialize() {
		movementSpeed = 0;
		velocity = Vector2.Zero;
	}

}
