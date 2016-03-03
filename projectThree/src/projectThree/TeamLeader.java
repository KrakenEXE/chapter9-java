package projectThree;

public class TeamLeader extends ProductionWorker {

	private int _requiredTraining;
	private int _attendedTraining;
	private double _monthlyBonus;
	
	public TeamLeader(int shift, double payRate, String _employeeName, String _employeeNumber, String _hireDate, int _requiredTraining, int _attendedTraining, double _monthlyBonus) {
		super(shift, payRate, _employeeName, _employeeNumber, _hireDate);
		this._requiredTraining = _requiredTraining;
		this._attendedTraining = _attendedTraining;
		this._monthlyBonus = _monthlyBonus;
	}

	public int get_requiredTraining() {
		return _requiredTraining;
	}

	public void set_requiredTraining(int _requiredTraining) {
		this._requiredTraining = _requiredTraining;
	}

	public int get_attendedTraining() {
		return _attendedTraining;
	}

	public void set_attendedTraining(int _attendedTraining) {
		this._attendedTraining = _attendedTraining;
	}

	public double get_monthlyBonus() {
		return _monthlyBonus;
	}

	public void set_monthlyBonus(double _monthlyBonus) {
		this._monthlyBonus = _monthlyBonus;
	}
	
	
}
