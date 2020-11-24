package way2automation.pages;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Date Picker tab.
 * */
public class DatePickerPage
{
	private final SelenideElement formatDateLink = Selenide.$(By.cssSelector(
		"#wrapper > div > div.container.responsive-tabs-default > div.internal_navi > ul > li:nth-child(4) > a"));

	/**Click on FormatDate tab.*/
	public void clickOnFormatDateTab()
	{
		formatDateLink.click();
	}

	/**Returns Format Date link field.
	 * @return  Selenide element.*/
	public SelenideElement getFormatDateLinkField()
	{
		return this.formatDateLink;
	}
}
