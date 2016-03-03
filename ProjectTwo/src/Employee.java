
public class Employee {

	private String _employeeName;
	private String _employeeNumber;
	private String _hireDate;
	
	public Employee(){
		
	}
	
	public Employee(String _employeeName, String _employeeNumber, String _hireDate){
		set_employeeName(_employeeName);
		set_employeeNumber(_employeeNumber);
		set_hireDate(_hireDate);
		
		
	}


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
