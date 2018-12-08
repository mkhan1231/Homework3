package oop.Polymorphism;

public class TestCar {

	public static void main(String[] args) {
		
	//Mercedes mcr1 =new Mercedes();
	//System.out.println("This is from MERCEDES : "+mcr1.anyFeature(7, 8, 9,10));
	
	BMW bmw=new BMW();	
	System.out.println(bmw.anyFeature(7, 8, 9,10));
	
	BMW mcr2=new Mercedes();
	System.out.println(mcr2.anyFeature(100, 200, 300, 400));
	
	}

}
