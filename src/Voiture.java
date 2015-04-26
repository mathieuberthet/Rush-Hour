// TODO move this class in a package (fr.iutvalence.info.m2103.project.rushhour sounds good)
// TODO write a comment
public class Voiture extends Vehicule
{
	// TODO simplify comment
	// TODO rename constant
	/**
	 * constant which defines car's size
	 */
	private final static int DEFAULT_TAILLE = 2;
	
	// TODO simplify comment
	/**
	 * This constructor allows us to create a new car with a given size and color
	 * @param taille 
	 * @param couleur
	 */
	public Voiture(int taille, Couleur couleur)
	{
		// TODO ask me to discuss about it
		super(Vehicule);
		
		// TODO (think about it) this class has no field called taille
		this.taille = DEFAULT_TAILLE;
		
		// TODO (think about it) this class has no field called couleur
		this.couleur = couleur;
	}
	
}
