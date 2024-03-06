package OpenWeather.ZenoAssigment;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainUtility.Reuse;

public class HomePage extends Reuse
{

	public WebDriver driver;

//	JavascriptExecutor js =  (JavascriptExecutor)driver;
	public HomePage(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// driver.findElement(By.xpath("//li[@class='logo']")).click();

	@FindBy(xpath = "//li[@class='logo']")
	WebElement mainLogo;

	@FindBy(xpath = "//input[@placeholder='Search city']")
	WebElement textFieldtwo;

	@FindBy(xpath="//table[@class='table']/tbody/tr/td[2]/b[2]/i") 
	WebElement  weatherStatus;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[2]/p[1]")
	WebElement weatherStatustwo;
	
	@FindBy(xpath="(//div[@class='bold'])[1]")
	WebElement searchDetails;
	
	
	@FindBy(xpath = "//ul[@class='search-dropdown-menu']/li")
	WebElement dropone;

	@FindBy(xpath = "//ul[@class='weather-items text-container orange-side standard-padding']/li")
	List<WebElement> list;

	@FindBy(tagName = "a")
	WebElement cityNameTest;

	@FindBy(xpath = "//input[@type='text']")
	WebElement textField;

	public void weatherInYourCity(String city) throws InterruptedException 
	{
		
	try {
		mainLogo.click();
		textField.sendKeys(city, Keys.ENTER); // here we are testing with top search field 
		Thread.sleep(5);
		String weatherData = weatherStatus.getText();
		String weatherDatatwo = weatherStatustwo.getText();
		System.out.println(weatherData);
		System.out.println(weatherDatatwo);
		}
	catch (Exception e)
	{
		System.out.println("invalid city ");
		
	}
				
	}
	
	

//	
	public void weatherdetail(String city) throws InterruptedException {
		Thread.sleep(5);

//		JavascriptExecutor js =  (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(10,10)");

		mainLogo.click();

		textFieldtwo.sendKeys(city, Keys.ENTER);  // here we are testing with second  search field 

		clickElement(dropone);

		String cityWeatherDetails = searchDetails.getText();

		System.out.println(cityWeatherDetails);
		

	}

	
	public void cityDetail(String city)
	{
		mainLogo.click();

		textFieldtwo.sendKeys(city, Keys.ENTER);  // here we are testing with second  search field for the display of

		clickElement(dropone);
		
	}
	
	
//		*******************Test Code*********************
//		String alertText = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
//		Thread.sleep(5);
//		System.out.println("inside city method");
//		System.out.println(alertText);
//		if(alertText.equals("Not found"));
//		{
//		System.out.println("Invalid location");
//		}
//		System.out.println("valid location");
//		System.out.println("inside city method");
//		String checkCityName = cityNameTest.getText();
//		String checkCityNametwo = cityNameTest.get
//		System.out.println("inside city method");

//	public void weatherdetail1(String city) 
//	{
//		textFieldtwo.sendKeys(city,Keys.ENTER);
//		System.out.println("inside city method");
//		dropone.click();
//		System.out.println("inside city method");
//		((WebElement) list).getText();
//		System.out.println("inside city method");
//		System.out.println(list);
//		
//		
//	}

//		checkCityName.equals(city);

//		checkCityName.contains("Pune");
//		System.out.println("inside city method");

//		System.out.println("city name "+checkCityName);

//		System.out.println("inside city method");
//		String alertText = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
//		Thread.sleep(5);
//		
//		System.out.println(alertText);
//		assert.assertEquals(city, alertText);
//	*********************************************************************		
}
