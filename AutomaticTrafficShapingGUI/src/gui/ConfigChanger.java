package gui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigChanger {

	public static void changeConfig(String threshold) {
		
		OutputStream output = null;

		try {

			
			FileInputStream in = new FileInputStream(System.getenv().get("AUTO_SHAPER")+"\\config.properties");
			Properties prop = new Properties();
			prop.load(in);
			in.close();

			FileOutputStream out = new FileOutputStream(System.getenv().get("AUTO_SHAPER")+"\\config.properties");
			prop.setProperty("threshold", threshold);
			prop.store(out, null);
			out.close();
			
			

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
