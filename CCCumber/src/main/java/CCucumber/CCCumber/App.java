package CCucumber.CCCumber;

/**
 * Hello world!
 *
 */
public class App implements abc
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        animal();
        App  A = new App();
        A.Animal();
        
    }
    
    public static void animal() {
    	System.out.println("Hellow Animal");
    }

	@Override
	public void Animal() {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int c = a * b;
		System.out.println(c);
		
	}
}
