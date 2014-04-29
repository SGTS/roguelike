package Entity;

import java.util.HashMap;

public class Entity 
{
	//Creates components
	//Binds components together
	//Manages components 
	
	public HashMap<BasicComponent, Integer> components;
	int componentsSize;
		
	public Entity()
	{
		componentsSize = 0;
		components = new HashMap<>();
	}
	
	/**
	 * Adds component to the Entity and gives that component an ID
	 * @param component
	 */
	public void addComponent(BasicComponent component)
	{
		components.put(component, componentsSize);
		componentsSize++;
	}
	
	/**
	 * Removes component from the Entity
	 * @param component
	 */
	public void removeComponent(BasicComponent component)
	{
		components.remove(component);
	}
	
	// TODO Figure a way to get the corresponding components and all components
	
	//public Component getComponent(String name)
	//{
	//		
	//}
	//	
	//public Component getComponents()
	//{
	//		
	//}
}
