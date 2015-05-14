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
	
	// TODO (done) if size and color are fixed, consider declaring field as private ones
	/**
	 * vehicles' size
	 */
	private int size;
	
	/**
	 * vehicles' color
	 */
	private Color color;
	
	private int line;
	
	private int column;
	
	
	/**
	 * create an object vehicle 
	 */
	public Vehicle()
	{
		this.setVertical(Vertical);
		this.setSize(size);
		this.setColor(color);
		this.setLine(line);
		this.setColumn(column);
	}
	/**
	 * create an object vehicle with define both size and color
	 * @param size size's vehicle
	 * @param color color's vehicle
	 */
	public Vehicle(boolean Vertical, int size, Color color, int line, int column)
	{
		this.setVertical(Vertical);
		this.setSize(size);
		this.setColor(color);
		this.setLine(line);
		this.setColumn(column);
	}

	
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
	
	/**
	 * get line
	 * @return line
	 */
	public int getLine() 
	{
		return line;
	}
	
	/**
	 * set line
	 * @param line
	 */
	public void setLine(int line) 
	{
		this.line = line;
	}
	
	/**
	 * get column
	 * @return column
	 */
	public int getColumn() {
		return column;
	}
	
	/**
	 * set column
	 * @param column
	 */
	public void setColumn(int column) {
		this.column = column;
	}
}

