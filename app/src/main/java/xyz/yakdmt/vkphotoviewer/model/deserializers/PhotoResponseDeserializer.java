package xyz.yakdmt.vkphotoviewer.model.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import xyz.yakdmt.vkphotoviewer.model.PhotosResponse;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class PhotoResponseDeserializer implements JsonDeserializer<PhotosResponse> {
    @Override
    public PhotosResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        PhotosResponse photosResponse = new PhotosResponse();

        return photosResponse;
    }
}
