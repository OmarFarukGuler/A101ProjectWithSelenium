package TestPages;
import POM_Pages.Pom;
import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.awt.*;


public class _01_A101 extends GWD {
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

        driver.manage().deleteAllCookies();
        Pom.ClickPom("cookies");

        Pom.ClickPom("a101");

        WebElement giyimAksesuar = driver.findElement(By.xpath("//a[@title='GİYİM & AKSESUAR']"));
        Action action = actions.moveToElement(giyimAksesuar).build();
        action.perform();
        Pom.ClickPom("dizalticorap");
        Pom.ClickPom("penticorap");

        Assert.assertTrue(driver.getCurrentUrl().contains("siyah"));

        Pom.ClickPom("sepeteEkle");
        Pom.ClickPom("sepetiGoruntule");

        Pom.ClickPom("sepetiOnayla");

        Pom.ClickPom("uyeOlmadan");

        Pom.SendKeysPom("userEmail", "alibarara@gmail.com");
        Pom.ClickPom("devamEt");

        Pom.ClickPom("newAddress");

        Pom.SendKeysPom("addressTitle", "Myhome Myhome");
        Pom.SendKeysPom("name", "Nurdan");
        Pom.SendKeysPom("lastName", "Kuşluk");
        Pom.SendKeysPom("phoneNumber", "5469103411");
        Pom.SelectWithIntOptionIntPom("city", 39,"childElementCount","82");
        Pom.SelectWithIntOptionIntPom("township",2,"childElementCount", "16");
        Pom.SelectWithIntOptionIntPom("district",35,"childElementCount","96" );
        Pom.SendKeysPom("textArea", "Burak Berke bulvarı Dut caddesi No:4");

        Pom.ClickPom("save");
        Pom.ClickPom("radio");
        //Pom.domPropertyToBePom("radio","childElementCount","0");
        Pom.ClickPom("saveAndGo");


        Pom.VerifyPom("assertKart", "Kart ile ödeme");

        quitDriver();
    }
}
