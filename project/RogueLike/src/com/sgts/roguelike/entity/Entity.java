package com.sgts.roguelike.entity;

import java.lang.reflect.Constructor;
import java.util.Hashtable;

import javax.swing.JOptionPane;
/**
 * Class that creates an Object that keeps track of the components
 * @author Carlos Saavedra
 *
 */
public class Entity {
	
	int ID;
	
	Hashtable<Component, Integer> components;
	int componentsSize;	
	
	/**
	 * Creates an instance of the Entity class
	 * @return
	 */
	public static Entity createEntity() {
		Class<? extends Entity> entityClass = Entity.class;
		Constructor<?>[] entityConstructor = entityClass.getConstructors();
		Entity entity = null;
		
		try {
			entity = (Entity) entityConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Entity", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return entity;
	}
	
	/**
	 * Creates an Entity with default properties
	 */
	private Entity() {
		this.ID = 0;
		componentsSize = 0;
		components = new Hashtable<Component, Integer>();	}
	
	/**
	 * Adds component to the Entity and gives that component an ID
	 * @param component - BasicComponent type
	 */
	public void addComponent(Component component) {
		componentsSize++;
		component.entity = this;
		components.put(component, componentsSize);
	}
	
	/**
	 * Removes component from the Entity
	 * @param component - BasicComponent type
	 */
	public void removeComponent(Component component) {
		component.entity = null;
		components.remove(component);
	}
	
	/**
	 * Removes all components from the Entity
	 */
	public void removeAllComponents() {
		componentsSize = 0;
		components.clear();
	}
	
	/**
	 * Sets the Entity's ID
	 * @param integer
	 */
	public void setEntityID(int id) {
		ID = id;
	}
	
	/**
	 * Returns the Entity's ID
	 * @return integer
	 */
	public int getEntityID() {
		return ID;
	}	
}
