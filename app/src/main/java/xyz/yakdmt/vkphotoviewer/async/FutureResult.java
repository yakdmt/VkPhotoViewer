package xyz.yakdmt.vkphotoviewer.async;

import android.util.Log;

import java.util.concurrent.Callable;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class FutureResult<T> implements Callable<T>{

    NoExceptionCallable<T> mCallable;

    ResultCallback<T> mResultCallback;
    ContentResult<T> mContentResult;


    @Override
    public T call() {
        T result = mCallable.call();
        return result;
    }

    public void setResultCallback(ResultCallback<T> resultCallback) {
        mResultCallback = resultCallback;
    }

    public void setCallable(NoExceptionCallable<T> callable) {
        mCallable = callable;
    }
}
