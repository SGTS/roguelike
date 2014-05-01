package com.sgts.roguelike.entity;

public abstract class BasicComponent {
	
	public int entityID;
	
	/**
	 * Returns the ID of the Entity that the component is attached to
	 * @return integer
	 */
	public abstract int getEntityID();
	
	/**
	 * Initialize all the properties needed for the component
	 */
	public abstract void Initialize();
	
	/**
	 * Updates the component properties, functions, etc.
	 */
	public abstract void Update();
	
	/**
	 * Clear all the component information
	 */
	public abstract void Shutdown();
	
}
