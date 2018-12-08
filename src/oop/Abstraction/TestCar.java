package oop.Abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car =new Audi();
		car.strat();
		car.stop();
		car.run();
		
		MotorCar motorcar=new Audi();
		motorcar.run();
		motorcar.stop();
		motorcar.strat();
		motorcar.motorEngine();
		motorcar.autoAlarm();
		
		Audi audi=new Audi();
		audi.run();
		audi.stop();
		audi.strat();
		audi.motorEngine();
		audi.autoAlarm();
		

	}

}
