package fr.iutvalence.info.m2103.project.rushhour;
/**
 * This is the list of color which can be taken by vehicles
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public enum Color 
{
	/**
	 * tentative de création de nombre aléatoire
	 */
	private static int nombreAleatoire = 0 + (int)(Math.random() * ((11 - 0) + 0))
	//TODO (done) one comment by constant
	/**
	 * In this class we have some colors which can be applied on vehicles
	 * red : main's vehicle color
	 * blue : vehicle's color
	 * green : vehicle's color
	 * yellow : vehicle's color
	 * purple : vehicle's color
	 * pink : vehicle's color
	 * black : vehicle's color
	 * grey : vehicle's color
	 * orange : vehicle's color
	 * silver : vehicle's color
	 * gold : vehicle's colo
	 * skyblue : vehicle's color
	 */
	RED, BLUE, GREEN,  YELLOW, PURPLE, PINK, BLACK, GREY, ORANGE, SILVER, GOLD, SKYBLUE; 

/**
 * Tentative d'association du nombre a une couleur pour obtenir des couleurs aléatoires pour les véhicules
 * @param args
 */
	public static void main(String[] args)
    {
        String Color;
		switch(nombreAleatoire)
		{
			case 0 :
		        Color = "red";
		        break;
			    case 1 :
		        Color = "blue";
		        break;
		    case 2 :
		    	Color = "green";
		        break;
		    case 3 :
		    	Color = "yellow";
		        break;
		    case 4 :
		    	Color = "purple";
		        break;
		    case 5 :
		        Color = "pink";
		        break;
		    case 6 :
		        Color = "black";
		        break;
		    case 7 :
		        Color = "grey";
		        break;
		    case 8 :
		        Color = "orange";
		        break;
		    case 9 :
		        Color = "silver";
		        break;
		    case 10 :
		        Color = "gold";
		        break;
		    case 11 :
		        Color = "skyblue";
		        break;
		}
    }
}
