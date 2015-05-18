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
				new Car(true, 2, Color.getRandomColor(), 2, 3),
				new Car(false, 2, Color.getRandomColor(), 6, 1),
				new Car(false, 2, Color.getRandomColor(), 3, 1),
				new Car(true, 2, Color.getRandomColor(), 3, 5),
				new Car(false, 2, Color.getRandomColor(), 5, 6),
				
		});
	}
	
	/**
	 * Method which launch the game
	 */
	public void play() 
	{
		
	}
}
