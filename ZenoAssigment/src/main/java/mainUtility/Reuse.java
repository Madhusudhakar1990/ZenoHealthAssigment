package mainUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reuse {
	public WebDriver driver;

	public Reuse(WebDriver driver) {

		this.driver = driver;

	}

	public void clickElement(WebElement name) {

		Actions ac = new Actions(driver);

		ac.click(name);

	}

}
