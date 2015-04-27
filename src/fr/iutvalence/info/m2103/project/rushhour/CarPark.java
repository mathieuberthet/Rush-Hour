package fr.iutvalence.info.m2103.project.rushhour;
/**
 * Define the board for the game
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class CarPark 
{
	/**
	 * Define the length of the grid
	 */
	private final static int DEFAULT_LENGTH = 6;
	
	/**
	 * Define the width of the grid
	 */
	private final static int DEFAULT_WIDTH = 6;
	
	/**
	 * The case of the grid
	 */
	private CarPark[][] cases;
	
	/**
	 * Create a new empty board
	 */
	public CarPark()
	{
		this.createBoard();
	}
	
	/**
	 * Method which create a new plateau 
	 */
	public void createBoard()
	{
		this.cases = new CarPark[DEFAULT_LENGTH][DEFAULT_WIDTH];
	}

}
