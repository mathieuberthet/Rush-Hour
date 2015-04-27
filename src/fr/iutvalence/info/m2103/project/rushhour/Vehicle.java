package fr.iutvalence.info.m2103.project.rushhour;

/**
 * Define vehicles' features
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */

public abstract class Vehicle
{
	/**
	 * vehicles' size
	 */
	protected int size;
	
	/**
	 * vehicles' color
	 */
	protected Color color;
	
	
	
	public Vehicle()
	{
		this.setSize(size);
		this.setColor(color);
	}
	
	public Vehicle(int size, Color color)
	{
		this.setSize(size);
		this.setColor(color);
	}

	
	/**
	 * Get the color of vehicle
	 * @return color
	 */
	public Color getColor() 
	{
		return color;
	}
	
	/**
	 * Set the color of vehicle
	 * @param color
	 */
	public void setColor(Color color) 
	{
		this.color = color;
	}
	
	/**
	 * Get the size of vehicle
	 * @return size
	 */
	public int getSize() 
	{
		return size;
	}
	
	/**
	 * Set the size of vehicle
	 * @param size
	 */
	public void setSize(int size) 
	{
		this.size = size;
	}
}

