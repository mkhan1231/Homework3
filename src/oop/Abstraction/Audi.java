package oop.Abstraction;

public class Audi extends MotorCar{


	public void strat() {
		System.out.println("This is Audi start engine");
	}
	
	public void stop() {	
		System.out.println("This is Audi stop engine");
	}
	
	public void run() {	
		System.out.println("This is how Audi runs");
		
	}
	//public abstract void autoAlarm();
	
	public void bodyMessage() {
		System.out.println("I want body message option in audi car");
		
	}

	public void autoTemp() {
		System.out.println("I want auto temparature control in my car");
		
	}
	
	public void autoAlarm() {
		System.out.println("I want alarm option for unauthorized interfere with my audi car");	
		
	}
	
	public void motorEngine() {
		System.out.println("I want motor engine in my audi car");
	}

}
