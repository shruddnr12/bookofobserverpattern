package bookofobserverpattern;

import java.util.ArrayList;


public class WeatherData implements Subject {
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData()
	{
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if( i >= 0){
			observers.remove(i);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurementsChanged(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		
	}
	
	

	public void notifyObservers() {
		for(int i = 0 ; i < observers.size(); i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity,pressure);
		}
	}
	
//	public float getTemperature()
//	{
//		
//		return 0.5f;
//	}
//	
//	public float getHumidity()
//	{
//		return 0.5f;
//	}
//	
//	public float getPressure()
//	{
//		return 0.5f;
//	}
	
//	public void measurementsChanged()
//	{
////		float temp = getTemperature();
////		float humidity = getHumidity();
////		float pressure = getPressure();
////		
//		currentConditionDisplay.update(temp, humidity, pressure);
//		//statisticsDisplay.update(temp, humidity, pressure);
//		//forecastDisplay.update(temp,humidity,pressure);
//		
//		
//	}
}
