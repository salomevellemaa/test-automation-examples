package appium.tutorial.android;

import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.page.UserRegistrationScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class RegisterUserTest extends BaseUnitTest {

    @Test
    public void testRegisterUser() throws InterruptedException{
        String username = "MaryS";
        String email = "mary.strawberry@notexist.com";
        String password = "12345";
        String name = "Mary";
        String programmingLanguage = "Java";
        HomeScreen homeScreen = new HomeScreen();
        UserRegistrationScreen userRegistrationScreen = new UserRegistrationScreen();
        homeScreen.waitingButtonClick();
        userRegistrationScreen.getProgressBar().isDisplayed();
        userRegistrationScreen.waitUntilProgressbarDisappear();
        userRegistrationScreen.loaded();
        userRegistrationScreen.fillUsername(username);
        userRegistrationScreen.fillEmail(email);
        userRegistrationScreen.fillPassword(password);
        userRegistrationScreen.fillName(name);
        userRegistrationScreen.clickLanguageDropdown();
        userRegistrationScreen.selectProgrammingLanguage(programmingLanguage);
        userRegistrationScreen.clickAcceptAdds();
        userRegistrationScreen.clickRegisterUser();
        userRegistrationScreen.clickRegisterUser2();
        homeScreen.loaded();

    }

}
