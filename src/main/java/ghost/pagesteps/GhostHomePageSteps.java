package ghost.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import defaultvalues.NavigateTo;
import ghost.pages.GhostHomePage;

/**
 * This class contains all objects and actions related to Community Forum page.
 * */
public class GhostHomePageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	GhostHomePage ghostHomePage = new GhostHomePage();

	GhostNavigationPageSteps navigationPageSteps = new GhostNavigationPageSteps();

	/**Navigate to entered value.
	 * @param Enum NavigateTo.*/
	public void navigateTo(NavigateTo navigate)
	{
		log.info("Navigate to action.");
		switch (navigate) {
		case COMMUNITY_FORUM:
			navigateToCommunityForum();
			break;
		default:
			break;
		}

	}

	/**Navigate to Community Forum page.*/
	public void navigateToCommunityForum()
	{
		log.info("Navigate to Community Forum page.");
		navigationPageSteps.clickOnResources();
		navigationPageSteps.clickOnCommunityForum();
	}

}
