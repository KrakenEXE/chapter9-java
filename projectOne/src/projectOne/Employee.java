package projectOne;

public class Employee {

	private String _employeeName = "Sam";
	private String _employeeNumber = "123-B";
	private String _hireDate = "Januray 20, 2010";
	
	public Employee(){
		
	}
	
	//public Employee(String _employeeName, String _employeeNumber, String _hireDate){
	//	this._employeeName = _employeeName;
//		this._employeeNumber = _employeeNumber;
	//	this._hireDate = _hireDate;
		
		
//	}


	public String get_employeeName() {
		return _employeeName;
	}

	public void set_employeeName(String _employeeName) {
		this._employeeName = _employeeName;
	}

	public String get_employeeNumber() {
		return _employeeNumber;
	}

	public void set_employeeNumber(String _employeeNumber) {
		this._employeeNumber = _employeeNumber;
	}

	public String get_hireDate() {
		return _hireDate;
	}

	public void set_hireDate(String _hireDate) {
		this._hireDate = _hireDate;
	}
}