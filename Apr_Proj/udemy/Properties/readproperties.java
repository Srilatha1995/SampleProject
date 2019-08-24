package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readproperties {

	public static void main(String[] args) throws IOException {
     Properties prop = new Properties();
     FileInputStream fis = new FileInputStream("config.properties");
     prop.load(fis);
     System.out.println(prop.getProperty("name"));
     System.out.println(prop.getProperty("pass"));
     System.out.println(prop.getProperty("value"));
     System.out.println(prop.getProperty("server"));
     System.out.println("Loaded the properties successfully");
	
	}

}
