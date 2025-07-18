package MainRepositery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String createPropertyfile(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/automationexercise.properties");
		Properties prob=new Properties();
		prob.load(fis);
		String data=prob.getProperty(key);
		
		return data;
		}

}
