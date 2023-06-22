package webmath.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webmath.com.base.BaseTest;

public class PlotGeometryPage extends BaseTest {

	// Page Factory -- Object Repository
	@FindBy(css = "${plot.geometry.text}")
	WebElement plotGeometryText;
	
	@FindBy(css = "${two.point.xpath}")
	WebElement twoPoints;

	public PlotGeometryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getplotGeometryText() {
		return plotGeometryText.getText();
	}
	
	public TwoPointPage clickOnTwoPoint() {
		driver.findElement(By.cssSelector(prop.getProperty("two.point.css"))).click();
		return new TwoPointPage();
	}

}
