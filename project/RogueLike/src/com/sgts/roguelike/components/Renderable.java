package com.sgts.roguelike.components;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

import com.badlogic.gdx.graphics.Texture;
import com.sgts.roguelike.entity.Component;

/**
 * 
 * @author Daniel
 * Component used to store the renderable data of an object
 *
 */

public class Renderable extends Component {
	
	//Variables
	Texture texture;
	int width;
	int height;

	//Getters and Setters
	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int Width) {
		this.width = Width;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int Height) {
		this.height = Height;
	}
	
	/**
	 * Creates an instance of the Component class
	 * @return Component
	 */	
	public static Component createComponent() {
		Class<Renderable> componenetClass = Renderable.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Renderable component = null;
		
		try {
			component = (Renderable) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}
	
	//Overridden functions
	@Override
	public void Initialize() {
		texture = null;
		width = 10;
		height = 10;
	}
	
}
