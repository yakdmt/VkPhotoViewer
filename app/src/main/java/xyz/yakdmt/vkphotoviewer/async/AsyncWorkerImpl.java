package xyz.yakdmt.vkphotoviewer.async;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Created by yakdmt on 31/03/2017.
 */

public class AsyncWorkerImpl implements AsyncWorker {

    private final ListeningExecutorService mExecutor;

    public AsyncWorkerImpl() {
        mExecutor =  MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
    }

    @Override
    public <T> ResultCallback<T> performTask(NoExceptionCallable<T> callable, ResultCallback<T> resultCallback) {
        FutureResult<T> futureResult = new FutureResult<>();
        futureResult.setCallable(callable);
        ListenableFuture<T> future = mExecutor.submit(futureResult);
        future.addListener(() -> {
            T result = null;
            try {
                result = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            resultCallback.doOnResult(result);
        }, new ExecuteOnCaller());
        return resultCallback;
    }
}
