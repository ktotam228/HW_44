package core;

import org.openqa.selenium.WebDriver;

public class Main {
	static long start;
	static long finish;
	static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Browser: HtmlUnit");
		start = System.currentTimeMillis();
		SignUp.validate(driver, "https://www.ebay.com/myb/Summary?MyEbay&gbh=1");
		Confirmation.validate(driver, "https://www.ebay.com/myb/Summary?MyEbay&gbh=1");
		finish = System.currentTimeMillis();
		System.out.println("Response time: " + (finish - start) + " ms");
		Common.quite();
	}

}
