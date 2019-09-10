
public class Driver {
	
	public static void main (String[] args) {
		IterativeMathLib iterationLibrary= new IterativeMathLib();
		
		RecursiveMathLib recursiveLibrary = new RecursiveMathLib();
		System.out.println("---- Recursion ---");
		runTestCode(recursiveLibrary);
		
		System.out.println("----Iteration-----");
		runTestCode(iterationLibrary);
		
		
	}
	public static void runTestCode(MathLib library) {
		System.out.println("GCD(4,2)="+library.gcd(4,2));
	}
}
