package java_homework1118;

public class Sample3_24 
{
	public static void main(String[] args)
    {
		Car24[] car1 = new Car24[3];
		
		for(int i = 0 ;i < car1.length ; i ++) 
			car1[i] = new Car24();
		car1[0].setCar(1234,20.5);
		car1[1].setCar(1234,30.5);
		car1[2].setCar(1234,40.5);
		
		for(int i=0;i<car1.length;i++)
			car1[i].show();	
    }

}

class Car24
{
	private int num;
	private double gas;

	public Car24()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
		
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}
