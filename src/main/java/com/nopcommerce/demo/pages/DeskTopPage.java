package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DeskTopPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
   // By clickOnDesktop = By.xpath( "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" );
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktop;
    //By selectAToZ = By.xpath( "//select[@id='products-orderby']" );
    @FindBy(xpath = "//select[@id='products-orderby']")
            WebElement selectAToZ;
   // By addTocart = By.xpath( "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]" );
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addTocart;


    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 3000 );
        Reporter.log("Clicking on Desktop:" + clickOnDesktop.toString() + "<br>");
        clickOnElement(clickOnDesktop);
        log.info("Clicking on Desktop:" + clickOnDesktop.toString());
    }
    public void selectFromDropdown(String sortBy) {
        Reporter.log("Clicking on Products from dropdown:" + selectAToZ.toString() + "<br>");
        selectByVisibleTextFromDropDown( selectAToZ, sortBy );
        log.info("Clicking on Products from dropdown:" + selectAToZ.toString());
    }
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep( 2000 );
        Reporter.log("Clicking on Add to cart:" + addTocart.toString() + "<br>");
        clickOnElement( addTocart );
        log.info("Clicking on Add to cart:" + addTocart.toString());
    }
}
