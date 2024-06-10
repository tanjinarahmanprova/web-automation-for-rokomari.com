package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public By authorPage = By.xpath("//h4[contains(text(),'হুমায়ূন আহমেদ')]");
    public By bookType1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By bookType2 = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
    public By nextPageButton = By.xpath("//a[normalize-space()='Next']");
    public By book = By.xpath("//div[@title='হরতন ইশকাপন হুমায়ূন আহমেদ']//div[contains(@class,'book-list-wrapper')]");
    public By addToCart = By.xpath("//a[@class='btn details-cart-btn-new small-cart-button js--add-to-cart js--add-to-cart-desc']");
    public By cartButton = By.xpath("//div[@class='cart-menu-wrapper']");
}
