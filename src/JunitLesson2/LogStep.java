package JunitLesson2;

import java.util.List;

public class LogStep {
	
	
	String testId;
	
	String testRunId;
	
	boolean status;
	
	String description;
	
	List<StepAction>stepActions;
	
	public LogStep(String description){
		this.description=description;
	}

}
