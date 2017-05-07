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
public class PopupTest extends BaseUnitTest {

    @Test
    public void testPopup () throws UiObjectNotFoundException {
        UiObject popupButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/showPopupWindowButton")
                .className("android.widget.Button"));

        // see ei toota, kuna UIAutomator ei toeta popupe, viga ei ole hetkel parandatud
        popupButton.click();
        UiObject dismissButton = mDevice.findObject(new UiSelector().text("Dismiss"));
        dismissButton.click();
    }

}
