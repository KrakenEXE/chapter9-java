package projectThree;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// Create production object
				
				int day = 1;
				int night = 2;
				
				
				ProductionWorker productionWorker = new ProductionWorker(day, 10.50, "Sam", "123-A", "Januray 10, 2014");
				TeamLeader teamLeader = new TeamLeader(night, 15.30, "Jimmy", "987-B", "March 24, 1997", 5, 16, 200);
				productionWorker.getEmployeeInfo();
	}

}
