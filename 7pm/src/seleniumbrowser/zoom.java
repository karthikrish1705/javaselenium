package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//100%=> nrml
		// greater than 100=> zoom in
		// less than 100 => zoom out
		
		ob.executeScript("document.body.style.zoom='200%'"); // zoom in
		
		Thread.sleep(3000);
		
		
		ob.executeScript("document.body.style.zoom='100%'"); // nrml
		
		Thread.sleep(3000);
		
		
		ob.executeScript("document.body.style.zoom='20%'"); // zoom out
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}
