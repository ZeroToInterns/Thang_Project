public class SodaCan implements Comparable{
	
	//the property of a can as a instance variable
	public static final double DEFAULT_RADIUS = 1.2109;
    public static final double DEFAULT_HEIGHT = 4.704;
    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	public double radius;
	public double height;
	public double content;
	
	//default soda can with a fixed radius and height
	public SodaCan() {
		this.radius = DEFAULT_RADIUS;
		this.height = DEFAULT_HEIGHT;
		this.content = (Math.PI * this.radius * this.radius * this.height) * FLUID_OUNCES_PER_CUBIC_INCHES	;
	}
	
	//soda can constructor with radius and height as the parameter
	public SodaCan(double radius, double height) {
		if (radius < 0 || height < 0) {
			this.radius = 1.2109;
			this.height = 4.704;
		}
		else {
			this.radius = radius;
			this.height = height;
		}
		this.content = (Math.PI * this.radius * this.radius * this.height) * FLUID_OUNCES_PER_CUBIC_INCHES;
		
	}
	
	//get the radius of the can
	public double getRadius() {
		return this.radius;
	}
	
	//get the height of the can
	public double getHeight() {
		return this.height;
	}
	
	//Subtract the amount of content from the fluidOunce when drank
	public void drink(double fluidOunces) {
		content -= fluidOunces;
	}
	
	//Get the content in the can
	public double getContents() {
		return content;
	}
	
	//compare the content of two soda cans
	public int compareTo(Object otherObject) {
		SodaCan other = (SodaCan) otherObject;
		if(this.content > other.getContents()) {
			return 1;
		}
		else if(this.content < other.getContents()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
