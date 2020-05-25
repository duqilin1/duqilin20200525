package movie.bw.com.duqilin20200525.model.bean;

/*
 *@auther:杜其林
 *@Date: 2020/5/25
 *@Time:16:15
 *@Description:${DESCRIPTION}
 * */
public class HomeBean {

    /**
     * headPath : http://mobile.bwstudent.com/images/small/head_pic/2020-05-25/20200525160555.jpg
     * message : 上传成功
     * status : 0000
     */

    private String headPath;
    private String message;
    private String status;

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

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
