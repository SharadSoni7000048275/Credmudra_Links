package Links_Cred.Credmudra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TESTnew1 {
    WebDriver driver;
    List<String> failedLinks = new ArrayList<>();

    @BeforeClass
    public void setUp() {
        // Set path to ChromeDriver executable
    	 System.setProperty("WebDriver.Chrome.Driver", "C:\\selenium web driver\\chromedriver_win32.exe");
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration (necessary in some environments)
        options.addArguments("--no-sandbox"); // Disable sandboxing for certain environments

        // Initialize ChromeDriver with ChromeOptions
        driver = new ChromeDriver(options);
    }

    @DataProvider(name = "linksProvider")
    public Object[][] linksProvider() {
        return new Object[][]{
            {"https://web.cashe.co.in/VjcvdkZ0b0ZFVDZDMlFGOE1LQzRmTlo0WmRDRUpDdHErcm5IUytZWWgwVXluczY5aUpBYnp3bEFrb3FVNGM5V0w2SHBwUDNhekhBbnZWY2wyVkx3N2RuS2ZTVW5ZSFZ5K3pIWkRlOFhzaW5yNjJiZkRLVHNwd3VsK2NrMFh1ZE4="},
            {"https://web.mpokket.in/?utm_source=credmudra&utm_medium=sms"},
            {"https://portal.fibe.in/es-landing?sso=IVEwwA18wi6ZNms20240710091308"},
            {"http://kredt.be/home"},
            {"https://web.moneytap.com/?utm_source=mpx_credmudra&utm_medium=Multi&utm_campaign=Pilot1&utm_content=CL"},
            {"https://core.gopaysense.com/v1/external/perfios/pre_start?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJtaWQiOjMwNDU0NjM3LCJ2ZW5kb3IiOnRydWUsImV4cGlyZV90cyI6MTcyMDYzNzA2Mi42NDQ5MjcsInBhcnRuZXJfc2VjcmV0X2tleSI6ImVMLVp1VjlZUWQ3aTNxRC0xM2pnMTFzemphRDJJUHRaIn0.mXTvmupbbQUbxLihODZxjGAwG0yQ0oq0ZNe0Ofqw6uE"},
            {"https://www.lendingkart.com/dashboard/auth"},
            {"https://loantap.in/apply/home/APP1781798345140763"},
            {"https://moneyview.in/apply-loan/utility/autologin?utm_source=MV_Partners&utm_medium=autologin&utm_campaign=credmudra&autologin_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzlmYThlMThjZWM0YjhlMDE4Y2VmN2E0MDkzMmQ2NyIsImxvYW5BcHBJZCI6ImZmODA4MDgxOTA5NzNhZDEwMTkwOWEyZTQ0MDE1MTg5IiwiaXNzIjoiUFdBIiwiZXhwIjoxNzIwNjYwMDYyLCJpYXQiOjE3MjA1NzM2NjIsInVzZXJJZCI6IjJjOWZhOGUxOGNlYzRiOGUwMThjZWY3YTQwOTMyZDY3In0._jQwyORT38XhBdDBmraIGi6HiNKjh2hOJfaNUj1xHgs&user_category=C"},
            {"https://zype.sng.link/Djygt/xphp?paffid="},
            {"https://www.faircent.in/user"},
            {"https://play.google.com/store/apps/details?id=com.incred.customer&hl=en_IN&gl=IN"},
            {"https://app.upwards.in/login"},
            {"https://client.indifi.com/instant-loan/application/2d613b36-b3a5-4537-86c9-ad07d93ca5cd?anchor_name=Credmudra&app_id=8545858&applicationId=2d613b36-b3a5-4537-86c9-ad07d93ca5cd&access_token=4d36930fbf7cf7e0a2dd9f9ac952b1641fcc07e0"},
            {"https://dbl.protium.co.in"},
            {"https://privo.onelink.me/eIVI/CredMudra"},
            {"https://web.fatakpay.com/authentication/login"},
            {"https://smartcoin.onelink.me/KLIY/Credmudramarketing"},
            {"https://marketplace.creditvidya.com/credmudra?authToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0ZW5hbnRJZCI6IjQ4NSIsImN2VXNlciI6IjY2MDk0Mzg3ZTNlMWQ2MDMzZGNiNGNkZiIsInJlQXV0aCI6ZmFsc2UsImlhdCI6MTcyMDU4NDQzMiwiZXhwIjoxNzIwNjcwODMyfQ.6aW72dr5iVxv5Zgjoq5jIRjj1I18QahGwv-osVMWuLo&loanId=668e08eca8947c6329bcfe7d&sdkFlag=false&routeType=webview&requestSource=partner"},
            {"https://planet.ltfs.com/LTFS-CL/"},
            {"https://privo.creditsaison.in?signature=b61446de9cc63665ecbccc756b710a9ea626488e3b105d8342ea25d1f96e6da2&signed_timestamp=1720430828803"},
            {"https://app.tbal.io/bMoN/gznwr5bd"},
            {"http://dbhshbsdh.com/"},
            // Add more links here
        };
    }

    @Test(dataProvider = "linksProvider")
    public void testLinks(String url) {
        String result = "Fail";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        try {
            driver.get(url);
            // Add an explicit wait to check if the body tag is present
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            result = "Pass";
        } catch (Exception e) {
            // If an exception occurs, the result remains "Fail"
        }
        
        if ("Fail".equals(result)) {
            failedLinks.add(url);
        }
        
        System.out.println("URL: " + url + " - Result: " + result);
    }

    @AfterClass
    public void tearDown() {
        if (!failedLinks.isEmpty()) {
            sendFailureNotification(failedLinks);
        }
        if (driver != null) {
            driver.quit();
        }
    }

    private void sendFailureNotification(List<String> failedLinks) {
        String[] recipients = {
            //"talib.ahmed@zappian.com",
            "sharad.soni.vidisha@gmail.com"
            // Add more email addresses here
        };
        String subject = "Link Test Failed";
        StringBuilder body = new StringBuilder("The following links failed to load:\n");
        for (String url : failedLinks) {
            body.append(url).append("\n");
        }

        for (String recipient : recipients) {
            EmailUtil.sendEmail(recipient, subject, body.toString());
        }
    }
}
