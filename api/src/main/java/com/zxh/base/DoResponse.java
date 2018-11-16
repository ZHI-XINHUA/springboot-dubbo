package com.zxh.base;

import java.io.Serializable;

/**
 * Created by xh.zhi on 2018-11-16.
 * 相应信息
 */
public class DoResponse implements Serializable {

    private static final long serialVersionUID = -1714206079704678663L;
    /**响应状态**/
    private String code;

    /**响应结果**/
    private Object result;

    /**备注**/
    private String memo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DoResponse{" +
                "code='" + code + '\'' +
                ", result=" + result +
                ", memo='" + memo + '\'' +
                '}';
    }
}
