package com.vueling.TestComponenets;

public class OSUtils {
	 private static String OS = null;

	   private static String getOsName()
	   {
	      if(OS == null) { OS = System.getProperty("os.name"); }
	      return OS;
	   }

	   protected static boolean isWindows()
	   {
	      return getOsName().startsWith("Windows");
	   }

	   protected static boolean isMac()
	   {
	      return getOsName().startsWith("Mac");
	   }
	      
	   protected static final String systemBrowser = System.getProperty("browser");
	   
	   protected static final String userDir = System.getProperty("user.dir");

}
