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
public class WebViewTest extends BaseUnitTest {

    @Test
    public void testWebView() throws UiObjectNotFoundException {
        String name = "Mary Strawberry";
        UiObject startWebViewButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/buttonStartWebview"));
        UiObject testDataSpinner = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/spinner_webdriver_test_data"));
        UiObject goToHomeScreenBtn = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/goBack"));
        UiObject testSelectionFormPage = mDevice.findObject(new UiSelector()
                .className("android.widget.TextView")
                .text("formPage"));
        UiObject testSelectionSayHello = mDevice.findObject(new UiSelector()
                .className("android.widget.TextView")
                .text("'Say Hello'-Demo"));
        UiObject spinnerHeading = mDevice.findObject(new UiSelector()
                .resourceId("android:id/alertTitle"));
        UiObject nameInput = mDevice.findObject(new UiSelector()
                .resourceId("name_input"));
        UiObject carSelect = mDevice.findObject(new UiSelector()
                .resourceId("android:id/text1")
                .text("Audi"));
        UiObject carSpinner = mDevice.findObject(new UiSelector()
                .className("android.widget.Spinner")
                .index(2));
        UiObject sendBtn = mDevice.findObject(new UiSelector()
                .className("android.widget.Button")
                .descriptionContains("Send me your name!"));
        UiObject helloViewHeading = mDevice.findObject(new UiSelector()
                .className("android.view.View")
                .text("Hello, can you please tell me your name?"));
        String spinnerHeadingText = "Webdriver Test File";

        startWebViewButton.isClickable();
        startWebViewButton.click();

        testDataSpinner.exists();
        goToHomeScreenBtn.exists();

        testDataSpinner.click();

        spinnerHeading.getText().equals(spinnerHeadingText);
        testSelectionFormPage.isClickable();
        testSelectionFormPage.click();
        testDataSpinner.click();

        spinnerHeading.getText().equals(spinnerHeadingText);
        testSelectionSayHello.isClickable();
        testSelectionSayHello.click();

        helloViewHeading.exists();
        nameInput.exists();
        carSpinner.exists();
        sendBtn.exists();

        nameInput.clearTextField();;
        nameInput.setText(name);

        carSpinner.isClickable();
        carSpinner.click();

        carSelect.isClickable();
        carSelect.click();

        sendBtn.isClickable();
        sendBtn.click();

        goToHomeScreenBtn.isClickable();
        goToHomeScreenBtn.click();
    }


}
