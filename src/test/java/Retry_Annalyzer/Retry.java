package Retry_Annalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	
	int intitialCount = 0;
	int maxCount = 5;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (intitialCount<maxCount) {
			intitialCount++;
			return true;
		}
		return false;
	}

}
