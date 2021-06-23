package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnPage extends Utility {

    private static final Logger log= LogManager.getLogger(HomePage.class.getName());

    //By buildYourPage = By.xpath( "//div[@class='overview']/div/child::h1" );
    @FindBy(xpath =  "//div[@class='overview']/div/child::h1" )
    WebElement buildYourPage;
   // By dropDown1 = By.id("product_attribute_1");
   @FindBy(id = "product_attribute_1")
   WebElement dropDown1;
   // By dropDown2 = By.id( "product_attribute_2" );
   @FindBy(id = "product_attribute_2")
   WebElement dropDown2;
   // By radioButton1 = By.id( "product_attribute_3_7" );
   @FindBy(id = "product_attribute_3_7")
   WebElement radioButton1;
   // By radioButton2 = By.id( "product_attribute_4_9" );
   @FindBy(id = "product_attribute_4_9")
   WebElement radioButton2;
   // By radioButton3 = By.id( "product_attribute_5_12" );
   @FindBy(id = "product_attribute_5_12")
   WebElement radioButton3;
   // By totalAmt = By.xpath( "//span[text()='$1,475.00']" );
   @FindBy(xpath="//span[text()='$1,475.00']")
   WebElement totalAmt;
   // By clickAddCart = By.id( "add-to-cart-button-1" );
   @FindBy(id = "add-to-cart-button-1")
   WebElement clickAddCart;
   // By topBarMsg = By.xpath( "//p[text()='The product has been added to your ']" );
   @FindBy(xpath="//p[text()='The product has been added to your ']" )
   WebElement topBarMsg;

    public String getBuildYourOwnText(){
        Reporter.log("Clicking on Buildyourpage:" + buildYourPage.toString() + "<br>");
        return getTextFromElement( buildYourPage );
    }
    public  void selectProcessorFromDropDownOne(String procesor){
        Reporter.log("Clicking products from dropdown:" + dropDown1.toString() + "<br>");
        selectByVisibleTextFromDropDown( dropDown1,procesor );
        log.info("Clicking products from dropdown:" + dropDown1.toString());
    }
    public  void selectRamFromDropDownTwo(String ram){
        Reporter.log("Clicking products from dropdown2:" + dropDown2.toString() + "<br>");
        selectByVisibleTextFromDropDown(dropDown2,ram );
        log.info("Clicking products from dropdown2:" + dropDown2.toString());

    }
    public  void clickOnHDDRadioButton(){
        Reporter.log("Clicking on radio button:" + radioButton1.toString() + "<br>");
        clickOnElement(radioButton1 );
        log.info("Clicking on radio button:" + radioButton1.toString());
    }
    public  void clickOSOnRadioButton(){
        Reporter.log("Clicking on radio button2:" + radioButton2.toString() + "<br>");
        clickOnElement( radioButton2 );
        log.info("Clicking on radio button2:" + radioButton2.toString());
    }
    public void clickOnSoftwareCheckBox(){
        Reporter.log("Clicking on radio button3:" + radioButton3.toString() + "<br>");
        clickOnElement( radioButton3 );
        log.info("Clicking on radio button3:" + radioButton3.toString());
    }
    public String getTotalAmt(){
        Reporter.log("Clicking on total amount:" + totalAmt.toString() + "<br>");
        log.info("Clicking on total amount:" + totalAmt.toString());
        return getTextFromElement(totalAmt);

    }
    public void clickOnAddToCart(){
        Reporter.log("Clicking on add to cart:" + clickAddCart.toString() + "<br>");
        clickOnElement( clickAddCart );
        log.info("Clicking on add to cart:" + clickAddCart.toString());
    }
    public String getTopBarMessage(){
        Reporter.log("Clicking on top bar:" + topBarMsg.toString() + "<br>");
       log.info("Clicking on top bar:" + topBarMsg.toString());
        return getTextFromElement( topBarMsg );
    }


}
