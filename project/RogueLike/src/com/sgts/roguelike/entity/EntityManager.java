package com.sgts.roguelike.entity;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
	
	/**
	 * Collection that stores all instantiated Entities
	 */
	private static List<Entity> entities = new ArrayList<Entity>();
	
	public static List<Entity> getEntities() {
		return entities;
	}

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
		
		entities.add(entity);
		
		return entity;
	}
	
}
