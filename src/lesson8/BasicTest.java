package lesson8;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import JunitLesson2.TestLog;

public class BasicTest {

	String testId;
	String testName;
	TestReporter testReporter;

	public TestLog testlog;

	@Before
	public void setup() {
	}

	@Rule
	TestWatcher testWatcher = new TestWatcher() {

		@Override
		protected void failed(Throwable e, Description description) {
			super.failed(e, description);
		}

		@Override
		protected void starting(Description description) {
			super.starting(description);
		}
	};

	@After
	public void tearDown() {

	}
}
