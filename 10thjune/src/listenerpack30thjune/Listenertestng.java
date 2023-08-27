package listenerpack30thjune;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenertestng implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Tc is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tc is skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Tc is passed");
	}

}
