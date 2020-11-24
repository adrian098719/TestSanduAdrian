package common;

/**This Enum is created and used to avoid using strings in framework.*/
public enum Format
{
	DEFAULT("Default"), ISO8601("ISO 8601");

	private String value;

	Format(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}

}
