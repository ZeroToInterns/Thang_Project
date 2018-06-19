
public class ElectricCar {
	private int maxRange;
	private int currentRange;
	private String make;
	
	//construct the electric car with the company name and the max number of mile a car can go when fully charged
	public ElectricCar(String make, int maxRange) 
	{
		this.make = make;
		this.maxRange = maxRange;
		this.currentRange = 0; //this car is uncharged when created
	}
	
	//fully charge the car
	public void charge()
	{
		this.currentRange = this.maxRange;
	}
	
	//when the car drive, the current range is decreased
	public void drive(int miles)
	{
		if (miles > this.currentRange) { //or (miles > this.getCurrentRange());
			System.out.println("You don't have enough gas");
		}
		this.currentRange = this.currentRange - miles;
	}
	
	//return the maker of the car
	public String getMake()
	{
		return this.make;
	}
	
	//return the current range of the car
	public int getCurrentRange()
	{
		return this.currentRange;
	}
	
	//return the max range of the car
	public int getMaxRange()
	{
		return this.maxRange;
	}
}
