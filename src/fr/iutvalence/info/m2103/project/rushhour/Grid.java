package fr.iutvalence.info.m2103.project.rushhour;

/**
 * Define the board for the game
 * 
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Grid {
	/**
	 * Define the length of the grid
	 */
	private final static int DEFAULT_LENGTH = 6;

	/**
	 * Define the width of the grid
	 */
	private final static int DEFAULT_WIDTH = 6;

	/**
	 * Grid cells
	 */
	// TODO (done) this is not a grid but a grid of grid (of grid...)
	private Vehicle[][] cases;

	/**
	 * Create a new empty board
	 */
	public Grid() {
		this.cases = new Vehicle[DEFAULT_LENGTH][DEFAULT_WIDTH];
	}

	private Vehicle obtenirCase(int numeroDeLigne, int numeroDeColonne) {
		return this.cases[numeroDeLigne][numeroDeColonne];
	}

	public String toString()
	{
		String GridAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < DEFAULT_LENGTH; numeroDeLigne++) 
		{
			for (int numeroDeColonne = 0; numeroDeColonne < DEFAULT_WIDTH; numeroDeColonne++)
				GridAsciiArt += this.obtenirCase(numeroDeLigne, numeroDeColonne);
			GridAsciiArt += "\n";
		}
		return GridAsciiArt;
	}

}
