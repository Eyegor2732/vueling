package com.vueling.TestComponenets;

public class OSUtils {
	 private static String OS = null;

	   private static String getOsName()
	   {
	      if(OS == null) { OS = System.getProperty("os.name"); }
	      return OS;
	   }

	   public boolean isWindows()
	   {
	      return getOsName().startsWith("Windows");
	   }

	   public boolean isMac()
	   {
	      return getOsName().startsWith("Mac");
	   }
	   
	   public String getUserDirectory() {
		   return System.getProperty("user.dir");
	   }
	   
	   public String getSystemBrowser() {
		   return System.getProperty("browser");
	   }
	   
	   public String systemBrowser = System.getProperty("browser");
	   
	   public String userDir = System.getProperty("user.dir");

}
