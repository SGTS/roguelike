package com.sgts.roguelike.entity;

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
		
		//Class clazz = Class.forName("com.sgts.roguelike.entity.Entity");
		
		return instance;
	}
	
	//private Entity
}
