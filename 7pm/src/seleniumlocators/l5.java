package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//css: casecade style sheet
		// manual : 7 ways
		// shortcut: copy => copyselector
		
		//1. tagname and id           syntax: tagname#id
		
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname and classname    syntax: tagname.classname
		
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hi");
		
		//3. tagname and attribute   syntax: tagname[attribute='value']
		//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4. tagname, classname and attribute   syntax: tagname.classname[attribute='value']
		
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//5. tagname and prefix of attribute   syntax: tagname[attribute^='prefix']
		// type=te
		
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//6. tagname and suffix of attribute   syntax: tagname[attribute$='suffix']
		// type=xt
		
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		//7. tagname and substring of attribute  syntax: tagname[attribute*='substring']
		//type=ex
		
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//copy=> copy selector
		
		ob.findElementByCssSelector("#user").sendKeys("hi");
		
	}
	

}
