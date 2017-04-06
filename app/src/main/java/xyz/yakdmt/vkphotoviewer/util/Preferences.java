package xyz.yakdmt.vkphotoviewer.util;

import com.vk.sdk.VKAccessToken;

/**
 * Created by yakdmt on 01/04/2017.
 */

public interface Preferences {

    String TOKEN_KEY = "TOKEN";
    String HOST_KEY = "HOST";
    String SYNC_KEY = "SYNC";

    String getAccessToken();

    void setAccessToken(String token);

}
