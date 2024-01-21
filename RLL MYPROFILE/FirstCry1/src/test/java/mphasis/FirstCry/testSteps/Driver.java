package mphasis.FirstCry.testSteps;



import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

import mphasis.FirstCry.pages.EditAddressBook;
import mphasis.FirstCry.pages.HoverMouse;
import mphasis.FirstCry.pages.LoginPage;


public class Driver extends Tools
{
	protected static LoginPage login;
	protected static HoverMouse hovermouse;
//	protected static EditAddressBook addressBook;
	protected static EditAddressBook editaddressBook;
	public static void init()
	{
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.firstcry.com/");
	 login = new LoginPage(driver);
	 hovermouse = new HoverMouse(driver);
//	 addressBook = new EditAddressBook(driver);
     editaddressBook = new EditAddressBook(driver);
	}
	
}