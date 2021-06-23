package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customelisteners.CustomeListnerers;
import com.nopcommerce.demo.pages.BuildYourOwnPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;


//
//@Listeners(CustomeListnerers.class)

public class TopMenuTest extends TestBase {
    HomePage homePage;
    ComputerPage computersPage;
    DeskTopPage deskTopPage;
    BuildYourOwnPage buildyourownpage2;


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        homePage=new HomePage();
        computersPage=new ComputerPage();
        deskTopPage = new DeskTopPage();
        buildyourownpage2=new BuildYourOwnPage();
    }
    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void selectTopMenuPage() throws InterruptedException {
        //System.out.println("running selectTopMenuPage");
        homePage.selectMenu("Computers");

    }

    @Test(groups = {"Smoke","Regression"})
    public void clickOnDesktopAndSortByZtoA() throws InterruptedException {
        Thread.sleep(3000);
        computersPage.clickOnComputersTab();
        computersPage.clickOnDesktopOption();
        computersPage.verifyproductsSortByGivenOrder();
    }
    @Test(groups = {"Regression"})
    public void productArrangeInAssendingOrder() throws InterruptedException{
        //Thread.sleep(3000);
        computersPage.clickOnComputersTab();
        deskTopPage.clickOnDesktopOption();
        deskTopPage.selectFromDropdown("Name: A to Z");
        deskTopPage.clickOnAddToCart();

    }
    @Test(groups = {"Regression"})
    public void verifyUserNavigatesToBuildYourPageAndProductAddedToCartSuccessfully() throws InterruptedException {
        homePage.selectMenu( "Computers" );
        deskTopPage.clickOnDesktopOption();
        deskTopPage.selectFromDropdown("Name: A to Z");
        deskTopPage.clickOnAddToCart();
        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = buildyourownpage2.getBuildYourOwnText();
        Assert.assertEquals( expectedPagetext, actualPageText );
        buildyourownpage2.selectProcessorFromDropDownOne( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildyourownpage2.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildyourownpage2.clickOnHDDRadioButton();
        buildyourownpage2.clickOSOnRadioButton();
        buildyourownpage2.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildyourownpage2.getTotalAmt();
        Assert.assertEquals( expectedtotal, actualTotal );
        buildyourownpage2.clickOnAddToCart();
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = buildyourownpage2.getTopBarMessage();
        Assert.assertEquals( expectedBarMessage, actualBarMessage );


    }
}
