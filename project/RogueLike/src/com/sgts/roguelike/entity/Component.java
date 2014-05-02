package com.sgts.roguelike.entity;

public abstract class Component {
	
	Entity entity;
	
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
