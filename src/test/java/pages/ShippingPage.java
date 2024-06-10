package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{
    public By pickUpPlace = By.xpath("//div[@class='delivery__location d-flex align-item-center mb-3']//label[@for='office'][normalize-space()='Office']");
    public By nameInputBox = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phoneNumberInputBox = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alternatePhoneNumberInputBox = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By selectZone = By.xpath("//select[@id='js--zone']");
    public By addressInputBox = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By dropdown = By.xpath("//a[@id='dropdownMenu2']");
    public By signOutButton = By.xpath("//a[normalize-space()='Sign Out']");

    public String name = "Asma Sultana";
    public String phoneNumber = "01813816794";
    public String alternatePhoneNumber = "01819448775";
    public String address = "House 45, Road 12 ,Maijdee Court, Noakhali Sadar , Noakhali";
}
