package com.sgts.roguelike.entity;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

/**
 * Class 
 * @author Carlos Saavedra
 *
 */
public abstract class Component {
	
	Entity entity;
	
	/**
	 * Creates an instance of the Component class
	 * @return Component
	 */
	public static Component createComponent() {
		Class<Component> componenetClass = Component.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Component component = null;
		
		try {
			component = (Component) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}
	
	/**
	 * Sets the Entity to the component
	 * @param Entity
	 */
	public void setEntity(Entity entity) { 
		this.entity = entity; 
	}
	
	/**
	 * Returns the Entity that the component is attached to
	 * @return integer
	 */
	public Entity getEntity() { 
		return entity; 
	}
	
	/**
	 * Initialize all the properties needed for the component
	 */
	public void Initialize() {}
	
	/**
	 * Clear all the component information
	 */
	public void Shutdown() {}
	
}
