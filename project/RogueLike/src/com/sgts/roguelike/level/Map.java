package com.sgts.roguelike.level;

import com.sgts.roguelike.entity.ComponentManager;
import com.sgts.roguelike.level.Cell;
import com.badlogic.gdx.math.Vector2;
import com.google.gson.Gson;

// TODO: replace cell references with the new Tile.

/**
 * class that contains all of the cells for a single level.
 * @author Kevin Teynor
 * 
 */
public class Map extends ComponentManager {
	
	protected int width;
	protected int height;
	protected Cell[][] cells;
	
	/**
	 * Creates a new map that is 10x10 cells large
	 */
	public Map() {
		width = height = 10;
		
		cells = new Cell[height][width];
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				cells[y][x] = new Cell();
			}
		}
	}
	/**
	 * Creates a new square map
	 * @param size : number of cells wide and tall the map is
	 */
	public Map(int size) {
		width = height = size;
		
		cells = new Cell[height][width];
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				cells[y][x] = new Cell();
			}
		}
	}
	/**
	 * Creates a new rectangular map
	 * @param width : number of cells wide the map is 
	 * @param height : number of cells tall the map is
	 */
	public Map(int width, int height) {
		this.width = width;
		this.height = height;
		
		cells = new Cell[height][width];
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				cells[y][x] = new Cell();
			}
		}
	}
	
	/**
	 * get the width in cells of the map.
	 * @return the width of the map
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * get the height in cells of the map.
	 * Assumes the map is rectangular, which it always should be.
	 * @return the height of the map
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * get the area in cells of the map.
	 * Assumes the map is rectangular, which it always should be.
	 * @return
	 */
	public int getArea() {
		return width * height;
	}
	
	/**
	 * Get the {@link #com.sgts.roguelike.level.Cell cell} specified by the grid coordinates
	 * @param x the cell's place in its row
	 * @param y the cell's place in its column
	 * @return the denoted cell
	 */
	public Cell getCell(int x, int y) {
		return cells[y][x];
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
	
	public String serialize() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}