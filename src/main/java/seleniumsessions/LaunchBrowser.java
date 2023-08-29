package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// open the browser-chrome,Edge
		
		ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();

		// enter the url:
		driver1.get("https://www.google.com");
		driver2.get("https://www.facebook.com");

		// get the title:
		String title1 = driver1.getTitle();
		System.out.println("act title:" + title1);

		String title2 = driver2.getTitle();
		System.out.println("act title:" + title2);

		// verify the title:
		if (title1.equals("Google")) {
			System.out.println("correct title1");
		} else {
			System.out.println("incorect title1");
		}

		if (title2.equals("Facebook - log in or sign up")) {
			System.out.println("correct title2");
		} else {
			System.out.println("incorect title2");
		}

		driver1.quit();
		driver2.quit();

	}

}
