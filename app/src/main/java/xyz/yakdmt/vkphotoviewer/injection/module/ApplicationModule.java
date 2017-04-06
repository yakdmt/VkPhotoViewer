package xyz.yakdmt.vkphotoviewer.injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xyz.yakdmt.vkphotoviewer.async.AsyncWorker;
import xyz.yakdmt.vkphotoviewer.async.AsyncWorkerImpl;
import xyz.yakdmt.vkphotoviewer.auth.AuthManager;
import xyz.yakdmt.vkphotoviewer.auth.AuthManagerImpl;
import xyz.yakdmt.vkphotoviewer.injection.ApplicationContext;
import xyz.yakdmt.vkphotoviewer.network.VkService;
import xyz.yakdmt.vkphotoviewer.photo.PhotoManager;
import xyz.yakdmt.vkphotoviewer.photo.PhotoManagerImpl;
import xyz.yakdmt.vkphotoviewer.util.Preferences;
import xyz.yakdmt.vkphotoviewer.util.PreferencesImpl;

import static xyz.yakdmt.vkphotoviewer.util.Constants.VK_API_PATH;

/**
 * Created by yakdmt on 31/03/2017.
 */

@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return mApplication;
    }

    @Singleton
    @Provides
    AuthManager provideAuthManager(AsyncWorker asyncWorker, VkService vkService) {
        return new AuthManagerImpl(asyncWorker, vkService);
    }

    @Singleton
    @Provides
    PhotoManager providePhotoManager(AsyncWorker asyncWorker, VkService vkService, Preferences
            preferences) {
        return new PhotoManagerImpl(asyncWorker, vkService, preferences);
    }

    @Singleton
    @Provides
    Preferences providePreferences(@ApplicationContext Context context) {
        return new PreferencesImpl(context);
    }


    @Singleton
    @Provides
    AsyncWorker provideAsyncWorker() {
        return new AsyncWorkerImpl();
    }

    @Singleton
    @Provides
    VkService provideVkService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(VK_API_PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(VkService.class);
    }

}

