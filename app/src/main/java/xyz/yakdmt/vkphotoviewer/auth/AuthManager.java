package xyz.yakdmt.vkphotoviewer.auth;

import com.vk.sdk.VKAccessToken;

/**
 * Created by yakdmt on 31/03/2017.
 */

public interface AuthManager {

    void saveVkAccessToken(VKAccessToken vkAccessToken);
}
