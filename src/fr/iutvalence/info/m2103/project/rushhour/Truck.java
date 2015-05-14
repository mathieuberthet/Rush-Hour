package fr.iutvalence.info.m2103.project.rushhour;

/**
 * 
 * We define the truck as a special kind of vehicle
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Truck extends Vehicle
{
	/**
	 * truck's size
	 */
	private final static int DEFAULT_SIZE = 3;

	/**
	 * This constructor allows us to create a new truck with a given size and color
	 * @param size the size of the truck
	 * @param color the color of the truck
	 */
	public Truck(boolean Vertical, int size, Color color, int line, int column)
	{
		super(Vertical, DEFAULT_SIZE, color, line, column);
	}
}