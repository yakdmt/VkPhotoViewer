package xyz.yakdmt.vkphotoviewer.async;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class ContentResult<T> {

    T mResult;

    public T getResult() {
        return mResult;
    }

    public void setResult(T result) {
        mResult = result;
    }
}
