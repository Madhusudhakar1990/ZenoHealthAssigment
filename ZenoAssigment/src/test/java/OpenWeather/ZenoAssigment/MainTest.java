package OpenWeather.ZenoAssigment;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencsv.exceptions.CsvException;

public class MainTest 
{

	public WebDriver driver;
	public ExtentReports reprt;

//	public static void main(String[] args) throws InterruptedException

	@BeforeTest
	public void be4Test() throws IOException, CsvException {

//		String path = System.getProperty("user.dir")+"//reports//indexone.html";
//		String path = "C://Users//ymadh//eclipse-workspace//SeleniumjavaTest//reports//indexone.html";

		String path = System.getProperty("user.dir") + "//reports//openWeather.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setDocumentTitle("ExtentReport");
		report.config().setReportName("TestIng NG report");

		reprt = new ExtentReports();
		reprt.attachReporter(report);
		reprt.setSystemInfo("Tester", "Madhu");
		
//		String path1 = "System.getProperty("user.dir") + "//Test.csv";
//		
//		Reader reader = new FileReader(path1);
//		
//		CSVReader csvreader = new CSVReader(reader);
//		
//		List<String[]> list = csvreader.readAll();
//		
//		String[] city  = list.get(0);
		
		

	}

	@BeforeMethod
	public void engineStart() throws InterruptedException

	{

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();

		driver.get("https://openweathermap.org/@Don't allow");
		Thread.sleep(5);
		driver.findElement(By.xpath("//li[@id='desktop-menu']/ul/li[6]")).click();
//		CSVReader csvreader = new CSVReader(reader);

	}

	@Test // (enabled = false)
	public void weatherDetails() throws InterruptedException {
		HomePage hp = new HomePage(driver);

//		hp.weatherdetail(city);
		hp.weatherdetail("Pune");
		
	}

	@Test // (enabled = false)
	public void cityWeather() throws InterruptedException {
		HomePage hp = new HomePage(driver);
//		hp.weatherdetail(city);
		hp.weatherInYourCity("Pune");

	}

	@Test  // (enabled = false)
	public void incorrectCityNameWeather() throws InterruptedException {
		HomePage hp = new HomePage(driver);
//		hp.weatherdetail(citytwo);
		hp.weatherInYourCity("Yaragudi");
	}

	@Test // (enabled = false)
	public void mapLayer() throws InterruptedException {
		Thread.sleep(5);
		
		driver.findElement(By.xpath("//li[@id='desktop-menu']/ul/li[6]")).click();  // last min change 

		MapPage mp = new MapPage(driver);

		mp.temp();
		mp.press();
		mp.cloud();
		mp.gPresp();
		mp.windspe();
	}

	@AfterMethod
	public void engineStop() {

		driver.close();
	}

//		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Pune",Keys.ENTER);

//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune",Keys.ENTER);

//		Thread.sleep(5);
//		driver.findElement(By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")).click();

//		Actions act = new Actions(driver);

//		act.click(driver.findElement(By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]"))).click().build().perform();

//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		wait.until(expectedConditions)

//		Thread.sleep(5);
//		WebElement submitButton = driver.findElement(By.xpath("//button[@class='button-round dark']"));
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button-round dark']"))).click();

}
