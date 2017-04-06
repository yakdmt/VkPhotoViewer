package xyz.yakdmt.vkphotoviewer.photo;

import xyz.yakdmt.vkphotoviewer.async.ResultCallback;
import xyz.yakdmt.vkphotoviewer.model.PhotosResponse;

/**
 * Created by yakdmt on 01/04/2017.
 */

public interface PhotoManager {

    void fetchPhotos(ResultCallback<PhotosResponse> resultCallback);
}
