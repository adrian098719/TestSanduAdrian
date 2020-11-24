package ghost.pages;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Resources page.
 * */
public class ResourcesPage
{
	private final SelenideElement communityForum = Selenide.$(By.cssSelector(
		"#gatsby-focus-wrapper > div > div > header.gh-head > nav > div.gh-navbar-left > div:nth-child(4) > div > div > ul > li:nth-child(3)"));

	/**Click on Community Forum action.*/
	public void clickOnCommunityForum()
	{
		communityForum.click();
	}
}
