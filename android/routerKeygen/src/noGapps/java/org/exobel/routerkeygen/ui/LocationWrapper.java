package org.exobel.routerkeygen.ui;

import android.app.Activity;

import org.exobel.routerkeygen.utils.WrappingListener;

/**
 * Wraps location google play apps services
 * Created by dusanklinec on 01/03/2018.
 */

public class LocationWrapper {
    public static void settingsRequest(final Activity activity, WrappingListener cb) {
        cb.onCall();
    }
}
