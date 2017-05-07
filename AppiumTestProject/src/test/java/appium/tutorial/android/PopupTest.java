package appium.tutorial.android;

import appium.tutorial.android.page.EnButtonScreen;
import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.page.PopupScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class PopupTest extends BaseUnitTest {

    @Test
    public void testPopup() throws InterruptedException{
        HomeScreen homeScreen = new HomeScreen();
        PopupScreen popupScreen = new PopupScreen();
        homeScreen.getPopupButton().isDisplayed();
        homeScreen.clickPopupButton();
        popupScreen.dismiss();
    }

}
