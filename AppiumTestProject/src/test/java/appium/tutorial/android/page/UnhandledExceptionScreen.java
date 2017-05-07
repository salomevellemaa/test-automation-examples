package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import org.openqa.selenium.WebElement;

/**
 * Created by Salome on 27.04.2017.
 */
public class UnhandledExceptionScreen extends BaseUnitTest {

    public void restartApp() {
        WebElement restartButton =  driver.findElementById("android:id/aerr_restart");
        restartButton.isDisplayed();
        restartButton.click();
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.loaded();
    }

    /** Verify the home page has loaded **/
    public  void loaded() {
        driver.findElementById("android:id/alertTitle").isDisplayed();
    }
}
