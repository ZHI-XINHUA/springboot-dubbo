package com.annotation.base;

import java.io.Serializable;

/**
 * 请求信息
 */
public class DoRequest implements Serializable {
    private static final long serialVersionUID = -4533130593727048194L;

    /**请求名称**/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
