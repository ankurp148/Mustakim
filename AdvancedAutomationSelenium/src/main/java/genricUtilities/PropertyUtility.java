package genricUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//This PropertyUtility, provides a method to read data from a properties file by specifying a key, 
//and it handles file-related exceptions. The properties file path is expected to be defined in a constant, 
//PROPERTY_FILE_PATH, which is not shown in the provided code.

/**
 * @author ANKUR P
 */
public class PropertyUtility implements IAutoConstants
{
	/**
	 * THIS METHOD IS DEVELOPED TO READ THE DATA FROM PROPERTIES FILE.
	 * THIS METHOS ACCEPT KEY OF WHICH THE PARAMETER YOU WANT TO FETCH.
	 * @param key
	 * @return Value of key
	 */
	public String getDataFromPropertyFile(String key) 
	{
		FileInputStream fis = null;
		try 
		{
			fis=new FileInputStream(PROPERTY_FILE_PATH);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		Properties property = new Properties();
		try 
		{
			property.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return property.getProperty(key);

	}

}
