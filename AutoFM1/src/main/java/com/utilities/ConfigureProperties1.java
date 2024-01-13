package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigureProperties1 {
	
	public static String getkeyFromPropertyFile(String file,String key) throws IOException  {
		
		File fileA = new File (file);
		FileInputStream reader =  new FileInputStream(fileA);
		Properties props= new Properties();
		props.load(reader);
		return props.getProperty(key);
		
	}

}
