package xyz.yakdmt.vkphotoviewer.util;

import android.content.Context;
import android.content.SharedPreferences;

import xyz.yakdmt.vkphotoviewer.injection.ApplicationContext;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class PreferencesImpl implements Preferences {

    private static final String APP_PREF = "APP_PREF";
    private final SharedPreferences mPreferences;

    public PreferencesImpl(@ApplicationContext Context mContext) {
        mPreferences = mContext.getSharedPreferences(APP_PREF, Context.MODE_PRIVATE);
    }

    @Override
    public String getAccessToken() {
        return mPreferences.getString(TOKEN_KEY, "");
    }

    @Override
    public void setAccessToken(String token) {
        mPreferences.edit().putString(TOKEN_KEY, token).apply();
    }

}
