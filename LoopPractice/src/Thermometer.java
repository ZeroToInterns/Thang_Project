
public class Thermometer {
	
	private int temperature;
	

	public void raiseTemp() {
		if (temperature > 90) {
			//when temperature is over 90
			while(temperature > 90) {
				temperature--;
			}
		}
		else {
			//when temperature is less than 90
			while(temperature < 90) {
				temperature++;
			}
		}
			
	}
}
