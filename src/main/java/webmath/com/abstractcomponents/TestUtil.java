package webmath.com.abstractcomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import webmath.com.base.BaseTest;

public class TestUtil extends BaseTest {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
}
