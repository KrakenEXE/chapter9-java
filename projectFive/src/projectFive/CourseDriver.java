package projectFive;

public class CourseDriver extends FinalExam {

	public static void main(String[] args) {
		
		CourseGrades gradeOutput = new CourseGrades();
		
		GradedActivity GradedActivityObject = new GradedActivity();
		PassFailExam PassFailExamObject = new PassFailExam();
		Essay EssayObject = new Essay();
		FinalExam FinalExamObject = new FinalExam();
		
		//GradedActivity grades;
		//PassFailExam passFailExam;
		//Essay essay;
		//FinalExam finalExam;
		
		//GradedActivityObject.setLab();
		//PassFailExamObject.setPassFailExam(100);
		//EssayObject.setEssay(100);
		//FinalExamObject.setFinalExam(97);
		
		gradeOutput.setLab(GradedActivityObject);
		gradeOutput.setPassFailExam(PassFailExamObject);
		gradeOutput.setEssay(EssayObject);
		gradeOutput.setFinalExam(FinalExamObject);
		System.out.print(gradeOutput.toString());
	}

}
