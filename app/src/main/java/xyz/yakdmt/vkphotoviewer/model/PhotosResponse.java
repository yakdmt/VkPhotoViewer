package xyz.yakdmt.vkphotoviewer.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.google.gson.JsonObject;

/**
 * Created by yakdmt on 01/04/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotosResponse {

    JsonObject mJsonObject;

    @JsonGetter("response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getJsonObject() {
        return mJsonObject;
    }

    @JsonSetter("response")
    public void setJsonObject(JsonObject jsonObject) {
        mJsonObject = jsonObject;
    }

    @Override
    public String toString() {
        return "PhotosResponse{" +
                "mJsonObject=" + mJsonObject +
                '}';
    }
}
