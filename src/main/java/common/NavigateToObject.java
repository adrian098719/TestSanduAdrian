package common;

import com.codeborne.selenide.Selenide;

import defaultvalues.NavigateTo;
import ghost.pagesteps.GhostHomePageSteps;

/**This class is created to use same mechanism of navigation inside the application.*/
public class NavigateToObject
{
	GhostHomePageSteps ghostHomePageSteps = new GhostHomePageSteps();

	/**This method navigates user to wanted page.This method can be used for both applications.
	 * @param NavigateTo object.*/
	public void navigateTo(NavigateTo navigateOption)
	{
		switch (navigateOption) {
		case GHOSTLINK:
			Selenide.open(NavigateTo.GHOSTLINK.getValue());
			break;
		case COMMUNITY_FORUM:
			ghostHomePageSteps.navigateTo(NavigateTo.COMMUNITY_FORUM);
			break;
		case WAY_TWO_LINK:
			Selenide.open(NavigateTo.WAY_TWO_LINK.getValue());
			break;
		default:
			break;
		}
	}
}
