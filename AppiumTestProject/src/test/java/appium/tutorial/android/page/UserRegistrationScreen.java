package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Salome on 27.04.2017.
 */
public class UserRegistrationScreen extends BaseUnitTest {



    /** Verify the home page has loaded **/
    public  void loaded() {
        driver.findElementById("io.selendroid.testapp:id/inputUsername").isDisplayed();
        driver.findElementById("io.selendroid.testapp:id/inputEmail").isDisplayed();
        driver.findElementById("io.selendroid.testapp:id/inputPassword").isDisplayed();
        driver.findElementById("io.selendroid.testapp:id/inputName").isDisplayed();
        driver.scrollTo("Register User (verify)");
        driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").isDisplayed();
        driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").isDisplayed();
        driver.findElementById("io.selendroid.testapp:id/input_adds").isDisplayed();
    }


    public void waitUntilProgressbarDisappear() {
       new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("android.widget.ProgressBar")));
    }

    public void clickLanguageDropdown() {
        driver.scrollTo("Programming Languge");
        WebElement languageDropdown = driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
        languageDropdown.isDisplayed();
        languageDropdown.click();
    }

    public void clickAcceptAdds() {
        driver.scrollTo("I accept adds");
        WebElement languageDropdown = driver.findElementById("io.selendroid.testapp:id/input_adds");
        languageDropdown.isDisplayed();
        languageDropdown.click();
    }

    public void clickRegisterUser() {
        driver.scrollTo("Register User (verify)");
        WebElement registerButton = driver.findElementById("io.selendroid.testapp:id/btnRegisterUser");
        registerButton.isDisplayed();
        registerButton.click();
    }

    public void clickRegisterUser2() {
        WebElement registerButton = driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser");
        registerButton.isDisplayed();
        registerButton.click();
    }

    public void selectProgrammingLanguage(String language) {
        List<WebElement> languageList =  driver.findElements(By.className("android.widget.CheckedTextView"));

        for (WebElement element : languageList) {
            if (element.getText().equals(language)) {
                element.click();
                break;
            }
        }
    }

    public void fillUsername(String username) {
        driver.scrollTo("Username");
        WebElement usernameInput = driver.findElementById("io.selendroid.testapp:id/inputUsername");
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void fillEmail(String email) {
        driver.scrollTo("E-Mail");
        WebElement usernameInput = driver.findElementById("io.selendroid.testapp:id/inputEmail");
        usernameInput.clear();
        usernameInput.sendKeys(email);
    }


    public void fillPassword(String password) {
        driver.scrollTo("Password");
        WebElement usernameInput = driver.findElementById("io.selendroid.testapp:id/inputPassword");
        usernameInput.clear();
        usernameInput.sendKeys(password);
    }

    public void fillName(String name) {
        driver.scrollTo("Name");
        WebElement usernameInput = driver.findElementById("io.selendroid.testapp:id/inputName");
        usernameInput.clear();
        usernameInput.sendKeys(name);
    }

    public WebElement getProgressBar() {
        return  driver.findElementById("android:id/progress");
    }

    public WebElement getUsernameInput() {
        return  driver.findElementById("io.selendroid.testapp:id/inputUsername");
    }

    public WebElement getEmailInput() {
        return  driver.findElementById("io.selendroid.testapp:id/inputEmail");
    }

    public WebElement getPasswordInput() {
        return  driver.findElementById("io.selendroid.testapp:id/inputPassword");
    }

    public WebElement getNameInput() {
        return  driver.findElementById("io.selendroid.testapp:id/inputName");
    }

    public WebElement getLanguageDropdown() {
        return  driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
    }

    public WebElement getRegisterButton() {
        return  driver.findElementById("io.selendroid.testapp:id/btnRegisterUser");
    }

    public WebElement getAcceptionCheckbox() {
        return  driver.findElementById("io.selendroid.testapp:id/input_adds");
    }
}