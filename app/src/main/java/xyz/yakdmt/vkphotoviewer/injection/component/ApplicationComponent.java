package xyz.yakdmt.vkphotoviewer.injection.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import xyz.yakdmt.vkphotoviewer.async.AsyncWorker;
import xyz.yakdmt.vkphotoviewer.auth.AuthManager;
import xyz.yakdmt.vkphotoviewer.auth.ui.AuthActivity;
import xyz.yakdmt.vkphotoviewer.injection.ApplicationContext;
import xyz.yakdmt.vkphotoviewer.injection.module.ApplicationModule;
import xyz.yakdmt.vkphotoviewer.network.VkService;
import xyz.yakdmt.vkphotoviewer.photo.PhotoManager;
import xyz.yakdmt.vkphotoviewer.photo.ui.GridActivity;
import xyz.yakdmt.vkphotoviewer.util.Preferences;

/**
 * Created by yakdmt on 31/03/2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(AuthActivity authActivity);

    void inject(GridActivity gridActivity);

    @ApplicationContext
    Context context();

    AuthManager authManager();

    PhotoManager photoManager();

    VkService vkService();

    AsyncWorker asyncWorker();

    Preferences preferences();

}

