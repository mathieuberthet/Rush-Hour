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
	 * Method which launch the game
	 */
	public void play() 
	{
		
	}
	
	public RushHourGame() 
	{
		this.grid = new Grid();
		for(int ligne; ligne < Grid.DEFAULT_LENGTH; ligne++)
		{
			for (int colonne; colonne < Grid.DEFAULT_WIDTH; colonne++)
			{
				grid.obtenirCase(ligne, colonne).placeVehicle(new Vehicle(true, 2, Color.getRandomColor(), Position.obtenirPosition()));
			}
		}
	}

}
