package xyz.yakdmt.vkphotoviewer.photo.ui;

import java.util.List;

import xyz.yakdmt.vkphotoviewer.base.BaseMvpView;
import xyz.yakdmt.vkphotoviewer.model.Photo;

/**
 * Created by yakdmt on 01/04/2017.
 */

public interface GridMvpView extends BaseMvpView {

    void showPhotos(List<Photo> photoList);
}
