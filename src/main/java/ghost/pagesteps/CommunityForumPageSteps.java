package ghost.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ghost.pages.CommunityForumPage;

/**
 * This class contains all objects and actions related to Community Forum page.
 * */
public class CommunityForumPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	CommunityForumPage communityForumPage = new CommunityForumPage();

	/**Search for entered value.
	 * @param String value.*/
	public void searchFor(String value)
	{
		log.info("Search for {}", value);
		communityForumPage.clickOnLoop();
		communityForumPage.searchFor(value);
	}

	/**Open random result.*/
	public void openRandomResult()
	{
		log.info("Open random result.");
		communityForumPage.openRandomResult();
	}
}
