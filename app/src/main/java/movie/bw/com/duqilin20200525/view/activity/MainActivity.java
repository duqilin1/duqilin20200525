package movie.bw.com.duqilin20200525.view.activity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageSwitcher;

import butterknife.BindView;
import butterknife.ButterKnife;
import movie.bw.com.duqilin20200525.R;
import movie.bw.com.duqilin20200525.base.BaseActivity;
import movie.bw.com.duqilin20200525.base.BasePresenter;

public class MainActivity extends BaseActivity {

    @BindView(R.id.is)
    ImageSwitcher is;

    @Override
    protected void initData() {
        String a="http://mobile.bwstudent.com/images/small/head_pic/2020-05-25/20200525160555.jpg";
        is.setImageURI(Uri.parse(a));
    }

    @Override
    protected void initView() {

    }

    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
}
