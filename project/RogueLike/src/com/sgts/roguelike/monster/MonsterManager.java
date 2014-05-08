package com.sgts.roguelike.monster;

import com.sgts.roguelike.components.Movement;
import com.sgts.roguelike.components.Renderable;
import com.sgts.roguelike.components.Stat;
import com.sgts.roguelike.entity.Entity;

/**
 * 
 * @author Daniel
 * This class is to be used to generate monsters with unique stats.
 * The constructor is to be called first to initialize the variables before it calls a random generation.
 * Finally a monster will be returned for use.
 *
 */

public class MonsterManager {

	//Variables
	private Entity monster = null;
	
	//Constructor
	public MonsterManager() {
		this.monster = Entity.createEntity();
		this.monster.addComponent(Renderable.createComponent());
		this.monster.addComponent(Stat.createComponent());
		this.monster.addComponent(Movement.createComponent());
	}
	
	//Getters and Setters
	public Entity getMonster() {
		return monster;
	}
	public void setMonster(Entity newMonster) {
		this.monster = newMonster;
	}

	//Generates a blank monster for custom creation
	public Entity generateBlankMonster() {
		
		return this.monster;
	}
	
	//Call this to generate a new monster
	public Entity generateMonster() {
		
		
		Entity tempMonster = monster;
		cleanMonster();
		return tempMonster;
	}
	
	//Function called to clear out the monster so it will not remain the same monster after each call.
	private void cleanMonster() {
		this.monster = null;
	}
	
}
