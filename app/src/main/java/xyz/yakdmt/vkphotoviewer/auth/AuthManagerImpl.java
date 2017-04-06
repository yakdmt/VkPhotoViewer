package xyz.yakdmt.vkphotoviewer.auth;

import com.vk.sdk.VKAccessToken;

import xyz.yakdmt.vkphotoviewer.async.AsyncWorker;
import xyz.yakdmt.vkphotoviewer.network.VkService;

/**
 * Created by yakdmt on 31/03/2017.
 */

public class AuthManagerImpl implements AuthManager {

    AsyncWorker mAsyncWorker;
    VkService mVkService;

    public AuthManagerImpl(AsyncWorker asyncWorker, VkService vkService) {
        mAsyncWorker = asyncWorker;
        mVkService = vkService;
    }

    @Override
    public void saveVkAccessToken(VKAccessToken vkAccessToken) {

    }

//    @Override
//    public void login(final String login, final String password, ResultCallback<AuthInfo> resultCallback) {
//        mAsyncWorker.performTask(() -> {
//            return doNetworkCallInternal(login, password);
//            //return doFakeComputationsInternal(login, password);
//        }, resultCallback);
//    }
//
//    private AuthInfo doNetworkCallInternal(final String login, final String password) {
//        Call<AuthInfo> call = mVkService.auth(login, password);
//        Response<AuthInfo> response = null;
//        try {
//            response = call.execute();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        if (response != null && response.isSuccessful()) {
//            return response.body();
//        } else {
//            return null;
//        }
//    }
//
}
