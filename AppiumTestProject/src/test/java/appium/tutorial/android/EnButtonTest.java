package appium.tutorial.android;

import appium.tutorial.android.page.EnButtonScreen;
import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class EnButtonTest extends BaseUnitTest {

    @Test
    public void testEnButton() throws InterruptedException{
        HomeScreen homeScreen = new HomeScreen();
        EnButtonScreen enButtonScreen = new EnButtonScreen();
        homeScreen.enButtonClick();
        enButtonScreen.clickNoButton();
    }

}
