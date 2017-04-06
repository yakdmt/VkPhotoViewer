package xyz.yakdmt.vkphotoviewer.async;

/**
 * Created by yakdmt on 31/03/2017.
 */

public interface AsyncWorker {

    <T> ResultCallback<T> performTask(NoExceptionCallable<T> callable, ResultCallback<T>
            resultCallback);
}
