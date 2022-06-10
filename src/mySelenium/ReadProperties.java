package mySelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	String myfileName;
	public ReadProperties(String filename)
	{
		myfileName = filename;
	}
	public String readData(String mykey) throws IOException
	{
		FileInputStream myfile = new FileInputStream(myfileName); //News Paper
		Properties prop = new Properties(); // News Reader
		prop.load(myfile);
		return prop.getProperty(mykey);		
	}

}
