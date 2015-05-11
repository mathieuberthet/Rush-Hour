package fr.iutvalence.info.m2103.project.rushhour;
import java.util.Random;

/**
 * This is the list of color which can be taken by vehicles
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public enum Color 
{

	//TODO (done) one comment by constant
	/**
	 * In this class we have some colors which can be applied on vehicles
	 * blue : vehicle's color
	 * green : vehicle's color
	 * yellow : vehicle's color
	 * purple : vehicle's color
	 * pink : vehicle's color
	 * black : vehicle's color
	 * grey : vehicle's color
	 * orange : vehicle's color
	 * silver : vehicle's color
	 * gold : vehicle's color
	 * skyblue : vehicle's color
	 */
	RED, BLUE, GREEN,  YELLOW, PURPLE, PINK, BLACK, GREY, ORANGE, SILVER, GOLD, SKYBLUE;
	
	public static Color getRandomColor()
	{
		int numberOfColors = Color.values().length;
		int random = new Random().nextInt(numberOfColors);
		return Color.values()[random];
	}
}