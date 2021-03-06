package com.sgts.roguelike.components;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

import com.sgts.roguelike.entity.Component;
/**
 * 
 * @author Daniel
 * Component that houses all of the statistics that a monster or player might have.
 *
 */

public class Stat extends Component {

	//Variables
	int health;
	int attackDamage;
	float attackSpeed;
	int movementSpeed;
	//Player Only Stat
	int luck;
	
	//Getters and Setters
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttackDamage() {
		return attackDamage;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	public float getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getMovementSpeed() {
		return movementSpeed;
	}
	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	/**
	 * Creates an instance of the Component class
	 * @return Component
	 */	
	public static Component createComponent() {
		Class<Stat> componenetClass = Stat.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Stat component = null;
		
		try {
			component = (Stat) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}
	
	//Overridden Functions
	@Override
	public void Initialize() {
		health = 10;
		attackDamage = 5;
		attackSpeed = 0.5f;
		movementSpeed = 5;
		luck = 0;
	}
	
}
