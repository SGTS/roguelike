package com.sgts.roguelike.monster;

import com.sgts.roguelike.components.Movement;
import com.sgts.roguelike.components.Renderable;
import com.sgts.roguelike.components.Stat;
import com.sgts.roguelike.entity.Entity;
import com.sgts.roguelike.entity.EntityManager;

/**
 * 
 * @author Daniel
 * This class is to be used to generate monsters with unique stats.
 * The constructor not used.
 * Each function past the constructor returns a monster, each being different depending on the function used.
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
	
	//Returns a randomized monster with [currently] default picture
	public Entity createRandomMonster() {

		Entity monster = EntityManager.createEntity();
		
		Stat s = new Stat();
		s.setAttackDamage((int)(Math.random() * 10));
		s.setAttackSpeed((float)(Math.random() * 2));
		s.setHealth((int)(Math.random() * 100));
		s.setMovementSpeed((int)(Math.random() * 5));
		s.setLuck(0);
		Movement m = new Movement();
		m.setMovementSpeed(s.getMovementSpeed());
		
		monster.addComponent(Renderable.createComponent());
		monster.addComponent(s);
		monster.addComponent(m);
		
		return monster;
		
	}
	
}
