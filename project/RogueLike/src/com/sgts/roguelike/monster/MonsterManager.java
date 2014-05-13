package com.sgts.roguelike.monster;

import java.util.Random;

import com.sgts.roguelike.components.Movement;
import com.sgts.roguelike.components.Renderable;
import com.sgts.roguelike.components.Stat;
import com.sgts.roguelike.entity.Entity;
import com.sgts.roguelike.entity.EntityManager;

/**
 * 
 * @author Daniel
 * This class is to be used to generate monsters with unique stats.
 * The constructor is to be called first to initialize the variables before it calls a random generation.
 * Finally a monster will be returned for use.
 *
 */

public class MonsterManager {
	
	//Constructor
	public MonsterManager() {
		
	}
	
	//Base Create Monster function that returns a default monster
	public Entity createMonster() {
		
		Entity monster = EntityManager.createEntity();
		
		monster.addComponent(Renderable.createComponent());
		monster.addComponent(Stat.createComponent());
		monster.addComponent(Movement.createComponent());
		
		return monster;
		
	}
	
	public Entity createRandomMonster() {
		
		Random rand = new Random();
		Entity monster = EntityManager.createEntity();
		
		monster.addComponent(Renderable.createComponent());
		monster.addComponent(Stat.createComponent());
		monster.addComponent(Movement.createComponent());
		
		//Add random stats to the monster
		
		return monster;
		
	}
	
}
