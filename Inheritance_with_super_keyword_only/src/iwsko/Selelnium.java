package iwsko;

public class Selelnium extends Automation {
	
	public void m()
	{
		System.out.println("Child Default Method");
	}
	
	public void m1(int a)
	{
		super.a=a;
		System.out.println("Child One Parameterized Method");
		System.out.println("The value is "+a);
	}
	
	public void m2(int a,int b)
	{
		super.method3(a, b, 30);
		super.method();
		super.method1(a);
		super.method2(a,b);
		System.out.println("Child Two Parameterized Method");
	}
	
	public void m3(int a,int b,int c)
	{
		System.out.println("Child Three Parameterized Method");
	}
	
	public static void main(String[] args) {
		
		Selelnium s1=new Selelnium();
		s1.m2(10,20);
		s1.m();
		s1.m3(10,20,30);
		s1.m1(10);
		
		
		
	}
	
	
	

}
