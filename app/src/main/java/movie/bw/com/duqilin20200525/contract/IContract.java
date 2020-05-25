package movie.bw.com.duqilin20200525.contract;

import movie.bw.com.duqilin20200525.model.bean.LoginBean;
import movie.bw.com.duqilin20200525.model.bean.RegisterBean;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:25
 *@Description:${DESCRIPTION}
 * */
public interface IContract {
     interface IView{
         void onLoginSeccess(LoginBean loginBean);
         void onLoginFrecter(Throwable throwable);

         void onRegisterSeccess(RegisterBean registerBean);
         void onRegisterFrecter(Throwable throwable);
     }

     interface IPresenter{
         void getLoginData(String phone,String pwd);

         void getRegisterData(String phone,String pwd);
     }

     interface IModel{
         void getLoginData(String phone,String pwd,IModelCallBack iModelCallBack);
         void getRegisterData(String phone,String pwd,IModelCallBack iModelCallBack);

         interface IModelCallBack{
             void onLoginSeccess(LoginBean loginBean);
             void onLoginFrecter(Throwable throwable);

             void onRegisterSeccess(RegisterBean registerBean);
             void onRegisterFrecter(Throwable throwable);
         }
     }
}
