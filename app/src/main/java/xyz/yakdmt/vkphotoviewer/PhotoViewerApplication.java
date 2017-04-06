package xyz.yakdmt.vkphotoviewer;

import android.app.Application;

import com.vk.sdk.VKSdk;

import xyz.yakdmt.vkphotoviewer.injection.component.ApplicationComponent;
import xyz.yakdmt.vkphotoviewer.injection.component.DaggerApplicationComponent;
import xyz.yakdmt.vkphotoviewer.injection.module.ApplicationModule;

/**
 * Created by yakdmt on 31/03/2017.
 */

public class PhotoViewerApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        VKSdk.initialize(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
