package Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeproperties {

	public static void main(String[] args) throws IOException {
      Properties prop = new Properties();
      FileOutputStream fos = new FileOutputStream("config.properties") ;
      prop.setProperty("name", "DBName");
      prop.setProperty("server", "DBServer");
      prop.setProperty("value","DBvalue");
      prop.setProperty("pass", "DBpass");
      prop.store(fos, null);
      System.out.println("Created properties successfully");
	}

}
