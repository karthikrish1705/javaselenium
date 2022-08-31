package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		// css : cascade style sheet
		//syntax  : 7 ways 
		//shortcut :copy=> copy selector
		//1. tagname and id    syntax: tagname#id
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		// 2. tagname and classname   syntax: tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hi");
		
		// 3. tagname and atttibute   syntax: tagname[attribute='value']
		//type=text
		//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4. tagname, classname and attribute  syntax: tagname.classname[attribute='value']
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//5.tagname and  prefix of atttibute   syntax: tagname[attribute^=' prefix value']
		//type=te
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//6.tagname and suffix of atttibute   syntax: tagname[attribute$=' suffix value']
		//type=xt
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		//7.tagname and substring of atttibute   syntax: tagname[attribute*=' substring value']
		//type=ex
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//copy=> copy selector
		
		ob.findElementByCssSelector("#user").sendKeys("hi");
		
	}

}
