package com.library.steps_definitions;

import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

  @Before
    public void setUpScenario(){
      String url = ConfigurationReader.getProperty("url");
      Driver.getDriver().get(url);
  }


  @After
    public void tearDownScenario(Scenario scenario){
      if (scenario.isFailed()) {
          byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenShot, "image/png", scenario.getName());
      }

      BrowserUtils.sleep(5);
      Driver.closeDriver();

  }

  }




