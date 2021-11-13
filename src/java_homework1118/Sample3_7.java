package java_homework1118;

public class Sample3_7 
{
	public static void main(String[] args)
	{
		Car7 car1 = new Car7();
				
		int number = 1234;
		double gasline = 20.5;
		
		car1.setNumGas(number,gasline);
		
	}
}

class Car7
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("car1車號是" + this.num);
		System.out.println("car1汽油量是" + this.gas);
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num  + "，將汽油量設為" +  gas );
	}
}