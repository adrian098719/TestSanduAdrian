package way2automation.pages;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Dashboard page.
 * */
public class DashboardPage
{
	private final SelenideElement datepickerField = Selenide.$(By.cssSelector(
		"#wrapper > div.container.margin-top-20 > div.row > div:nth-child(2) > ul > li:nth-child(3)"));

	/**Click on Date Picker. */
	public void clickOnDatePicker()
	{
		datepickerField.click();
	}
}
