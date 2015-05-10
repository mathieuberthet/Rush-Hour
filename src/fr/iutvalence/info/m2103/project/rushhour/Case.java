package fr.iutvalence.info.m2103.project.rushhour;
/**
 * a case of the grid
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Case {
	/**
	 * vehicle on the case, null if empty case
	 */
	private Vehicle vehicle;
	
	
	/**
	 * construct an empty case
	 */
	public Case()
	{
		this.vehicle = null;
	}

	/**
	 * get vehicle on the case
	 * @return
	 */
	public Vehicle getVehicle() 
	{
		return vehicle;
	}

	/**
	 * set vehicle on the case
	 * @param vehicle
	 */
	public void setVehicle(Vehicle vehicle) 
	{
		this.vehicle = vehicle;
	}
	
	/**
	 * get the vehicle on the case
	 * @return the vehicle on the case or null if there is no vehicle
	 */
	public Vehicle obtenirVehicle()
	{
		return this.vehicle;
	}
	
	/**
	 * place a vehicle on the case
	 * @param vehicle the vehicle
	 */
	public void placeVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void removeVehicle()
	{
		this.vehicle = null;
	}
	
}
