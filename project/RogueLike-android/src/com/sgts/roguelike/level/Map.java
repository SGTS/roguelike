package com.sgts.roguelike.level;

import com.sgts.roguelike.level.Cell;
import com.badlogic.gdx.math.Vector2;

/**
 * class that contains all of the cells for a single level.
 * @author Kevin Teynor
 * 
 */
public class Map {
	
	
	protected Cell[][] cells;
	
	/**
	 * Creates a new map that is 10x10 cells large
	 */
	public Map() {
		cells = new Cell[10][10];
	}
	/**
	 * Creates a new square map
	 * @param size : number of cells wide and tall the map is
	 */
	public Map(int size) {
		cells = new Cell[size][size];
	}
	/**
	 * Creates a new rectangular map
	 * @param width : number of cells wide the map is 
	 * @param height : number of cells tall the map is
	 */
	public Map(int width, int height) {
		cells = new Cell[height][width];
	}
	
	/**
	 * Get the nearest cell to a position
	 * @param position the position to find a cell at
	 * @return {@link #com.sgts.roguelike.level.Cell Cell} closest to the position
	 */
	public Cell getCellFromPosition(Vector2 position) {
		Cell cell = null;
		
		// TODO: implement
		
		return cell;
	}
	
}