
public abstract class Vehicule
{
	/**
	 * define vehicles' size
	 */
	private int taille;
	
	/**
	 * attribute which apply a color on a vehicle
	 */
	private Couleur couleur;
	
	
	public Vehicule(int taille, Couleur couleur)
	{
		this.taille= taille;
		this.couleur= couleur;
	}
	/**
	 * With this method we can get color of the vehicle
	 * @return the color of the vehicle
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}
	
	/**
	 * With this method we can get the size of the vehicle
	 * @return vehicle's size
	 */
	public int obtenirTaille()
	{
		return this.taille;
	}
}
