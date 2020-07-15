package base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class DataResult<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1293478636804487268L;

    public static final DataResult SUCCESS = new DataResult("000000", "success");

    public static final DataResult FALSE = new DataResult("000001", "error");

    public static final DataResult NO_ACCOUNT = new DataResult("100001", "no account");


    public DataResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public DataResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public DataResult(Object data) {
        this.code = "000000";
        this.message = "success";
        this.data = data;
    }

    /**
     * 成功
     *
     * @param o
     * @param <O>
     * @return
     */
    public static <O> DataResult<O> SUCCESS(O o) {
        DataResult<O> r = new DataResult<>();
        r.setCode("000000");
        r.setMessage("success");
        r.setData(o);
        return r;
    }

    public DataResult() {

    }

    /**
     * 信息
     */
    private String message = null;


    private String code = null;

    /**
     * 结果
     */
    private Object data = null;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
