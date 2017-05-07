package com.example.android.testing.uiautomator.BasicSample;

import android.os.RemoteException;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by Salome on 23.04.2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class GesturesTest extends BaseUnitTest {

    @Test
    public void testGestures() throws UiObjectNotFoundException, InterruptedException, RemoteException {
        String singleTap = "SINGLE TAP CONFIRMED";
        String longPress = "LONG PRESS";
        UiObject gestureType = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/gesture_type_text_view"));
        UiObject linearLayout = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/LinearLayout1"));
        UiObject touchButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/touchTest"));

        if (linearLayout.exists()) {
            mDevice.pressBack();
        }

        touchButton.isClickable();
        touchButton.click();
        linearLayout.isClickable();

        linearLayout.click();
        assertTrue(gestureType.getText().equals(singleTap));

        mDevice.waitForWindowUpdate(null, 3);

        /* LongClick ei toota tegelikult. Seade tuvastab tavalise clicki
        linearLayout.longClick();
        assertTrue(gestureType.getText().equals(longPress));
        mDevice.pressBack(); */
    }

}
