package ghost.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * This class contains all objects and actions related to Result page.
 * */
public class ResultPage
{
	private final SelenideElement resultContainer = Selenide.$(".topic-area");

	/**Return string visible inside the pare result.
	 * @return String - visible string.*/
	public String getAllStrings()
	{
		return resultContainer.innerText();
	}
}
