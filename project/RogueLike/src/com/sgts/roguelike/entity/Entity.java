package com.sgts.roguelike.entity;

import java.util.Hashtable;

public class Entity {
	//Creates components
	//Binds components together
	//Manages components 
	
	int ID;
	
	Hashtable<BasicComponent, Integer> components;
	int componentsSize;
		
	/**
	 * Creates an Entity with default properties
	 */
	public Entity(){
		this.ID = 0;
		componentsSize = 0;
		components = new Hashtable<BasicComponent, Integer>();
	}
	
	/**
	 * Adds component to the Entity and gives that component an ID
	 * @param component - BasicComponent type
	 */
	public void addComponent(BasicComponent component){
		componentsSize++;
		component.entityID = ID;
		components.put(component, componentsSize);
	}
	
	/**
	 * Removes component from the Entity
	 * @param component - BasicComponent type
	 */
	public void removeComponent(BasicComponent component){
		component.entityID = 0;
		components.remove(component);
	}
	
	/**
	 * Removes all components from the Entity
	 */
	public void removeAllComponents(){
		componentsSize = 0;
		components.clear();
	}
	
	/**
	 * Returns Entity's ID
	 * @return integer
	 */
	public int getEntityID(){
		return ID;
	}
	
	/**
	 * 
	 */
	public void Recycle()
	{
		
	}
	
}
