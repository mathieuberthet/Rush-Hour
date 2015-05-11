package fr.iutvalence.info.m2103.project.rushhour;

public class MainCar extends Car
{
	public MainCar(int size)
	{
		super(DEFAULT_SIZE, Color.RED);
	}
	
	public Case placeMainCar(Position position)
	{
		return this.obtenirCase(2, position.obtenirNumeroDeColonne());
	}
}
