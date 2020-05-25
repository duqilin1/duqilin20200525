package movie.bw.com.duqilin20200525.model.bean;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:15
 *@Description:${DESCRIPTION}
 * */
public class RegisterBean {

    /**
     * message : 该手机号已注册，不能重复注册！
     * status : 1001
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
