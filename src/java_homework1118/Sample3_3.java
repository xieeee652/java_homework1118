package java_homework1118;

public class Sample3_3 {
	
	public static void main(String[] args)
	{
		Car3 car1 = new Car3();
				
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car3 car2 = new Car3();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("car1�����O" + car1.num);
		System.out.println("car1�T�o�q�O" + car1.gas);
		
		System.out.println("car2�����O" + car2.num);
		System.out.println("car2�T�o�q�O" + car2.gas);
	}
	
}

class Car3
{
	int num;
	double gas;
	
}
