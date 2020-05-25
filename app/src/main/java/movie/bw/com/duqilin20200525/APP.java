package movie.bw.com.duqilin20200525;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:32
 *@Description:${DESCRIPTION}
 * */
public class APP extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
