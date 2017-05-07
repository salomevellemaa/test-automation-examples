package com.example.android.testing.uiautomator.BasicSample;

import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Salome on 23.04.2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class RegisterUserTest extends BaseUnitTest {

    @Test
    public void testRegisterUser() throws UiObjectNotFoundException {
        String percent = "100%";
        String username = "MaryS";
        String email = "mary.strawberry@donotexist.com";
        String password = "12345";
        String name = "Mary";
        String languageSelection = "Programming Languge";
        String language = "Java";

        UiObject usernameInput = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/inputUsername"));
        UiObject emailInput = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/inputEmail"));
        UiObject passwordInput = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/inputPassword"));
        UiObject nameInput = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/inputName"));
        UiObject languageDropdown = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
        UiObject acceptionCheckbox = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/input_adds"));
        UiObject registerButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/btnRegisterUser"));
        UiObject waitingButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/waitingButtonTest"));
        UiObject waitingDialog = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/waitingButtonTest"));
        UiObject progressBar = mDevice.findObject(new UiSelector()
                .resourceId("android:id/progress"));
        UiObject progressPercent = mDevice.findObject(new UiSelector()
                .resourceId("android:id/progress_percent"));
        UiObject languageSelectionTitle = mDevice.findObject(new UiSelector()
                .resourceId("android:id/alertTitle"));
        UiObject javaSelection = mDevice.findObject(new UiSelector()
                .className("android.widget.CheckedTextView")
                .text(language));
        UiObject nameData = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/label_name_data"));
        UiObject usernameData = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/label_username_data"));
        UiObject pswData = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/label_password_data"));
        UiObject emailData = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/label_email_data"));
        UiObject programmingLanguageData = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/label_preferedProgrammingLanguage_data"));
        UiObject registerUserBtn = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/buttonRegisterUser"));

        waitingButton.isClickable();
        waitingButton.click();

        waitingDialog.exists();
        progressBar.exists();
        progressPercent.exists();

        mDevice.waitForWindowUpdate("io.selendroid.testapp", 500);

        usernameInput.exists();
        emailInput.exists();
        passwordInput.exists();
        nameInput.exists();
        languageDropdown.exists();
        acceptionCheckbox.exists();
        registerButton.exists();

        mDevice.waitForWindowUpdate(null, 1000);
        usernameInput.isClickable();
        usernameInput.clearTextField();
        usernameInput.setText(username);

        emailInput.clearTextField();
        emailInput.setText(email);

        passwordInput.clearTextField();
        passwordInput.setText(password);

        nameInput.clearTextField();
        nameInput.setText(name);

        scrollView(languageDropdown);
        languageDropdown.isClickable();
        languageDropdown.click();

        languageSelectionTitle.getText().equals(languageSelection);

        javaSelection.click();

        acceptionCheckbox.isClickable();
        acceptionCheckbox.click();

        registerButton.isClickable();
        registerButton.click();

        nameData.equals(name);
        usernameData.equals(usernameData);
        pswData.equals(password);
        emailData.equals(email);
        programmingLanguageData.equals(language);

        scrollView(registerUserBtn);
        registerUserBtn.click();

    }

}
