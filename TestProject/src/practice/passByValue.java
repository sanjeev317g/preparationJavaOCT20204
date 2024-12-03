package practice;

public class passByValue {
	int i;
	public passByValue(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	public static void main(String args[]) {
		
		int a = 10;
		System.out.println(a);
		addition(a);
		System.out.println(a);
	}
	
	public static void addition(int a) {
		a=20;
		System.out.println(a);
	}
	
	public void subtraction(passByValue p) {
		passByValue sub = new passByValue(20);
		
	}

}
