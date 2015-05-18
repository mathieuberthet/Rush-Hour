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
	public final static int DEFAULT_LENGTH = 6;

	/**
	 * Define the width of the grid
	 */
	public final static int DEFAULT_WIDTH = 6;

	/**
	 * Grid cells
	 */
	// TODO (done) this is not a grid but a grid of grid (of grid...)
	private Car[] cars;

	/**
	 * Create a new empty board
	 */
	public Grid(Car[] cars) {
		this.cars = cars;
	}

	/**
	 * get the case of the grid for a given position
	 * 
	 * @param position
	 *            the position
	 * @return the case of the grid for a given position
	 */
	public Case getCase(Position position) {
		return this.cars[position.getLineNumber()][position.getColumnNumber()];
	}

	/**
	 * get the case of the grid for a given position
	 * 
	 * @param position
	 *            the position
	 * @return the case of the grid for a given position
	 */
	public Case getCase(int ligne, int colonne) {
		return this.cars[ligne][colonne];
	}

	/**
	 * Get the vehicle place on a given position
	 * 
	 * @param position
	 *            the position
	 * @return the vehicle on the case or null if we have nothing
	 */
	public Vehicle getVehicle(Position position) {
		return getCase(position).obtenirVehicle();
	}

	/**
	 * Move a vehicle
	 * 
	 * @param positionStart
	 *            start position
	 * @param positionEnd
	 *            end position
	 */
	public void deplaceVehicle(Position positionStart, Direction direction,
			int distance) {
		Vehicle vehicleADeplacer = this.getVehicle(positionStart);
		if (vehicleADeplacer == null)
			return;
		
		if ((direction == Direction.E || direction == Direction.W)
				&& this.getVehicle(positionStart).isVertical())
			return;
		
		if ((direction == Direction.N || direction == Direction.S)
				&& !this.getVehicle(positionStart).isVertical())
			return;
		
		// Test for a vehicule presence
		if (this.getVehicle(new Position(positionStart.getLineNumber() + 1,
				positionStart.getColumnNumber())) != null && direction == Direction.S) 
		{
			this.moveVehicle(positionStart,
					new Position(positionStart.getLineNumber() + 1,
							positionStart.getColumnNumber()));
			return;
		}
		if (this.getVehicle(new Position(positionStart.getLineNumber(),
				positionStart.getColumnNumber() + 1)) != null && direction == Direction.E) 
		{
			this.moveVehicle(
					positionStart,
					new Position(positionStart.getLineNumber(), positionStart
							.getColumnNumber() + 1));
			return;
		}
		if (this.getVehicle(new Position(positionStart.getLineNumber() - 1,
				positionStart.getColumnNumber())) != null && direction == Direction.N) 
		{
			this.moveVehicle(positionStart,
					new Position(positionStart.getLineNumber() - 1,
							positionStart.getColumnNumber()));
			return;
		}
		if (this.getVehicle(new Position(positionStart.getLineNumber(),
				positionStart.getColumnNumber() - 1)) != null && direction == Direction.W) 
		{
			this.moveVehicle(
					positionStart,
					new Position(positionStart.getLineNumber(), positionStart
							.getColumnNumber() - 1));
			return;
		}

	}

	/**
	 * move a vehicule
	 * @param positionStart
	 * @param position
	 */
	private void moveVehicle(Position positionStart, Position position) {
		Vehicle temporaryVehicle = this.getVehicle(positionStart);
		this.getCase(positionStart).removeVehicle();
		this.getCase(positionStart)
				.placeVehicle(temporaryVehicle);
	}

	/**
	 * Get a representation in Ascii art for the grid
	 */
	public String toString() {
		String GridAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < DEFAULT_LENGTH; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < DEFAULT_WIDTH; numeroDeColonne++)
				GridAsciiArt += this.getCase(new Position(numeroDeLigne,
						numeroDeColonne));
			GridAsciiArt += "\n";
		}
		return GridAsciiArt;
	}

}
