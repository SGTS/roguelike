package com.sgts.roguelike.level;

public class Cell {
	
	public enum State {
		WALL,
		FLOOR
	}
	
	private State state;
	
	public Cell() {
		this.setState(Cell.State.FLOOR);
	}
	public Cell(Cell.State state) {
		this.setState(state);
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}

}
