package xyz.yakdmt.vkphotoviewer.auth;

import android.text.TextUtils;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.vk.sdk.VKAccessToken;

import javax.inject.Inject;

import xyz.yakdmt.vkphotoviewer.auth.ui.AuthMvpView;
import xyz.yakdmt.vkphotoviewer.util.Preferences;

/**
 * Created by yakdmt on 31/03/2017.
 */

@InjectViewState
public class AuthPresenter extends MvpPresenter<AuthMvpView> {

    private Preferences mPreferences;

    @Inject
    public AuthPresenter(Preferences preferences) {
       mPreferences = preferences;

    }

    public void saveCredentials(VKAccessToken vkAccessToken) {
        mPreferences.setAccessToken(vkAccessToken.accessToken);
    }

    public void checkForCredentials(){
        if (!TextUtils.isEmpty(mPreferences.getAccessToken())) {
            getViewState().onAlreadyAuthorized();
        }
    }

}
