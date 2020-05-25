package movie.bw.com.duqilin20200525.presenter;

import movie.bw.com.duqilin20200525.base.BasePresenter;
import movie.bw.com.duqilin20200525.contract.IContract;
import movie.bw.com.duqilin20200525.model.IModel;
import movie.bw.com.duqilin20200525.model.bean.LoginBean;
import movie.bw.com.duqilin20200525.model.bean.RegisterBean;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:30
 *@Description:${DESCRIPTION}
 * */
public class IPresenter extends BasePresenter<IContract.IView> implements IContract.IPresenter{

    private IModel iModel;

    @Override
    protected void initModel() {
        iModel = new IModel();
    }

    @Override
    public void getLoginData(String phone, String pwd) {
        iModel.getLoginData(phone, pwd, new IContract.IModel.IModelCallBack() {
            @Override
            public void onLoginSeccess(LoginBean loginBean) {

            }

            @Override
            public void onLoginFrecter(Throwable throwable) {

            }

            @Override
            public void onRegisterSeccess(RegisterBean registerBean) {

            }

            @Override
            public void onRegisterFrecter(Throwable throwable) {

            }
        });
    }

    @Override
    public void getRegisterData(String phone, String pwd) {
        iModel.getRegisterData(phone, pwd, new IContract.IModel.IModelCallBack() {
            @Override
            public void onLoginSeccess(LoginBean loginBean) {
                view.onLoginSeccess(loginBean);
            }

            @Override
            public void onLoginFrecter(Throwable throwable) {
                view.onLoginFrecter(throwable);
            }

            @Override
            public void onRegisterSeccess(RegisterBean registerBean) {
                view.onRegisterSeccess(registerBean);
            }

            @Override
            public void onRegisterFrecter(Throwable throwable) {
                view.onRegisterFrecter(throwable);
            }
        });
    }
}
