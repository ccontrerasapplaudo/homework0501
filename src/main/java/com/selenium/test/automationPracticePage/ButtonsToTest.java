package com.selenium.test.automationPracticePage;

import com.selenium.test.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ButtonsToTest extends AbstractComponent {

    @FindBy(xpath = "//header[@class=\"jumbotron text-center header_style\"]//button[@class=\"btn btn-primary\"]")
    private List<WebElement> buttonsToTest;
    @FindBy(css = "//*[contains(text(),\"VIEW ALL COURSES\")]")
    private WebElement controlElement;

    public ButtonsToTest(final WebDriver driver){
        super(driver);
    }

    public void setButtonsToTestClick(){
        buttonsToTest.get(0).click();
        this.wait.until((d)->controlElement.isDisplayed());
        System.out.println("Exito");
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
}
