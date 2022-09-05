package com.selenium.test.automationPracticePage;

import com.selenium.test.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SuggestionClassInput extends AbstractComponent {

    @FindBy(xpath = "//input[@id=\"autocomplete\"]")
    private WebElement suggestionClassInput;

    @FindBy(css = "li.ui-menu-item:nth-child(1)")
    private WebElement suggestionList;

    public SuggestionClassInput(final WebDriver driver){
        super(driver);
    }

    public void obtainInputPlaceholder(){
        System.out.println("d)");
        System.out.println("Input placeholder: "+suggestionClassInput.getAttribute("placeholder"));
    }

    public void sendSuggestion(){
        System.out.println("e)");
        System.out.println("Sending text: El Sal");
        suggestionClassInput.sendKeys("El Sal");
    }

    public void clickSuggestion(){
        this.wait.until((d) -> this.suggestionList.isDisplayed());
        System.out.println("Click on first option");
        suggestionList.click();
    }

    public void printExpectedResult(){
        System.out.println("f)");
        System.out.println("Expected result: "+suggestionList.getAttribute("innerText"));
    }
    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.suggestionClassInput.isDisplayed());
    }
}
