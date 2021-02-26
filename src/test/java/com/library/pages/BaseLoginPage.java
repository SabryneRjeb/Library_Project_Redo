package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseLoginPage {

public BaseLoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}



    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement emailAddressInputBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(linkText = "Dashboard")
    public WebElement Dashboard;
    @FindBy(linkText = "Users")
    public  WebElement Users;
    @FindBy(linkText = "Books")
    public  WebElement Books;






















}



