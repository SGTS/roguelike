package com.sgts.roguelike.entity;

import java.util.Hashtable;

public class Entity {
	
	int ID;
	
	Hashtable<Component, Integer> components;
	int componentsSize;
		
	/**
	 * Creates an Entity with default properties
	 */
	public Entity() {
		this.ID = 0;
		componentsSize = 0;
		components = new Hashtable<Component, Integer>();
	}
	
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
