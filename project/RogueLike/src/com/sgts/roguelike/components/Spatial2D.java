package com.sgts.roguelike.components;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

import com.badlogic.gdx.math.Vector2;
import com.sgts.roguelike.entity.Component;

/**
 * 
 * @author kteynor
 *
 */
public class Spatial2D extends Component {

	private Vector2 position;
	// TODO: figure out if GDX uses radians or degrees
	private float rotation;
	private Vector2 scale;
	
	@Override
	public void Initialize() {
		position = Vector2.Zero;
		rotation = 0;
		scale = new Vector2(1, 1);
	}
	
	public Vector2 getPosition() {
		return position;
	}
	public void setPosition(Vector2 position) {
		this.position = position;
	}
	public float getRotation() {
		return rotation;
	}
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	public Vector2 getScale() {
		return scale;
	}
	public void setScale(Vector2 scale) {
		this.scale = scale;
	}
	
	/**
	 * Creates an instance of the Component class
	 * @return Component
	 */
	
	public static Component createComponent() {
		Class<Spatial2D> componenetClass = Spatial2D.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Spatial2D component = null;
		
		try {
			component = (Spatial2D) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}
	
}
