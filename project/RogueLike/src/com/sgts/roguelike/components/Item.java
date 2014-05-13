package com.sgts.roguelike.components;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

import com.sgts.roguelike.entity.Component;

/**
 * 
 * @author Daniel 
 * A component that manages all data regarding items found in the game. Weapons are a combination of this and the Stats Component
 *
 */

public class Item extends Component {

	//Variables
	enum Type{
		ONE_HANDED, TWO_HANDED, SHIELD, CONSUMABLE
	}
	Type itemType;
	
	//Getters and Setters
	public Type getItemType() {
		return itemType;
	}
	public void setItemType(Type itemType) {
		this.itemType = itemType;
	}
	
	/**
	 * Creates an instance of the Movement class
	 * @return Component
	 */	
	public static Component createComponent() {
		Class<Item> componenetClass = Item.class;
		Constructor<?>[] componenetConstructor = componenetClass.getConstructors();
		Item component = null;
		
		try {
			component = (Item) componenetConstructor[0].newInstance();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Cannot create an Component", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		return component;
	}

	//Overridden Functions
	@Override
	public void Initialize() {
		itemType = Type.CONSUMABLE;
	}
}
