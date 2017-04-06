package xyz.yakdmt.vkphotoviewer.base;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Created by yakdmt on 31/03/2017.
 */

public interface BaseMvpView extends MvpView {

    @StateStrategyType(SkipStrategy.class)
    void showToast(int resId);

}
