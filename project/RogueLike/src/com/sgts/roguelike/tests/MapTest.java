package com.sgts.roguelike.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sgts.roguelike.level.Map;

public class MapTest {
	
	@Test
	public void testConstructor() {
		Map map = new Map();
		
		assertEquals(10, map.getWidth());
		assertEquals(10, map.getHeight());
		assertEquals(100, map.getArea());
		
		String serialized = map.serialize();
		
		System.out.println(serialized);
	}
}