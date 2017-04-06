package xyz.yakdmt.vkphotoviewer.photo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import java.util.List;

import javax.inject.Inject;

import xyz.yakdmt.vkphotoviewer.R;
import xyz.yakdmt.vkphotoviewer.base.BaseActivity;
import xyz.yakdmt.vkphotoviewer.model.Photo;
import xyz.yakdmt.vkphotoviewer.photo.GridPresenter;

/**
 * Created by yakdmt on 01/04/2017.
 */

public class GridActivity extends BaseActivity implements GridMvpView {

    public static void startSelf(@NonNull Context context) {
        Intent intent = new Intent(context, GridActivity.class);
        context.startActivity(intent);
    }

    @Inject
    @InjectPresenter
    public GridPresenter mGridPresenter;

    @ProvidePresenter
    GridPresenter provideGridPresenter() {
        return mGridPresenter;
    }

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mGridPresenter.fetchPhotos();
    }

    @Override
    public void showToast(int resId) {

    }

    @Override
    public void showPhotos(List<Photo> photoList) {

    }
}
