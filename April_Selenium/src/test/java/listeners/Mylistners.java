package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
		System.out.println("Test has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Testcase passed succesfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase failed");
		
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
