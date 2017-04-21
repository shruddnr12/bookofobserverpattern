package javautilobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionDisplay(Observable o){
		this.observable= o;
		observable.addObserver(this);
	}
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
		 WeatherData weatherData = (WeatherData)obs;
		this.temperature = weatherData.getTemperature(); 
		this.humidity = weatherData.getHumidity();
		display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions:" + temperature + "F degree and " + humidity + "% humidity");
	}
}
