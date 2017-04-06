package xyz.yakdmt.vkphotoviewer.photo;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import javax.inject.Inject;

import xyz.yakdmt.vkphotoviewer.photo.ui.GridMvpView;

/**
 * Created by yakdmt on 01/04/2017.
 */

@InjectViewState
public class GridPresenter extends MvpPresenter<GridMvpView> {

    private PhotoManager mPhotoManager;

    @Inject
    public GridPresenter(PhotoManager photoManager) {
        mPhotoManager = photoManager;
    }

    public void fetchPhotos(){
        mPhotoManager.fetchPhotos(photos -> {
            Log.d("PhotosDebug", "photons="+photos.toString());
            return null;
        });
    }

}
