package projectFive;

public class CourseGrades {

	public GradedActivity[] grades = new GradedActivity[4]; 
	double labs, exam, essay, finalExam;
	
	GradedActivity GradedActivityObject;
	PassFailExam PassFailExamObject;
	Essay EssayObject;
	FinalExam FinalExamObject;
	//general constructor for CourseGrades
	
	public CourseGrades(){
		
	}	
	
	public void setLab(GradedActivity GradedActivity){
		GradedActivityObject = new GradedActivity();
		GradedActivityObject.setScore(75);
		
		grades[0] = GradedActivityObject;
	}
	
	public void setPassFailExam(PassFailExam PassFailExam){
		PassFailExamObject = new PassFailExam();
		PassFailExamObject.setScore(85);
		
		grades[1] = PassFailExamObject;
	}
	
	public void setEssay(Essay Essay){
		EssayObject = new Essay();
		EssayObject.setScore(100);
		
			grades[2] = EssayObject;
		}
	
	public void setFinalExam(FinalExam FinalExam){
		FinalExamObject = new FinalExam();
		FinalExamObject.setScore(95);
		
			grades[3] = FinalExamObject;
		}
	
	public String toString(){
		
		String str = "Your score for your labs was "+grades[0].getScore()+
				"\nYour score for your Pass Fail exam was "+grades[1].getScore()+"\nYour score for your Essay was "+grades[2].getScore()+
				"\nYour score for your Final Exam was "+grades[3].getScore();
		
		return str;
	}
}
