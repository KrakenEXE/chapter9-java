package projectOne;

public class ProductionWorker extends Employee{

	private int _shift;
	private double _payRate;


	ProductionWorker(int shift, double payRate){
		_payRate = payRate;
		_shift = shift;
		
		
	}

	public void getEmployeeInfo(){
		System.out.println("Employee name : " + get_employeeName() + " Employee Number : "+get_employeeNumber() + " Hire Date : "+ get_hireDate() + " Shift : " + get_shift() + " Pay Rate : " + get_payRate());
	}

	public int get_shift() {
		return _shift;
	}


	public void set_shift(int _shift) {
		this._shift = _shift;
	}


	public double get_payRate() {
		return _payRate;
	}


	public void set_payRate(double _payRate) {
		this._payRate = _payRate;
	}
	
	
}
