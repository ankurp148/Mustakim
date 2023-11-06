package genricUtilities;

import java.util.Random;
//This class is a basic utility class that provides a method for generating random numbers within 
//a given range. It could be used in various Java applications where random number generation is needed.

/**
 * @author ankur
 */
public class JavaUtility 
{
	/**
	 * hey
	 * @param range
	 * @return
	 */
	public int generateRandomNumber(int range)
	{
		Random r=new Random();
		
		return r.nextInt(range);
		
	}

}
