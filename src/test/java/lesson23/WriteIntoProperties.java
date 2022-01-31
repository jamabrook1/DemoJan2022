package lesson23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteIntoProperties {
	public static void main(String[] args) throws IOException {
		//to work with properties we need 2 types of classes 
		// we need properties object
		Properties prop = new Properties(); // nothing is used with constructor just empty using this 
		// you can read and write into thats why we need above object
		OutputStream writeProp = null;
		
		try {
			writeProp = new FileOutputStream("app.properties");
		prop.setProperty("url", "https://google.com");
		prop.setProperty("username", "jamabrook1@gmail.com");
		prop.setProperty("password", "Brooklyn1");
		prop.setProperty("dbUser", "adminSQL");
		
		prop.store(writeProp, null);
		System.out.println("Wrote into propeties successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writeProp !=null) {
				try {
					writeProp.close();
				} catch (IOException e) {
					System.out.println("Coudnt close the OutStream");
				}
			}
			
		}
		
		
		
		
	}

}
