package ghost.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ghost.pages.ResourcesPage;

/**
 * This class contains all objects and actions related to Resource page.
 * */
public class ResourcesPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	private final ResourcesPage resourcePage = new ResourcesPage();

	/**Click on Community Forum.*/
	public void clickOnCommunityForum()
	{
		log.info("Click on Community Forum.");
		resourcePage.clickOnCommunityForum();
	}
}
