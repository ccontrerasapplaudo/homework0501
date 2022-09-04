package com.selenium.test.automationPracticeTest;

import com.selenium.test.BaseTest;
import com.selenium.test.automationPracticePage.AutomationPracticePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AutomationPracticeTest extends BaseTest {

    private AutomationPracticePage automationPracticePage;

    @BeforeTest
    public void setupPages(){
        this.automationPracticePage = new AutomationPracticePage(driver);
    }

    @Test(dataProvider = "getData")
    public void AutomationPracticeWorkflow(int randomResult){

        // Exercise 1
        System.out.println("********** Results exercise 1 **********");
        automationPracticePage.goTo();
        Assert.assertTrue(automationPracticePage.getRadioButton().isDisplayed());
        automationPracticePage.getRadioButton().clickRadioByRandomResult(randomResult);
        automationPracticePage.getRadioButton().getRadioButtonsText(randomResult);

    }

    @DataProvider
    public Object[][] getData(){

        int min = 1;
        int max = 3;
        int randomResult = (int)(Math.random()*(max-min+1)+min);

        return new Object[][]{
                {randomResult},
        };

    }

}
