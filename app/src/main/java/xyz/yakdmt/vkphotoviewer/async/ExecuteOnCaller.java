package xyz.yakdmt.vkphotoviewer.async;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class ExecuteOnCaller implements Executor {

    private static ThreadLocal<Handler> threadLocalHandler = new ThreadLocal<Handler>() {
        @Override
        protected Handler initialValue() {
            Looper looper = Looper.myLooper();
            if (looper == null)
                looper = Looper.getMainLooper();
            return new Handler(looper);
        }
    };

    private final Handler handler = threadLocalHandler.get();

    @Override
    public void execute(Runnable command) {
        handler.post(command);
    }
}
