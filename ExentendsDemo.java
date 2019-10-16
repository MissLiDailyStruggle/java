class Father {
	private int n;
	Father(int n){
		System.out.println("Father(int n)");
	}
	Father(){
		System.out.println("Father()");
	}
	public int num = 10;
	public void show() {
		System.out.println("show Father");
	}
}

class Son extends Father{
	private int n;
	Son(int n){
		System.out.println("Son(int n)");
	}
	Son(){
		super(300);
		System.out.println("Son()");
	}
	public int num = 20;
	public void methond() {
		int num = 40;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
		System.out.println("method Son");
	}
	public void show() {
		super.show();
		System.out.println("show Son");
	}
}

public class ExentendsDemo {
	public static void main(String[] args) {
		Son s = new Son();
		Son s2 = new Son(20);
		s.show();
		s.methond();
	}

}
