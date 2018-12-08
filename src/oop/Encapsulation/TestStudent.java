package oop.Encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1=new Student();
		st1.setStudID(1001);
		st1.setCountryOrigin("Finland");
		st1.setSex('F');		
		System.out.println(st1.getStudID());
		System.out.println(st1.getCountryOrigin());
		System.out.println(st1.getSex());
		st1.getCitizenUS(false);
		System.out.println(st1.getCitizenUS(false));
		
		Student st2=new Student();
		st2.setStudID(1002);
		st2.setCountryOrigin("Iran");
		st2.setSex('M');
		System.out.println(st2.getStudID());
		System.out.println(st2.getCountryOrigin());
		System.out.println(st2.getSex());


	}

}
