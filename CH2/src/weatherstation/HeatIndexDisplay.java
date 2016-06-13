package weatherstation;

public class HeatIndexDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	public HeatIndexDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("HeatIndex:"
				+ computeHeatIndex(temperature, humidity));
	}

	private float computeHeatIndex(float t, float rh) {
		float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh)
				- (0.100254 * t * rh) + (0.00941695 * (t * t))
				+ (0.00728898 * (rh * rh)) + (0.000345372 * (t * t * rh))
				- (0.000814971 * (t * rh * rh))
				+ (0.0000102102 * (t * t * rh * rh))
				- (0.000038646 * (t * t * t)) + (0.0000291583 * (rh * rh * rh))
				+ (0.00000142721 * (t * t * t * rh))
				+ (0.000000197483 * (t * rh * rh * rh))
				- (0.0000000218429 * (t * t * t * rh * rh)) + 0.000000000843296 * (t
				* t * rh * rh * rh)) - (0.0000000000481975 * (t * t * t * rh
				* rh * rh)));
		return index;
	}

}
