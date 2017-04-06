package xyz.yakdmt.vkphotoviewer.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import xyz.yakdmt.vkphotoviewer.model.PhotosResponse;

/**
 * Created by yakdmt on 31/03/2017.
 */

public interface VkService {

    @GET("photos.getAll")
    Call<PhotosResponse> getPhotos(@Query("access_token") String token);
}
