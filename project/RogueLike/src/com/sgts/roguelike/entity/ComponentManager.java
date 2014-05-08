package com.sgts.roguelike.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentManager {
	
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
	
	public static void Shutdown() {
		
		// TODO: shutdown all the components and component managers
		
	}
	
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
	
	// TODO: restructure and implement. these don't need to be abstract.
	public static List<ComponentManager> getComponents(){
		return managers;
	}
	public abstract void Update();	
}
