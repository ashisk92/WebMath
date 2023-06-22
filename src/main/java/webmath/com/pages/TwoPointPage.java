package webmath.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webmath.com.base.BaseTest;

public class TwoPointPage extends BaseTest {

	@FindBy(name = "x1")
	private WebElement x1Input;

	@FindBy(name = "y1")
	private WebElement y1Input;

	@FindBy(name = "x2")
	private WebElement x2Input;

	@FindBy(name = "y2")
	private WebElement y2Input;

	@FindBy(css = "input[type='submit']")
	private WebElement submitButton;

	public TwoPointPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterPoint1(String x, String y) {
		x1Input.sendKeys(x);
		y1Input.sendKeys(y);
	}

	public void enterPoint2(String x, String y) {
		x2Input.sendKeys(x);
		y2Input.sendKeys(y);
	}

	public void submitForm() {
		submitButton.click();
	}

	public void enterField1(String text) {
		x1Input.clear();
		String restrictedText = text.substring(0, Math.min(text.length(), 5));
		x1Input.sendKeys(restrictedText);
	}
	
	public void enterField2(String text) {
		y1Input.clear();
		String restrictedText = text.substring(0, Math.min(text.length(), 5));
		y1Input.sendKeys(restrictedText);
	}
	
	public void enterField3(String text) {
		x2Input.clear();
		String restrictedText = text.substring(0, Math.min(text.length(), 5));
		x2Input.sendKeys(restrictedText);
	}
	
	public void enterField4(String text) {
		y2Input.clear();
		String restrictedText = text.substring(0, Math.min(text.length(), 5));
		y2Input.sendKeys(restrictedText);
	}
	
	

}
