package com.sgts.roguelike.entity;

/**
 * Abstract Class that contains information necessary for the Components
 * @author Carlos Saavedra
 *
 */
public abstract class Component {
	/**
	 * The parent entity this component is attached to
	 */
	protected Entity entity;
	
	/**
	 * Determines whether this component should be updated in the manager class' update loop.
	 */
	protected boolean active; 
	
	/**
	 * Determines whether this component is able to be recycled when generating a new component.
	 */
	protected boolean disposed;
	
	/**
	 * Checks if the component is currently active
	 * @return true if the component is active, false if it isn't
	 */
	public boolean getActive() {
		// TODO make this first check whether the entity itself is active.
		// if the entity is inactive, then return false.
		// only check this state value if the entity is already active.
		
		return active;
	}
	
	/**
	 * Checks if the component has been disposed (and is ready to be recycled)
	 * @return true if it has, false if it hasn't
	 */
	public boolean getDisposed() {
		return disposed;
	}
	
	/**
	 * sets whether the component is active or not (is updated)
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/**
	 * sets whether the component has been disposed or not (ready to be reused/recycled)
	 * @param disposed
	 */
	public void setDisposed(boolean disposed) {
		this.disposed = disposed;
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
	public void Initialize() {
		active = true;
		disposed = false;
	}
	
	/**
	 * Clear all the component information
	 */
	public void Shutdown() {
		active = false;
		disposed = true;
	}
	
}
