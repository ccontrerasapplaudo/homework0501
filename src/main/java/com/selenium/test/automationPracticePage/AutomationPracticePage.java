package com.selenium.test.automationPracticePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticePage {
    private WebDriver driver;
    private RadioButton radioButton;

    public AutomationPracticePage(final WebDriver driver){
        this.driver = driver;
        this.radioButton = PageFactory.initElements(driver, RadioButton.class);
    }

    public void goTo(){
        this.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    public RadioButton getRadioButton() {
        return radioButton;
    }
}
