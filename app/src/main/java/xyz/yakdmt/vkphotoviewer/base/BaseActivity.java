package xyz.yakdmt.vkphotoviewer.base;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.MvpView;

import xyz.yakdmt.vkphotoviewer.PhotoViewerApplication;
import xyz.yakdmt.vkphotoviewer.injection.component.ApplicationComponent;

/**
 * Created by yakdmt on 31/03/2017.
 */

public class BaseActivity extends MvpAppCompatActivity implements MvpView {

    protected ApplicationComponent getAppComponent() {
        return ((PhotoViewerApplication)getApplication()).getApplicationComponent();
    }

}
