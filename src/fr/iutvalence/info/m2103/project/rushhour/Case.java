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
	 * car on the case, null if empty case
	 */
	private Car car;

	/**
	 * truck on the case, null if empty case
	 */
	private Truck truck;
	
	
	/**
	 * construct an empty case
	 */
	public Case()
	{
		this.vehicle = null;
	}

	/**
	 * get vehicle on the case
	 * @return vehicle
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
	 * get the car on the case
	 * @return car
	 */
	public Car getCar() 
	{
		return car;
	}

	/**
	 * set the car on case
	 * @param car
	 */
	public void setCar(Car car) 
	{
		this.car = car;
	}
	/**
	 * get the car on the case
	 * @return the car on the case or null if there is no car
	 */
	public Car obtenirCar()
	{
		return this.car;
	}
	
	
	/**
	 * get the truck on the case
	 * @return truck
	 */
	public Truck getTruck() {
		return truck;
	}

	/**
	 * set the truck on the case
	 * @param truck
	 */
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	
	/**
	 * get the truck on the case
	 * @return the truck on the case or null if there is no truck
	 */
	public Truck obtenirTruck()
	{
		return this.truck;
	}
	/**
	 * place a vehicle on the case
	 * @param vehicle the vehicle
	 */
	public void placeVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	
	/**
	 * remove a vehicle from a case
	 */
	public void removeVehicle()
	{
		this.vehicle = null;
	}
	
	/**
	 * place a car on the case
	 * @param car the car
	 */
	public void placeCar(Car car)
	{
		this.car = car;
	}
	
	/**
	 * remove car from the case
	 */
	public void removeCar()
	{
		this.car = null;
	}
	
	/**
	 * place a Truck on a case
	 * @param truck the truck
	 */
	public void placeTruck(Truck truck)
	{
		this.truck = truck;
	}
	
	/**
	 * remove a truck from a case
	 */
	public void removeTruck()
	{
		this.truck = null;
	}
}
