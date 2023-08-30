package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MytestListenerr implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("test failed will be taken screenshot");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
