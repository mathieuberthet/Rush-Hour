package fr.iutvalence.info.m2103.project.rushhour;
/**
 * Define the board for the game
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Grid 
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
	private Grid[][] grid;
	
	/**
	 * Create a new empty board
	 */
	public Grid()
	{
		this.grid = new Grid[DEFAULT_LENGTH][DEFAULT_WIDTH];
	}
	
	private Grid obtenirCase(int numeroDeLigne, int numeroDeColonne)
	{
		return this.grid[numeroDeLigne][numeroDeColonne];
	}

		public String toString()
		{
			String GridAsciiArt = "";

			for (int numeroDeLigne = 0; numeroDeLigne < DEFAULT_LENGTH; numeroDeLigne++)
			{
				for (int numeroDeColonne = 0; numeroDeColonne < DEFAULT_WIDTH; numeroDeColonne++)
					GridAsciiArt += obtenirCase(numeroDeLigne, numeroDeColonne);
				GridAsciiArt += "\n";
			}

			return GridAsciiArt;
		}


}
