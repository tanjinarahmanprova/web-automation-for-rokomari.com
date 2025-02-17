package testcases;

import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserSetup;

import java.util.ArrayList;
import java.util.List;

public class TestCase extends BrowserSetup {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    ShippingPage shippingPage = new ShippingPage();

    @BeforeMethod
    public void loadHomePage(){
        getBrowser().get(homePage.url);
    }

    @Test
    @Description("Test some essential features")
    public void testFeatures() {
        //Step1 - Manually login to the Rokomari's website
        homePage.addScreenshot("Homepage");
        //Assert.assertTrue(homePage.displayStatus(homePage.userIcon));   //Assertion for checking successful Sign in

        Actions action = new Actions(getBrowser());

        //Step2 - Select লেখক from the menu and then select হুমায়ুন আহমেদ
        WebElement hoverAuthor = homePage.getElement(homePage.author);
        WebElement hoverAuthorName = homePage.getElement(homePage.authorName);
        action.moveToElement(hoverAuthor).click(hoverAuthorName).build().perform();
        homePage.addScreenshot("Hover and select author");
        Assert.assertTrue(productPage.displayStatus(productPage.authorPage));   //Assertion for checking author page is loaded or not

        //Step3 - Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
        WebElement scrollToCategory1 = productPage.getElement(productPage.bookType1);
        action.scrollToElement(scrollToCategory1).build().perform();
        productPage.clickOnElement(productPage.bookType1);
        WebElement scrollToCategory2 = productPage.getElement(productPage.bookType2);
        action.scrollToElement(scrollToCategory2).build().perform();
        productPage.addScreenshot("Filter category");
        productPage.clickOnElement(productPage.bookType2);


        //Step4 - Scroll Down and go to Next Page
        WebElement scrollToNextButton = productPage.getElement(productPage.nextPageButton);
        action.scrollToElement(scrollToNextButton).build().perform();
        productPage.addScreenshot("Scroll down to next button");
        productPage.clickOnElement(productPage.nextPageButton);

        //Step5 -  Add to the cart any book
        WebElement scrollToBook = productPage.getElement(productPage.book);
        action.scrollToElement(scrollToBook).build().perform();
        productPage.clickOnElement(productPage.book);
        List<String> window_handles = new ArrayList<>(getBrowser().getWindowHandles());
        getBrowser().switchTo().window(window_handles.get(1));
        productPage.addScreenshot("Product page");
        WebElement scrollToAddToCart = productPage.getElement(productPage.addToCart);
        action.moveToElement(scrollToAddToCart).build().perform();
        productPage.clickOnElement(productPage.addToCart);

        //Step6 - Click Cart Icon
        productPage.clickOnElement(productPage.cartButton);
        productPage.addScreenshot("Cart page");

        //Step7 - Go to the Shipping page
        cartPage.clickOnElement(cartPage.placeOrderButton);

        //Step8 - Provide your Shipping Information
        shippingPage.addScreenshot("Blank Shipping Information page");
        shippingPage.clickOnElement(shippingPage.pickUpPlace);
        shippingPage.writeOnElement(shippingPage.nameInputBox,shippingPage.name);
        shippingPage.writeOnElement(shippingPage.phoneNumberInputBox,shippingPage.phoneNumber);
        shippingPage.writeOnElement(shippingPage.alternatePhoneNumberInputBox,shippingPage.alternatePhoneNumber);
        WebElement select_country = shippingPage.getElement(shippingPage.selectCountry);
        Select country = new Select(select_country);
        country.selectByValue("1");
        WebElement select_city = shippingPage.getElement(shippingPage.selectCity);
        Select city = new Select(select_city);
        city.selectByValue("57");
        WebElement select_area = shippingPage.getElement(shippingPage.selectArea);
        Select area = new Select(select_area);
        area.selectByValue("495");
        WebElement select_zone = shippingPage.getElement(shippingPage.selectZone);
        Select zone = new Select(select_zone);
        zone.selectByValue("3570");
        shippingPage.writeOnElement(shippingPage.addressInputBox,shippingPage.address);
        shippingPage.addScreenshot("Filled Shipping Information Page");

        //Step9 - Sign out
        shippingPage.clickOnElement(shippingPage.dropdown);
        shippingPage.clickOnElement(shippingPage.signOutButton);
        Assert.assertTrue(homePage.displayStatus(homePage.signInButton));   //Assertion for successful Sign out
        homePage.addScreenshot("Homepage after sign out");
    }


}
