package MonitorStats;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	public static int getThreshold() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

		/*	input = new FileInputStream(
					"C:\\Users\\Public\\Documents\\file2\\GetMonitorStats\\src\\MonitorStats\\config.properties");*/
			String configPath = System.getenv().get("AUTO_SHAPER");
			
			input = new FileInputStream(configPath+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String threshold = prop.getProperty("threshold");
			prop.clear();
			return Integer.parseInt(threshold);

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

		return 0;

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

	public static String getRouterName() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String routerName = prop.getProperty("routerName");
			prop.clear();
			return (routerName);

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

	public static String getRouterPass() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String routerPass = prop.getProperty("routerPass");
			prop.clear();
			return (routerPass);

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

	public static String getRouterURL() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String routerURL = prop.getProperty("routerURL");
			prop.clear();
			return (routerURL);

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

	/*public static int getHistoryPath() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String historyPath = prop.getProperty("historyPath");
			return Integer.parseInt(historyPath);

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

		return 0;

	}*/

	/*public static int getCurrentPath() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String currentPath = prop.getProperty("currentPath");
			return Integer.parseInt(currentPath);

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

		return 0;

	}*/

	/*public static int getTailDropListSize() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String tailDropListSize = prop.getProperty("tailDropListSize");
			return Integer.parseInt(tailDropListSize);

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

		return 0;

	}*/

	public static int getIncrementSize() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String incrementSize = prop.getProperty("incrementSize");
			prop.clear();
			return Integer.parseInt(incrementSize);

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

		return 0;

	}
	public static int getDecrementSize() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String decrementSize = prop.getProperty("decrementSize");
			prop.clear();
			return Integer.parseInt(decrementSize);

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

		return 0;

	}
	public static int getUpperLimit() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String upperLimit = prop.getProperty("upperLimit");
			prop.clear();
			return Integer.parseInt(upperLimit);

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

		return 0;

	}

	public static int getLowerLimit() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String lowerLimit = prop.getProperty("lowerLimit");
			prop.clear();
			return Integer.parseInt(lowerLimit);

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

		return 0;

	}
	
	/*public static String getPolicyChangeLogURL() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String policyChangeLogURL = prop.getProperty("policyChangeLogURL");
			return (policyChangeLogURL);

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

	}*/
	
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
	
	/*public static String getGraphTextURL() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String graphTextURL = prop.getProperty("graphTextURL");
			return (graphTextURL);

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

	}*/
	
	public static long getWaitTimeBetweenPolicyChange() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(
					System.getenv().get("AUTO_SHAPER")+"\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value
			String waitTimeBetweenPolicyChange = prop.getProperty("waitTimeBetweenPolicyChange");
			prop.clear();
			return Long.parseLong(waitTimeBetweenPolicyChange);

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

		return 0l;

	}

}
