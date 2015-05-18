package fr.iutvalence.info.m2103.project.rushhour;

// TODO (done) rename class
// TODO (done) fix comment
/**
 * This class create an instance of game
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class RushHourGame {
	
	private final Grid grid;
	

	// TODO (done) fix naming conventions
	
	/**
	 * constructor with all features for the game
	 */
	public RushHourGame() 
	{
		this.grid = new Grid(new Car[] {
				new Car(true, 2, Color.getRandomColor(), 1, 1),
				new Car()//To complete
				
		});
		for(int line; line < Grid.DEFAULT_LENGTH; line++)
		{
			for (int column; column < Grid.DEFAULT_WIDTH; column++)
			{
				grid.getCase(line, column).placeCar(new Car(true, 2, Color.getRandomColor()));
			}
		}
	}
	
	/**
	 * Method which launch the game
	 */
	public void play() 
	{
		
	}
}
