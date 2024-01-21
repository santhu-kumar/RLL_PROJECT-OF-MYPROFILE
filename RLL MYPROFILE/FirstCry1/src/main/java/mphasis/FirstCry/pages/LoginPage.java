package mphasis.FirstCry.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	private WebDriverWait wait;
	
	@FindBy(xpath = "/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")
	private WebElement login;
	
	@FindBy(id = "lemail")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div/div[3]/span")
	private WebElement clickcontinue;
	
	
	@FindBy(xpath = "//div[contains(@class, 'B14_white comm-btn btn-login-continue')]")
	private WebElement Submit;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
//		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void EnterEmail(String u)
	{
		email.sendKeys(u);
	}
	
	public void Continue() throws InterruptedException
	{
		clickcontinue.click();
		//wait(60);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Submit.click();
	}
	
}