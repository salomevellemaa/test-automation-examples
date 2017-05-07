package appium.tutorial.android.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Salome on 26.04.2017.
 */
public abstract class BaseUnitTest {

    public static DesiredCapabilities cap;
    public static AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PLATFORM, "Android");
        cap.setCapability(CapabilityType.VERSION, "7.1.2");
        cap.setCapability("deviceName", "Nexus5");
        cap.setCapability("appPackage", "io.selendroid.testapp");
        cap.setCapability("appActivity", ".HomeScreenActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }

//    /** If we're not on Sauce then return null otherwise SauceOnDemandTestWatcher will error. **/
//    public String getSessionId() {
//        return runOnSauce ? sessionId : null;
//    }
}
