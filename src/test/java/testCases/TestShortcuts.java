package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestShortcuts {
 public static void main(String[] args) {
	 FileInputStream fis= null;
	 Properties prop= new Properties();
	 Properties value= new Properties();
	try {
		fis= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\config.properties");
		fis= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\values.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		prop.load(fis);
		value.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(prop.getProperty("browser"));
}
}
