package learningReadingPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingOrPropertiesFile {

	public static void main(String[] args) {
		
	}
	public void readfile(){
	Properties p = new Properties();
	FileInputStream fs;
	try {
		fs = new FileInputStream("C:\\Users\\Prakat-L-032\\workspace\\Program\\src\\learningReadingPropertiesFile\\OR.Properties");
		p.load(fs);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
