package fr.iutvalence.info.m2103.project.rushhour;

/**
 * Define vehicles' features
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */

public abstract class Vehicle
{
	/**
	 * vehicle's orientation
	 */
	private boolean Vertical;
	

	/**
	 * get orientation
	 * @return
	 */
	public boolean isVertical() 
	{
		return Vertical;
	}
	
	public void setVertical(boolean vertical) 
	{
		Vertical = true;
	}

	// TODO (done) if size and color are fixed, consider declaring field as private ones
	/**
	 * vehicles' size
	 */
	private int size;
	
	/**
	 * vehicles' color
	 */
	private Color color;
	
	
	/**
	 * create an object vehicle 
	 */
	public Vehicle()
	{
		this.setVertical(Vertical);
		this.setSize(size);
		this.setColor(color);
	}
	/**
	 * create an object vehicle with define both size and color
	 * @param size size's vehicle
	 * @param color color's vehicle
	 */
	public Vehicle(boolean Vertical, int size, Color color)
	{
		this.setVertical(Vertical);
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

