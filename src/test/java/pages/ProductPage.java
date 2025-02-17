package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public By authorPage = By.xpath("//h4[contains(text(),'হুমায়ূন আহমেদ')]");
    public By bookType1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By bookType2 = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
    public By nextPageButton = By.xpath("//i[@class='ion-chevron-right']");
    public By book = By.xpath("//h4[contains(text(),'কোথাও কেউ নেই')]");
    public By addToCart = By.xpath("//a[@class='align-items-center js--add-to-cart js--add-to-cart-desc details-splash-effect-btn-central js--abtest-view-title-change-bangla js--abtest-bought-together-title-bangla js--abtest-user-want-title-bangla']//span[@id='js--add-to-cart-button']");
    public By cartButton = By.xpath("//div[@class='cart-menu-wrapper']");
}
