package com.infostretch.steps.common;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

@QAFTestStepProvider
	public class GoogleSteps {
	    @QAFTestStep("user open google search engine")
	    public static void I_am_on_rayban_homePage() throws Throwable {
	        //new WebDriverTestBase().getDriver().manage().deleteAllCookies();
	 
	        new WebDriverTestBase().getDriver().get("http://www.ray-ban.com/usa");
	        
	    }
	

