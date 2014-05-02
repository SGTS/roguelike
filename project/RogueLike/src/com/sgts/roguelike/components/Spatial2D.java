package com.sgts.roguelike.components;

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
	
}
