package com.sgts.roguelike.level;

import com.google.gson.Gson;
import com.sgts.roguelike.level.Map;
import com.sgts.roguelike.level.Room;

/**
 * Class that generates {@link com.sgts.roguelike.level.Map maps} based on input parameters
 * @author kevinteynor
 * 
 */
public class MapGenerator {
	
	/**
	 * Create a new map
	 * @param size the width and height in cells of the map
	 * @return the new {@link com.sgts.roguelike.level.Map map}
	 */
	public static Map GenerateMap(int size) {
		Map map = new Map();
		
		// TODO: implement
		
		
		return map;
	}
	
	/**
	 * Load a map object from a json string
	 * @param json the json string that contains the map data
	 * @return the loaded map object
	 */
	public static Map LoadMap(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, Map.class);		
	}
}
