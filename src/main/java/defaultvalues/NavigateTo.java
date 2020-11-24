package defaultvalues;

/**This Enum is created and used to avoid using strings in framework.*/
public enum NavigateTo
{
	GHOSTLINK("https://ghost.org/"), COMMUNITY_FORUM("Community Forum"), WAY_TWO_LINK(
		"http://way2automation.com/way2auto_jquery/index.php");

	private String value;

	NavigateTo(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}

}
