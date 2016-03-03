
public class DriverClass {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
			// Create production object
			
			int day = 1;
			int night = 2;
			
			
			ShiftSupervisor supervisor= new ShiftSupervisor("Gerald", "345-B", "March 20, 1995", 30000.00, 450000);
			
			System.out.print(supervisor.toString());
	}
}
