package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;

/** Page object for the home page **/

public class EnButtonScreen extends BaseUnitTest{

public void clickNoButton() {
        loaded();
        driver.findElementById("android:id/button2").click();
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.loaded();
        }

public  void loaded() {
        driver.findElementById("android:id/message").getText().equals("This will end the activity");
        driver.findElementById("android:id/button1").isDisplayed();
        driver.findElementById("android:id/button2").isDisplayed();
        }
        }