package xyz.yakdmt.vkphotoviewer.async;

/**
 * Created by yakdmt on 31/03/2017.
 */

public interface ResultCallback<T> {

    T doOnResult(T t);

}
