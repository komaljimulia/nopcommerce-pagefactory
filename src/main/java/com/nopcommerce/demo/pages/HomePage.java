package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    public void selectMenu( String menu) throws InterruptedException {
        if (menu.equalsIgnoreCase("Computers")){
            Reporter.log("Clicking on computer: //body[1]/div[6]/div[2]/ul[1]/li[1]/a[1] <br>");
            clickOnElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        }else if (menu.equalsIgnoreCase("Electronics")){
            Reporter.log("Clicking on Electronics: //body[1]/div[6]/div[2]/ul[1]/li[2]/a[1] <br>");
            clickOnElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        }else if (menu.equalsIgnoreCase("Apparel")){
            Reporter.log("Clicking on Apparel: //body[1]/div[6]/div[2]/ul[1]/li[3]/a[1] <br>");
            clickOnElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        }else if (menu.equalsIgnoreCase("Digital downloads")){
            Reporter.log("Clicking on Digital downloads: /html[1]/body[1]/div[6]/div[2]/ul[1]/li[4]/a[1] <br>");
            clickOnElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        }else if (menu.equalsIgnoreCase("Books")){
            Reporter.log("Clicking on Books: //body[1]/div[6]/div[2]/ul[1]/li[5]/a[1] <br>");
            clickOnElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        } else if (menu.equalsIgnoreCase("Jewelry ")) {
            Reporter.log("Clicking on Jewelry: //body/div[6]/div[2]/ul[1]/li[6]/a[1] <br>");
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        } else if (menu.equalsIgnoreCase("Gift Cards ")) {
            Reporter.log("Clicking on Gift Cards: //body/div[6]/div[2]/ul[1]/li[7]/a[1] <br>");
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        }

    }

}
