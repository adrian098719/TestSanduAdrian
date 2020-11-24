package way2automation.pagesteps;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.Format;
import way2automation.pages.DatePickerPage;

/**Contains steps related to Date Picker tab. A step can contains more actions inside the page.*/
public class DatePickerSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	private DatePickerPage datePickerPage = new DatePickerPage();

	/**Click on Format Date tab.*/
	public void clickOnFormatDateTab()
	{
		datePickerPage.clickOnFormatDateTab();
	}

	/**Set format option.
	 * @param String value - wanted value to be entered.*/
	public void selectFormatOptions(String value)
	{
		datePickerPage.clickOnFormatDateTab();
		selectISO8601();
	}

	/**Check format option is correct.
	 * @param Enum Format 
	 * @return Boolean field.*/
	public Boolean isCorrectFormat(Format type)
	{
		switch (type) {
		case ISO8601:
			return checkISOFormat();
		case DEFAULT:
			return checkDefaultFormat();
		default:
			log.info("Wrong option entered.");
			return false;
		}
	}

	/**Get value of Date Field field.
	 * @return String value.*/
	public String getDateFieldValue()
	{
		datePickerPage.getFormatDateLinkField().sendKeys(Keys.TAB + "" + Keys.ENTER + "" + Keys.chord(
			Keys.CONTROL, "c"));
		return getCopy();
	}

	/**Get value from clipboard.
	 * @return String value.*/
	private String getCopy()
	{
		try
		{
			return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(
				DataFlavor.stringFlavor);
		}
		catch (HeadlessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (UnsupportedFlavorException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**Check DateField value checks ISO format.
	 * @return Boolean value.*/
	public Boolean checkISOFormat()
	{
		String value = getDateFieldValue();
		String currentDate = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT)
			.split("T")[0];
		return value.equals(currentDate);
	}

	/**Check DateField value checks MM/dd/yyyy format.
	 * @return Boolean value.*/
	public Boolean checkDefaultFormat()
	{
		String value = getDateFieldValue();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String currentDate = formatter.format(calendar.getTime()).toString();
		return value.equals(currentDate);
	}

	/**Select ISO8601 option in .*/
	public void selectISO8601()
	{
		datePickerPage.getFormatDateLinkField().sendKeys(Keys.TAB + "" + Keys.TAB + ""
			+ Keys.ARROW_DOWN);
	}

	/**Select today date in Date field.*/
	public void selectTodayDateFormatDate()
	{
		datePickerPage.getFormatDateLinkField().sendKeys(Keys.TAB + "" + Keys.ENTER);
	}
}
