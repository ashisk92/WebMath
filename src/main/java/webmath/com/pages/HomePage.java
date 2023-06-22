package webmath.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import webmath.com.base.BaseTest;

public class HomePage extends BaseTest {

	// Page Factory -- Object Repository
	@FindBy(xpath = "${webmath.logo}")
	WebElement webmathLogo;

	@FindBy(css = "${plot.geometry}")
	WebElement plotGeometry;


	// Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Action String
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateWebMathLogo() {
		return webmathLogo.isDisplayed();
	}

	public String getWebMathLogo() {
		return webmathLogo.getText();
	}

	public PlotGeometryPage clickOnPlotGeometry() {
		driver.findElement(By.cssSelector(prop.getProperty("plot.geometry"))).click();
		return new PlotGeometryPage();
	}
	
	public void selectTopicByVisibleText(String visibleText) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(prop.getProperty("topic.dropdown"))));
        dropdown.selectByValue(visibleText);
    }

}
