// TODO move this class in a package (fr.iutvalence.info.m2103.project.rushhour sounds good)
// TODO write a comment
public abstract class Vehicule
{
	// TODO simplify comment
	// TODO rename field
	/**
	 * define vehicles' size
	 */
	private int taille;
	
	// TODO simplify comment
	// TODO rename field
	/**
	 * attribute which apply a color on a vehicle
	 */
	private Couleur couleur;
	
	// TODO write a comment
	public Vehicule(int taille, Couleur couleur)
	{
		this.taille= taille;
		this.couleur= couleur;
	}
	
	// TODO simplify comment
	// TODO rename method
	/**
	 * With this method we can get color of the vehicle
	 * @return the color of the vehicle
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}
	
	// TODO simplify comment
	// TODO rename method
	/**
	 * With this method we can get the size of the vehicle
	 * @return vehicle's size
	 */
	public int obtenirTaille()
	{
		return this.taille;
	}
}
