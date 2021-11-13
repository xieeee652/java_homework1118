package java_homework1118;

public class Sample3_6 
{
	public static void main(String[] args)
	{
		Car6 car1 = new Car6();
				
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.setNum(1342);
		car1.setGas(20.5);
	}
}

class Car6
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("car1車號是" + this.num);
		System.out.println("car1汽油量是" + this.gas);
	}
	
	void showCar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為" + num );
		
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為" +  gas );
	}
	
}