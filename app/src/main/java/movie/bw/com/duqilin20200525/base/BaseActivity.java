package movie.bw.com.duqilin20200525.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:17
 *@Description:${DESCRIPTION}
 * */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity{
     protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        mPresenter = providePresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        ButterKnife.bind(this);
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P providePresenter();

    protected abstract int layoutId();
}
