package au.com.carsguide.pages;


import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[text()='buy + sell']")
    WebElement buynsell;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Search Cars']")
    WebElement searchcar;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Buy']//following::ul[1]/li/a")
    List<WebElement> names;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Find a Dealer']")
    WebElement findDealer;

    public void mousehoveronbuynsell() {
        mouseHoverToElement(buynsell);
    }

    public void clickonsearch() {
        clickOnElement(searchcar);
    }

   /* public void selectMenu(String menu) throws InterruptedException {

        for (WebElement name : names) {
            Thread.sleep(2000);
            if (name.getText().equalsIgnoreCase(menu)) {
                Thread.sleep(2000);
                name.click();
                break;
            }
        }
    }*/

    public void clickonused() {
        clickOnElement(used);
    }

    public void clickonFindDealer() {
        clickOnElement(findDealer);

    }



            }




