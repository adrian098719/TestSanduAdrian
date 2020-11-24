package way2automation.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import way2automation.pages.DashboardPage;

/**Contains steps related to dashboard page . A step can contains more actions inside the page.*/
public class DashboardPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	DashboardPage dashboardPage = new DashboardPage();

	/**Open date picker.*/
	public void openDatePicker()
	{
		dashboardPage.clickOnDatePicker();
	}
}
