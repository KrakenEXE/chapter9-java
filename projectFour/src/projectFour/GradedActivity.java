package projectFour;

public class GradedActivity {

	private int _finalGrade;
	private String _letterGrade;
	public GradedActivity(){
		
	}
	
	public GradedActivity(int grammar, int spelling, int length, int content){
		
		set_finalGrade(grammar+spelling+length+content);
		if(get_finalGrade() < 60){
			set_letterGrade("F");
		}
		else if(get_finalGrade() <70 && get_finalGrade() >=60){
			set_letterGrade("D");
		}
		else if(get_finalGrade() < 80 && get_finalGrade() >=70){
			set_letterGrade("C");
		}
		else if(get_finalGrade() < 90 && get_finalGrade() >= 80){
			set_letterGrade("B");
		}
		else{
			set_letterGrade("A");
		}
	}

	public int get_finalGrade() {
		return _finalGrade;
	}

	public void set_finalGrade(int _finalGrade) {
		this._finalGrade = _finalGrade;
	}

	public String get_letterGrade() {
		return _letterGrade;
	}

	public void set_letterGrade(String _letterGrade) {
		this._letterGrade = _letterGrade;
	}
}
