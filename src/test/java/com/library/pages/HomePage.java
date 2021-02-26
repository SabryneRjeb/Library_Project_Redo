package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseLoginPage {


    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

public void getUrl(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
}

}
