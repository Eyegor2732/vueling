package com.vueling.TestComponenets;

public class OSUtils {
	 private static String OS = null;

	   private static String getOsName()
	   {
	      if(OS == null) { OS = System.getProperty("os.name"); }
	      return OS;
	   }

	   protected boolean isWindows()
	   {
	      return getOsName().startsWith("Windows");
	   }

	   protected boolean isMac()
	   {
	      return getOsName().startsWith("Mac");
	   }
	      
	   protected String systemBrowser = System.getProperty("browser");
	   
	   protected String userDir = System.getProperty("user.dir");

}
