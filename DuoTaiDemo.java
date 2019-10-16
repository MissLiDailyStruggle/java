class Fu
{
	public void show()
	{
		System.out.println("show Fu");
	}
}
class Zi extends Fu
{
	public void show()
	{
		System.out.println("show Zi");
	}
	public void method()
	{
		System.out.println("method Zi");
	}
	
}
public class DuoTaiDemo 
{
	public static void main(String[] args)
	{
		Fu f = new Zi();
		f.show();
		//f.method();
		Zi e = new Zi();
		e.show();
		e.method();
		Zi z = (Zi)f;
		z.show();
		z.method();
	}
}
