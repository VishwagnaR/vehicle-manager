public class Vehicle {
	
	public static void main(String[] args) {
		
		ElectricEngine e = new ElectricEngine();
		
		e.start();
		e.stop();
		System.out.println("Hello");
		
		HydrogenEngine he = new HydrogenEngine();
		he.start();
		he.stop();
	}
}