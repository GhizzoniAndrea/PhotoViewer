package com.ghizzoniandrea.photoviewer.utils;

import android.widget.Toast;

import com.ghizzoniandrea.photoviewer.app.App;

/**
 * Created by ghizzoniandrea on 2017/3/15.
 */
public class ToastUtil {

    public static void showShort(int resId) {
        Toast.makeText(App.getContext(), resId, Toast.LENGTH_SHORT).show();
    }

    public static void showShort(String message) {
        Toast.makeText(App.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(int resId) {
        Toast.makeText(App.getContext(), resId, Toast.LENGTH_LONG).show();
    }

    public static void showLong(String message) {
        Toast.makeText(App.getContext(), message, Toast.LENGTH_LONG).show();
    }
}
