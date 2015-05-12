package fr.iutvalence.info.m2103.project.rushhour;

/**
 *  We define the car as a special kind of vehicle
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Car extends Vehicle
{
	/**
	 * constant which defines car's size
	 */
	protected final static int DEFAULT_SIZE = 2;
	
	/**
	 *  create a new car 
	 * @param size the size of the car
	 * @param color the color of the car
	 */
	public Car(boolean Vertical, int size, Color color, Position position)
	{
		super(Vertical, DEFAULT_SIZE, color, position);
	}
}
