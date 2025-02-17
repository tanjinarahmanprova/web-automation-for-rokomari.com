package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BrowserSetup {
    public static String browserName = System.getProperty("browser", "Chrome");
    public static final ThreadLocal<WebDriver> LOCAL_BROWSER = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }

    public static void setBrowser(WebDriver browser) {
        BrowserSetup.LOCAL_BROWSER.set(browser);
    }

    public WebDriver getBrowser(String browserName){
        if(browserName.equalsIgnoreCase("Chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\chrome-win64\\chrome.exe");
            chromeOptions.addArguments("user-data-dir=C:\\Users\\OS\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
            return new ChromeDriver(chromeOptions);
        }
        else if (browserName.equalsIgnoreCase("Firefox")) {
            return new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Edge")) {
            return new EdgeDriver();
        }
        else{
            throw new RuntimeException("Browser is not available with the given name: "+browserName);
        }
    }

    @BeforeSuite
    public void startBrowser() {
        WebDriver browser = getBrowser(browserName);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        browser.manage().window().maximize();
        setBrowser(browser);
    }

    @AfterSuite
    public void quiteBrowser(){
        getBrowser().quit();
    }
}
