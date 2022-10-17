package testNGProgram;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersCLASS implements ITestListener {
@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test Started " +result.getName());
	ITestListener.super.onTestStart(result);
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test is getting success");
	ITestListener.super.onTestSuccess(result);
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test is getting Failure" +result.getName());
	ITestListener.super.onTestFailure(result);
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test passed but with certain percentage" +result.getName());
	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedWithTimeout(result);
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onStart(context);
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onFinish(context);
}
}
