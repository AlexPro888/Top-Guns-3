package com.NavFort.pages;

import com.NavFort.utilities.ConfigurationReader;
import com.NavFort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static String userType;


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }









}
