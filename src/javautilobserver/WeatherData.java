package javautilobserver;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){}
	
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurementsChanged(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	public float getTemperature()
	{	
		return temperature;
	}
	
	public float getHumidity()
	{
		return humidity;
	}
	
	public float getPressure()
	{
		return pressure;
	}
	
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
