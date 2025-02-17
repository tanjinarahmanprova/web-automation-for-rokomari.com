package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://www.rokomari.com/book";
    public By signInButton = By.xpath("//a[normalize-space()='Sign In']");
    public By userIcon = By.xpath("//img[@alt='default user photo']");
    public By author = By.xpath("//span[contains(text(),'লেখক')]");
    public By authorName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
}
