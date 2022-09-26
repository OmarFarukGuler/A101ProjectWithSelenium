package TestPages;

import POM_Pages.Pom;
import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class _01_A101Asil extends GWD {
  /*  Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.

    Ödeme ekranı doldurulmayacak.
     Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur.
      En az Web’de yapmak zorunlu.
- Senaryoya üye kaydı oluşturmadan devam edilecek.
            - Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
            - Açılan ürünün siyah olduğu doğrulanır.
- Sepete ekle butonuna tıklanır.
            - Sepeti Görüntüle butonuna tıklanır.
            - Sepeti Onayla butonuna tıklanır.
            - Üye olmadan devam et butonuna tıklanır.
            - Mail ekranı gelir.
- Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
- Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.*/

    public static Actions actions = new Actions(GWD.driver);

    public static void main(String[] args) throws AWTException {
        //Parent parent = new Parent();
        //Pom_WebElements WB=new Pom_WebElements();
     Pom pom=new Pom();

       // WebElement cookies = driver.findElement(By.xpath("//button[text()='Kabul Et']"));
        pom.ClickPom("cookies");
        pom.ClickPom("a101");



       WebElement a101=driver.findElement(By.cssSelector("[loading='lazy']"));
       a101.click();

        WebElement giyimAksesuar=driver.findElement(By.xpath( "//a[@title='GİYİM & AKSESUAR']"));
        Action action=actions.moveToElement(giyimAksesuar).build();
        action.perform();

        WebElement corap=driver.findElement(By.xpath( "//a[contains(@title,'Kadın İç Giyim')]//following::a[7]"));
        corap.click();

       /* WebElement penticorap=driver.findElement(By.xpath( "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]"));
        parent.waitAndClickParent(penticorap);

        Assert.assertTrue(driver.getCurrentUrl().contains("siyah"));

        WebElement sepeteEkle=driver.findElement(By.xpath("//button//following::button[5]/*"));
        parent.waitAndClickParent(sepeteEkle);

        WebElement sepetiGoruntule=driver.findElement(By.linkText("Sepeti Görüntüle"));
        parent.waitAndClickParent(sepetiGoruntule);

        WebElement sepetiOnayla=driver.findElement(By.linkText("Sepeti Onayla"));
        parent.waitAndClickParent(sepetiOnayla);

        WebElement uyeOlmadan=driver.findElement(By.partialLinkText("ÜYE OLMADAN"));
        parent.waitAndClickParent(uyeOlmadan);
                                                                  //[name='user_email'](css)
        WebElement userEmail=driver.findElement(By.name("user_email"));
        parent.SendKeysParent(userEmail,"omarfarukguler@gmail.com");


                                                                      //button//following::button[5]
        WebElement gonOn=driver.findElement(By.xpath("//following::button[6]"));
        parent.waitAndClickParent(gonOn);

        WebElement newAddress=driver.findElement(By.cssSelector("a[title='Yeni adres oluştur']"));
        parent.waitAndClickParent(newAddress);

        WebElement addressTitle=driver.findElement(By.cssSelector("input[placeholder='Ev adresim, iş adresim vb.']"));
        parent.SendKeysParent(addressTitle,"Ev Adresim");

        WebElement name = driver.findElement(By.cssSelector("input[name='first_name']"));
        parent.SendKeysParent(name,"Omer faruk");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name"));
        parent.SendKeysParent(lastName,"Guler");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone_number']"));
        parent.SendKeysParent(phoneNumber,"5056069257");

        WebElement city = driver.findElement(By.cssSelector("select[name='city"));
        parent.SelectByValue(city,"HATAY");

        WebElement township = driver.findElement(By.cssSelector("select[name='township']"));
        parent.SelectByValue(township,"ANTAKYA");

        WebElement district = driver.findElement(By.cssSelector("select[name='district']"));
        parent.SelectByValue(district,"ESENTEPE MAH");

        WebElement textArea = driver.findElement(By.cssSelector("textarea[name='line']"));
        parent.SendKeysParent(textArea,"104 sk. No=4");

        WebElement save = driver.findElement(By.xpath("//button[contains(text(),'KAYDET')]"));
        parent.ClickParent(save);*/

    /*    WebElement kargoSec = driver.findElement(By.xpath("//following::div[@class='radio'][4]"));
        parent.ClickParent(kargoSec);

        WebElement saveAndGo = driver.findElement(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]"));
        parent.ClickParent(saveAndGo);

        WebElement assertKart = driver.findElement(By.xpath("//div[contains(text(),'Kart ile ödeme')]"));
        parent.ElementToVerify(assertKart,"Kart ile ödeme");
*/































        // WebElement corap=driver.findElement(By.xpath( "//a[@title='Dizaltı Çorap']"));
        // parent.ClickParent(corap);
//        Actions actions1=new Actions(GWD.driver);
//        Action action1=actions1.moveToElement(corap).click(corap).build();
//        action1.perform();
        // parent.waitwisibleLocated(giyimAksesuar,"data-pk","GİYİM & AKSESUAR");

       /* WebElement subMenu= driver.findElement(By.xpath("//div[@class='submenu-dropdown']"));
        parent.elementToBeVisibilityWait(subMenu);*/

//        WebElement corap=driver.findElement(By.xpath( "//a[@title='Dizaltı Çorap']"));
//        parent.elementToBeVisibilityWait(corap);
////        parent.ClickParent(corap);
//        action=actions.moveToElement(corap).click(corap).build();
//        action.perform();


//ChromeDriver.quitDriver();
    }
}
