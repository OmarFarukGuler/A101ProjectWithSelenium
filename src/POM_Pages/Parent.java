package POM_Pages;


import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {


    public static void ClickParent(WebElement element) {
        elementToBeVisibilityWait(element);
        elementToBeClickableWait(element);
        if (!element.isDisplayed()){ScrolToElement(element);}
        element.click();
    }

        public static void SendKeysParent(WebElement element,String text){
            WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(element));
            ScrolToElement(element);
            element.clear();
            element.sendKeys(text);
    }

    public static void ElementToVerify(WebElement element,String text){
        elementToBeVisibilityWait(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

public static void ScrolToElement(WebElement element){

    JavascriptExecutor js= (JavascriptExecutor) GWD.driver;
    js.executeScript("arguments[0].scrollIntoView()", element);
}
public static void elementToBeVisibilityWait(WebElement element){
    WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(element));



}
    public static void elementToBeClickableWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));


    }
    public static void waitstalenessOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.stalenessOf(element));


    }
    public static void invisibilityOfElementWithText(String locator,String value){
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(locator),value));


    }
    public static void SelectByValue(WebElement element,String value){
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        elementToBeVisibilityWait(element);
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, element.isSelected()));
        Select select=new Select(element);
        select.selectByVisibleText(value);

    }
    public static void SelectByIntValue(WebElement element,int optionIntValue,String propertyName,String childCount){
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        elementToBeVisibilityWait(element);
        wait.until(ExpectedConditions.domPropertyToBe(element,propertyName,childCount));
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, element.isSelected()));
        Select select=new Select(element);
        select.selectByIndex(optionIntValue);

    }
    public static void domPropertyToBeParent(WebElement element,String propertyName,String value) {
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.domPropertyToBe(element,propertyName,value));
        element.click();

    }
}
