package movie.bw.com.duqilin20200525.util;

import java.util.concurrent.TimeUnit;

import movie.bw.com.duqilin20200525.ApiService;
import movie.bw.com.duqilin20200525.MyApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:18
 *@Description:${DESCRIPTION}
 * */
public class NetUril {

    private final ApiService apiService;

    public NetUril() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
                .readTimeout(5, TimeUnit.SECONDS).writeTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder().client(httpClient).addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).baseUrl(MyApi.URL).build();

        apiService = retrofit.create(ApiService.class);
    }

    public static NetUril getInstance() {
        return SingleHolder.NET_URIL;
    }

    private static class SingleHolder{
        protected static final NetUril NET_URIL = new NetUril();
    }

    public ApiService getApiService() {
        return apiService;
    }
}
