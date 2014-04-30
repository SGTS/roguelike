package com.sgts.roguelike.entity;

public abstract class BasicComponent {
	
	public int entityID;
	
	public abstract int getEntityID();
	public abstract void Initialize();
	public abstract void Update();
	public abstract void Shutdown();
	
}
