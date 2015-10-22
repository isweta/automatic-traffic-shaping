package gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	
	
	public static String getControllerURL() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String controllerURL = prop.getProperty("controllerURL");
			
			prop.clear();
			return (controllerURL);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return "";

	}
	
	public static String getDataplaneName() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String dataplaneName = prop.getProperty("dataplaneName");
			prop.clear();
			return (dataplaneName);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return "";

	}

}
