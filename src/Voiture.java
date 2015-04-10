
public class Voiture extends Vehicule
{
	/**
	 * constant which defines car's size
	 */
	private final static int DEFAULT_TAILLE = 2;
	
	
	/**
	 * This constructor allows us to create a new car with a given size and color
	 * @param taille 
	 * @param couleur
	 */
	public Voiture(int taille, Couleur couleur)
	{
		super(Vehicule);
		this.taille = DEFAULT_TAILLE;
		this.couleur = couleur;
	}
	
}
