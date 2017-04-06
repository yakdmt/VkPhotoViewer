package xyz.yakdmt.vkphotoviewer.photo;

import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import xyz.yakdmt.vkphotoviewer.async.AsyncWorker;
import xyz.yakdmt.vkphotoviewer.async.ResultCallback;
import xyz.yakdmt.vkphotoviewer.model.PhotosResponse;
import xyz.yakdmt.vkphotoviewer.network.VkService;
import xyz.yakdmt.vkphotoviewer.util.Preferences;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class PhotoManagerImpl implements PhotoManager {

    private AsyncWorker mAsyncWorker;
    private VkService mVkService;
    private Preferences mPreferences;

    public PhotoManagerImpl(AsyncWorker asyncWorker, VkService vkService, Preferences preferences) {
        mAsyncWorker = asyncWorker;
        mVkService = vkService;
        mPreferences = preferences;
    }

    @Override
    public void fetchPhotos(ResultCallback<PhotosResponse> resultCallback) {
        mAsyncWorker.performTask(this::doPhotosCallInternal, resultCallback);
    }

    private PhotosResponse doPhotosCallInternal() {
        Call<PhotosResponse> call = mVkService.getPhotos(mPreferences.getAccessToken());
        Response<PhotosResponse> response = null;
        try {
            response = call.execute();
        } catch (IOException e){
            e.printStackTrace();
        }
        if (response != null && response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }
}
