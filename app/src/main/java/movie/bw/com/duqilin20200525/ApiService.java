package movie.bw.com.duqilin20200525;

import io.reactivex.Observable;
import movie.bw.com.duqilin20200525.model.bean.HomeBean;
import movie.bw.com.duqilin20200525.model.bean.LoginBean;
import movie.bw.com.duqilin20200525.model.bean.RegisterBean;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:18
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {
    @POST(MyApi.LOGINURL)
    @FormUrlEncoded
    Observable<LoginBean> LOGIN_BEAN_OBSERVABLE(@Field("phone")String phone,@Field("pwd")String pwd);

    @POST(MyApi.REGISTERURL)
    @FormUrlEncoded
    Observable<RegisterBean> REGISTER_BEAN_OBSERVABLE(@Field("phone")String phone, @Field("pwd")String pwd);
}
