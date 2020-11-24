package way2automation.pagesteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import way2automation.pages.PopUpDataModel;
import way2automation.pages.PopUpWindowPage;

/**Contains steps related to popup window. A step can contains more actions inside the page.*/
public class PopUpWindowPageSteps
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	private PopUpWindowPage popUpWindow = new PopUpWindowPage();

	/**
	 * Executes actions for submit data in popup window.
	 * @param PopUpDataModel - this object model contains data related to each field of popup window.
	 */
	public void submitData(PopUpDataModel model)
	{
		log.info("Execute submit action.");
		popUpWindow.setName(model.getName());
		popUpWindow.setPhone(model.getPhone());
		popUpWindow.setEmail(model.getEmail());
		popUpWindow.setCountry(model.getCountry());
		popUpWindow.setCity(model.getCity());
		popUpWindow.setUsername(model.getUsername());
		popUpWindow.setPassword(model.getPassword());
		popUpWindow.submitAction();
	}
}
