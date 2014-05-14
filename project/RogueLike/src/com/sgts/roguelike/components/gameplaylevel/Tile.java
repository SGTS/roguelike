package com.sgts.roguelike.components.gameplaylevel;

import java.util.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.badlogic.gdx.math.Vector2;
import com.sgts.roguelike.components.Spatial2D;
import com.sgts.roguelike.entity.Component;


/**
 * 
 * @author kteynor
 *
 */
public class Tile extends Component {

	private String tileState;
	private Vector2 position;
	
	/**
	 * The length of a tiles side. All tiles are square. 1 = 1 meter. 
	 * A normal human can be considered 2m tall (for the sake of games)
	 */
	public static final int SIDE_LENGTH = 1;
	
	public String getTileState() {
		return tileState;
	}

	public void setTileState(String tileState) {
		this.tileState = tileState;
	}

	public Vector2 getPosition() {
		return position;
	}

	public static List<Spatial2D> getContainedSpatials() {
		
		// TODO: get list of all Spatial2D components
		// find ones inside this tile
		// return those
		
		throw new NotImplementedException();
		
	}
	
}
