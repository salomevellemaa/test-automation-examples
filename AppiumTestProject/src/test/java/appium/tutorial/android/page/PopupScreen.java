package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import org.openqa.selenium.WebElement;

/**
 * Created by Salome on 27.04.2017.
 */
public class PopupScreen extends BaseUnitTest {

    public void dismiss() {
        WebElement dismissButton = driver.findElementById("android:id/popup_dismiss_button");
        loaded();
        dismissButton.click();
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.loaded();
    }

    public void loaded() {
        driver.findElementById("android:id/popup_dismiss_button").isDisplayed();
    }
}