package ghost.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ghost.pages.ResultPage;

/**
 * This class contains all objects and actions related to Result page.
 * */
public class ResultPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	ResultPage resultPage = new ResultPage();

	/**Check open result is valid.
	 * @param value - represents the string that will be search inside the page.
	 * @return Boolean value.*/
	public Boolean isValidResult(String value)
	{
		Boolean check = false;
		String[] values = value.split(" ");
		String containerString = resultPage.getAllStrings();
		System.out.println("Text content of the result page is : " + containerString);
		for (int i = 0; i < values.length; i++)
		{
			System.out.println("iteratie i=" + i + ", value to search = " + values[i] + ", check ="
				+ check);
			check = check || containerString.contains(values[i]);
		}

		return check;
	}
}
