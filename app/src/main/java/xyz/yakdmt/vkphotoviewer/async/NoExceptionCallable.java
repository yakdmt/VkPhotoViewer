package xyz.yakdmt.vkphotoviewer.async;

/**
 * Created by yakdmt on 31/03/2017.
 */

import java.util.concurrent.Callable;

public interface NoExceptionCallable<T> extends Callable<T> {

    @Override
    T call();

}
