package com.sgts.roguelike.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentManager<E extends Component> {
	
	/**
	 * Collection that stores all instantiated ComponentManagers,
	 * which is used when updating them.
	 */
	private static List<ComponentManager> managers = new ArrayList<ComponentManager>();
	
	/**
	 * Updates all the ComponentManagers in the aggregate managers collection.
	 * Calls update in the order that the managers were added.
	 */
	public static void UpdateManagers() {
		
		for(ComponentManager cm : managers) {
			cm.Update();
		}		
	}
	
	/**
	 * Get the container list of all component managers
	 * @return the list of all ComponentManagers
	 */
	public static List<ComponentManager> GetComponentManagers(){
		return managers;
	}
	
	/**
	 * Shuts down all component managers
	 */
	public static void Shutdown() {
		
		// TODO: shutdown all the components and component managers
		
	}
	
	
	// --------------------------------------------------------
	
	
	/**
	 * Base constructor for ComponentManager class.
	 * It adds this manager to the aggregate collection of managers.
	 * If the manager was already added somehow then it will not be added again.
	 */
	public ComponentManager() {
		if(!managers.contains(this)) {
			managers.add(this);
		}
	}
	
	/**
	 * Update gets called every game loop for each ComponentManager
	 * This is where the behavior for the components is defined. The component itself
	 * should only be a collection of data, that the manager can use however it needs to.
	 * TODO: Implement a priority for order of updates for different component types.
	 */
	public abstract void Update();
	
	/**
	 * Get a reference to a blank (ready-to-be-used) component inside the component manager.
	 * This system allows for easy implementation of object pooling if desired. 
	 * @return a defaulted component that is a member of the ComponentManager's collection of components.  
	 */
	public abstract E GenerateComponent();
}
