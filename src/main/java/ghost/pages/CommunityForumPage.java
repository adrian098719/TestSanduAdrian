package ghost.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.util.Random;

import org.openqa.selenium.Keys;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;

/**
 * This class contains all objects and actions related to Community Forum page.
 * */
public class CommunityForumPage
{
	private final SelenideElement searchField = $("#search-term");

	private final SelenideElement loop = $("li.header-dropdown-toggle.search-dropdown");

	private final ElementsCollection results = $$("div.fps-result");

	/**Click on Loop object.*/
	public void clickOnLoop()
	{
		loop.click();
	}

	/**Execute search action.*/
	public void searchFor(String value)
	{
		searchField.sendKeys(value);
		searchField.sendKeys(Keys.ENTER);
	}

	/**Open random result.*/
	public void openRandomResult()
	{
		Random rnd = new Random();
		results.first().shouldBe(Visible.visible);
		int number = rnd.nextInt(results.size());
		if (number > 0)
			results.get(number).$("a.search-link").click();
		else
			System.out.println("No result was generated.");
	}
}
