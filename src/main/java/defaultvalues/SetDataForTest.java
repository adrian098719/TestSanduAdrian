package defaultvalues;

import java.util.Random;

import way2automation.pages.PopUpDataModel;

/**This class contains methods that returns data for test.*/
public class SetDataForTest
{
	/**Returns an object that contains data for test for pop up window.
	 * @return PopUpDataModel object.*/
	public PopUpDataModel getPopUpDataModel()
	{
		Random rnd = new Random();
		PopUpDataModel model = new PopUpDataModel();
		model.setName("Ion01" + rnd.nextInt(1000));
		model.setPhone("909090" + rnd.nextInt(1000));
		model.setEmail("123" + rnd.nextInt(1000) + "@ggg.com");
		model.setCountry("Iceland");
		model.setCity("Basher");
		model.setUsername("User01o_p_" + rnd.nextInt(1000));
		model.setPassword("aso_p_" + rnd.nextInt(1000));
		return model;
	}
}
