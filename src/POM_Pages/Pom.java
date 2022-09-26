package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Utilities.GWD.driver;


public class Pom extends Parent {
    public Pom() {
        PageFactory.initElements(driver, this);
    }

    private static WebElement myElement;

    public static void ClickPom(String strElement) {

        switch (strElement) {
            case "cookies":
                myElement = driver.findElement(By.xpath("//button[text()='Kabul Et']"));
                break;
            case "a101":
                myElement = driver.findElement(By.cssSelector("[loading='lazy']"));
                break;
            case "sepetiGoruntule":
                myElement = driver.findElement(By.linkText("Sepeti Görüntüle"));
                break;
            case "newAddress":
                myElement = driver.findElement(By.cssSelector("a[title='Yeni adres oluştur']"));
                break;
            case "saveAndGo":
                myElement = driver.findElement(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]"));
                break;
            case "dizalticorap":
                myElement = driver.findElement(By.xpath("//a[contains(@title,'Kadın İç Giyim')]//following::a[7]"));
                break;
            case "penticorap":
                myElement = driver.findElement(By.xpath("//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]"));
                break;
            case "sepeteEkle":
                myElement = driver.findElement(By.xpath("//button//following::button[5]"));
                break;
            case "sepetiOnayla":
                myElement = driver.findElement(By.linkText("Sepeti Onayla"));
                break;
            case "uyeOlmadan":
                myElement = driver.findElement(By.partialLinkText("ÜYE OLMADAN"));
                break;
            case "devamEt":
                myElement = driver.findElement(By.xpath("//following::button[6]"));
                break;
            case "save":
                myElement = driver.findElement(By.xpath("//div//button[contains(text(),'KAYDET')]"));
                break;
            case "radio":
                myElement =driver.findElement(By.xpath("//input[@name='shipping']//following::div[@class='radio'][2]"));
                break;


        }
        ClickParent(myElement);

    }
    public static void SendKeysPom(String strElement, String text) {

        switch (strElement) {
            case "userEmail":
                myElement = driver.findElement(By.name("user_email"));
                break;
            case "addressTitle":
                myElement = driver.findElement(By.cssSelector("input[placeholder='Ev adresim, iş adresim vb.']"));
                break;
            case "name":
                myElement = driver.findElement(By.cssSelector("input[name='first_name']"));
                break;
            case "lastName":
                myElement = driver.findElement(By.cssSelector("input[name='last_name"));
                break;
            case "phoneNumber":
                myElement = driver.findElement(By.cssSelector("input[name='phone_number']"));
                break;
            case "textArea":
                myElement = driver.findElement(By.cssSelector("textarea[name='line']"));
                break;


        }
        SendKeysParent(myElement, text);
    }

    public static void SelectWithIntOptionIntPom(String strElement,int optionIntValue,String propertyName,String childCount) {

        switch (strElement) {
            case "city":
                myElement = driver.findElement(By.cssSelector("select[name='city"));
                break;
            case "township":
                myElement = driver.findElement(By.cssSelector("select[name='township']"));
                break;
            case "district":
                myElement = driver.findElement(By.cssSelector("select[name='district']"));
                break;
        }
        SelectByIntValue(myElement,optionIntValue,propertyName,childCount);
    }
    public static void VerifyPom(String strElement, String text) {

        switch (strElement) {
            case "assertKart": myElement = driver.findElement(By.xpath("//div[contains(text(),'Kart ile ödeme')]"));break;

        }
        ElementToVerify(myElement, text);
    }

}
