import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	
	public static void main(String[] args) {
		InputStream inputStream = null;
		String confPropertiesPath = System.getProperty("user.home") + File.separator + "CasualtyRater"
				+ File.separator + "EL" + File.separator + "Config" + File.separator
				+ "CasualtyELConfig.properties";
		String confPropertiesPath2 = System.getProperty("java.home") + File.separator +  "CasualtyELConfig.properties"; 
		String confPropertiesPath1 = System.getProperty("java.class.path");
		String userDir = new File(System.getProperty("user.dir")).getAbsolutePath();
		try {
			String userDir1 = new File(System.getProperty("user.dir")).getCanonicalPath();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		InputStream inputStream1 = Test.class.getClassLoader().getResourceAsStream("CasualtyELConfig.properties");
		
		Properties properties = new Properties();
		
		try {
			inputStream = new FileInputStream(new File(confPropertiesPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//inputStream = new FileInputStream(new File("/opt/eudvfnt7/applications/Rater/CasualtyELConfig.properties"));
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}


