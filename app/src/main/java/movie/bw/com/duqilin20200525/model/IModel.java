package movie.bw.com.duqilin20200525.model;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import movie.bw.com.duqilin20200525.contract.IContract;
import movie.bw.com.duqilin20200525.model.bean.LoginBean;
import movie.bw.com.duqilin20200525.model.bean.RegisterBean;
import movie.bw.com.duqilin20200525.util.NetUril;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:28
 *@Description:${DESCRIPTION}
 * */
public class IModel implements IContract.IModel{

    @Override
    public void getLoginData(String phone, String pwd, IModelCallBack iModelCallBack) {
        NetUril.getInstance().getApiService().LOGIN_BEAN_OBSERVABLE(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        iModelCallBack.onLoginSeccess(loginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onLoginFrecter(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getRegisterData(String phone, String pwd, IModelCallBack iModelCallBack) {
        NetUril.getInstance().getApiService().REGISTER_BEAN_OBSERVABLE(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {
                        iModelCallBack.onRegisterSeccess(registerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onRegisterFrecter(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
