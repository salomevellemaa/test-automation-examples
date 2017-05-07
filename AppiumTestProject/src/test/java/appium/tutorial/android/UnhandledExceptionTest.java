package appium.tutorial.android;

import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.page.PopupScreen;
import appium.tutorial.android.page.UnhandledExceptionScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class UnhandledExceptionTest extends BaseUnitTest {

    @Test
    public void testUnhandledException() throws InterruptedException{
        HomeScreen homeScreen = new HomeScreen();
        UnhandledExceptionScreen unhandledExceptionScreen = new UnhandledExceptionScreen();
        homeScreen.getExceptionButton().isDisplayed();
        homeScreen.getExceptionButton().click();
        unhandledExceptionScreen.loaded();
        unhandledExceptionScreen.restartApp();
    }

}
