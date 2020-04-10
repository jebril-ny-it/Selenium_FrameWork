package confg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();

	public static void main(String[] args) {
		getProperties();
		setproperties();
		getProperties();

	}

	public static void getProperties()  {
		try {
			//String projectPath = System.getProperty("eclipse-workspace");
			InputStream input = new FileInputStream("/Users/mohammadjebril/eclipse-workspace/SeleniumJavaFrameWork/src/test/java/confg/config>properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setproperties() {
		try {
		OutputStream output = new FileOutputStream("/Users/mohammadjebril/eclipse-workspace/SeleniumJavaFrameWork/src/test/java/confg/config>properties");
		prop.setProperty("browser", "firefox");
		prop.store(output, null);
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
