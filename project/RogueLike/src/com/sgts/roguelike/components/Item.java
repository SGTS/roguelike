package com.sgts.roguelike.components;

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

	//Overridden Functions
	@Override
	public void Initialize() {
		itemType = Type.CONSUMABLE;
	}
}
