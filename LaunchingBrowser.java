package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cr= new ChromeDriver();
		cr.get("https://www.youtube.com/");
		cr.quit();
		//System.out.println("Hii");
		
	}

}
