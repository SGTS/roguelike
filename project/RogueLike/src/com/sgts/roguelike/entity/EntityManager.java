package com.sgts.roguelike.entity;

/**
 * 
 * @author Carlos Saavedra
 *
 */
public class EntityManager {
	private static EntityManager instance = null;
	
	/**
	 * Exists only to defeat instantiation
	 */
	protected EntityManager(){}
	
	/**
	 * Returns the Entity Manager instance
	 * @return EnitityManager
	 */	
	public static EntityManager getInstance() {
		if(instance == null){
			instance = new EntityManager();
		}	
				
		return instance;
	}
	
}
