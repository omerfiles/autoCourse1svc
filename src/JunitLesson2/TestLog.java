package JunitLesson2;

import java.util.ArrayList;
import java.util.List;

public class TestLog {

	List<LogStep> logSteps;

	public TestLog() {
		
		logSteps=new  ArrayList<LogStep>();

	}
	
	public void addStep(String stepDescription){
		this.logSteps.add(new LogStep(stepDescription));
	}
	
	

}
