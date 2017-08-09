/**
 * 
 */
package com.perfecto.sample.utils;

import java.util.HashMap;
import java.util.Map;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;

/**
 * @author satyawan.pawar
 *
 */
public class PerfectoCommonUtility {
	public static void openApplication(String paramString) {
		String command = "mobile:application:open";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", paramString);
		params.put("timeout", 60);
		getDriver().executeScript(command, params);
	}

//	public static void startApplication(String paramString) {
//		Map<String, Object> params = new HashMap<>();
//		params.put("identifier", "955B0252C50AFBAFF240E6AC814CF4FB1E9F03CF");
//		getDriver().executeScript("mobile:application:start", params);
//	}

	private static AppiumDriver getDriver() {
		return DriverUtils.getAppiumDriver();
	}
	
	public static void setDeviceLocationByAddress(String address) {
		String command = "mobile:location:set";
		Map<String, Object> params = new HashMap<>();
		params.put("address", address);
		getDriver().executeScript(command, params);
		Reporter.log("Location set to : " + address, MessageTypes.Info);
	}
	
	public static void closeApplication() {
		Map<String, Object> params = new HashMap<>();

		params.put("identifier", "com.infostretch.inhouseapp");
		getDriver().executeScript("mobile:application:close", params);
	}
}
