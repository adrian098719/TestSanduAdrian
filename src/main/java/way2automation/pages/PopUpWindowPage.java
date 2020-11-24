package way2automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Pop Up window.
 * */
public class PopUpWindowPage
{
	private final SelenideElement nameField = Selenide.$(By.xpath(
		"//input[@type='text' and @name='name']"));

	private final SelenideElement phoneField = Selenide.$(By.xpath(
		"//input[@type='tel' and @name='phone']"));

	private final SelenideElement emailField = Selenide.$(By.xpath(
		"//input[@type='email' and @name='email']"));

	private final SelenideElement countryField = Selenide.$(By.xpath("//select[@name = 'country']"));

	private final SelenideElement cityField = Selenide.$(By.xpath(
		"//input[@type='text' and @name='city']"));

	private final SelenideElement usernameField = Selenide.$(By.cssSelector(
		"#load_form > fieldset:nth-child(10) > input[type=text]"));

	private final SelenideElement passwordField = Selenide.$(By.cssSelector(
		"#load_form > fieldset:nth-child(11) > input[type=password]"));

	/**
	 * Set value for Name field.
	 * @param String value - wanted value to be entered
	 * */
	public void setName(String value)
	{
		nameField.setValue(value);
	}

	/**Set value for Phone field.
	 * @param String value - wanted value to be entered.
	 * */
	public void setPhone(String value)
	{
		phoneField.setValue(value);
	}

	/**Set value for Email field.
	 * @param String value - wanted value to be entered.*/
	public void setEmail(String value)
	{
		emailField.setValue(value);
	}

	/**Set value for Country field.
	 * @param String value - wanted value to be entered.*/
	public void setCountry(String value)
	{
		countryField.selectOptionByValue(value);
	}

	/**Set value for City field.
	 * @param String value - wanted value to be entered.*/
	public void setCity(String value)
	{
		cityField.setValue(value);
	}

	/**Set value for Username field.
	 * @param String value - wanted value to be entered.*/
	public void setUsername(String value)
	{
		usernameField.setValue(value);
	}

	/**Set value for Password field.
	 * @param String value - wanted value to be entered.*/
	public void setPassword(String value)
	{
		passwordField.setValue(value);
	}

	/**Execute submit action for popup window.*/
	public void submitAction()
	{
		passwordField.sendKeys(Keys.ENTER);
	}
}
