package movie.bw.com.duqilin20200525.base;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:16
 *@Description:${DESCRIPTION}
 * */
public abstract class BasePresenter<V> {
     protected V view;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();

    public void attach(V view) {
        this.view = view;
    }

    public void detach(){
        view = null;
    }
}
