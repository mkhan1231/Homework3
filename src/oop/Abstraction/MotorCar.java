package oop.Abstraction;

public abstract class MotorCar implements Car, DreamCar {
	
	public void motorEngine() {
		System.out.println("This is motor engine in abstract class");
	}
	
	public abstract void autoAlarm();

}
