package java_homework1118;

public class Sample3_2 
{
	public static void main(String[] args)
	{
		Car2 car1 = new Car2();
				
		car1.num = 1234;
		car1.gas = 20.5;
		System.out.println("car1�����O" + car1.num);
		System.out.println("car1�T�o�q�O" + car1.gas);
	}
}

class Car2
{
	int num;
	double gas;
	
}

