package xyz.yakdmt.vkphotoviewer.auth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

import javax.inject.Inject;

import xyz.yakdmt.vkphotoviewer.R;
import xyz.yakdmt.vkphotoviewer.auth.AuthManager;
import xyz.yakdmt.vkphotoviewer.auth.AuthPresenter;
import xyz.yakdmt.vkphotoviewer.base.BaseActivity;
import xyz.yakdmt.vkphotoviewer.photo.ui.GridActivity;

/**
 * A login screen that offers login via email/password.
 */
public class AuthActivity extends BaseActivity implements AuthMvpView {

    private Button mSignInButton;

    public AuthManager mAuthManager;

    @Inject
    @InjectPresenter
    public AuthPresenter mAuthPresenter;

    @ProvidePresenter
    AuthPresenter provideAuthPresenter() {
        return mAuthPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mSignInButton.setOnClickListener(view -> signInToVk());
        mAuthPresenter.checkForCredentials();
    }

    @Override
    public void showToast(int resId) {
        Toast.makeText(this, getString(resId), Toast.LENGTH_LONG).show();
    }

    private void signInToVk(){
        VKSdk.login(this, VKScope.PHOTOS);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken vkAccessToken) {
                mAuthPresenter.saveCredentials(vkAccessToken);
                GridActivity.startSelf(AuthActivity.this);
            }
            @Override
            public void onError(VKError error) {
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


    @Override
    public void onAlreadyAuthorized() {
        GridActivity.startSelf(this);
        finish();
    }
}

