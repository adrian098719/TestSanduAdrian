package ghost.pagesteps;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Ghost Navigation Page page.
 * */
public class GhostNavigationPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	private final SelenideElement resourcesLink = Selenide.$(By.cssSelector(
		"#gatsby-focus-wrapper > div > div > header.gh-head > nav > div.gh-navbar-left > div:nth-child(4) > div > button"));

	private ResourcesPageSteps resourcesPageSteps = new ResourcesPageSteps();

	/**Click on Resources link.*/
	public void clickOnResources()
	{
		log.info("Click on Resources link.");
		resourcesLink.click();
	}

	/**Click on Community Forum.*/
	public void clickOnCommunityForum()
	{
		log.info("Click on Community Forum link.");
		resourcesPageSteps.clickOnCommunityForum();
	}
}
